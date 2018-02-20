/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package sneipl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

import ecst.ECSTNamedNode;
import ecst.ECSTNode;
import ecst.ECSTNodeFactory;
import ecst.universalNodes.ConcreteUnitDecl;
import ecst.universalNodes.InterfaceUnitDecl;
import ecst.universalNodes.Name;
import ecst.universalNodes.Argument;
import ecst.universalNodes.ArgumentList;
import ecst.universalNodes.FunctionCall;
import ecst.universalNodes.FunctionDecl;
import ecst.universalNodes.PackageDecl;
import ecst.universalNodes.RewrittenRetType;
import ecst.universalNodes.UnknownRetType;
import gdn.GDN;
import gdn.GDNFuncNode;
import gdn.GDNNode;
import gdn.GDNNodeType;
import gdn.GDNLinkType;
import gdn.GDNVarNode;
import util.LOG;

/**
 * 
 * FuncCallResolver creates CALLS links that connects
 * FUNCTION_DECLs. From created CALLS links it induces
 * REFERENCES links for CUDs/IUDs (classes/interfaces) 
 * and PD (packages)
 * 
 * @author svc
 */
public class FuncCallResolver {
	
	private String xmlFile;
	private GDN gdn;
	private ImportList impList;
	
	// src and dst node for CALLS link
	private GDNFuncNode caller;
	private GDNFuncNode called;
	
	// CUD or PD where the caller/called function is defined
	private GDNNode callerContext;
	private GDNNode calledContext;
	private GDNNode objectType;
	
	public static int CALLS_RESOLVED = 0;
	public static int CALLS_UNRESOLVED = 0;
	public static int TOTAL_FUNCTION_CALLS = 0;
	
	public static int CALLS_HARD_TO_MATCH_RESOLVED = 0;
	public static int CALLS_HARD_TO_MATCH_UNRESOLVED = 0;
	
	public FuncCallResolver(String xmlFile, GDN gdn, ImportList impList) {
		this.xmlFile = xmlFile;
		this.gdn = gdn;
		this.impList = impList;	
	}
	
	
	public void resolve(FunctionCall funcCallNode) {
		// initialization
		caller = null;
		called = null;
		callerContext = null;
		calledContext = null;
		objectType = null;
		funcCallNode.resetName();
		
		++TOTAL_FUNCTION_CALLS;
		
		// deduce 
		caller = deduceCaller(funcCallNode);
		if (caller == null) {
			callerContext = resolveFunctionContext(funcCallNode);
		}
		else {
			callerContext = resolveFunctionContext(caller);
		}
		
		if (callerContext == null) {
			LOG.error("Unable to find CUD/PD where the function that contains function call is defined " + 
		              funcCallNode.getName() + ", " + xmlFile);
		}
		
		LinkedList<GDNFuncNode> calledSet = deduceCalled(funcCallNode);
		
		if (calledSet != null && calledSet.size() > 0) {
			
			if (calledSet.size() == 1) {
				called = calledSet.get(0);
				calledContext = resolveFunctionContext(called);
				createLinks();
				CALLS_RESOLVED++;
				
				if (called.isHardToMatch()) {
					CALLS_HARD_TO_MATCH_RESOLVED++;
				}
			}
			else {
				CALLS_UNRESOLVED++;
				GDNFuncNode firstCall = calledSet.get(0);
				GDNNode parent = gdn.getContainedIn(firstCall);
				
				/*
				 * if a function call cannot be uniquely resolved, but all candidates are
				 * functions defined in the same scope (CUD/PD) then REFERNCES link between 
				 * caller and called context can be established
				 */
				boolean allCallsInSameScope = true;
				for (int i = 1; i < calledSet.size(); i++) {
					if (gdn.getContainedIn(calledSet.get(i)) != parent) {
						allCallsInSameScope = false;
					}
				}
				
				boolean atLeastOneHardToMatch = false;
				for (int i = 0; i < calledSet.size(); i++) {
					if (calledSet.get(i).isHardToMatch())
						atLeastOneHardToMatch = true;
				}
				
				if (atLeastOneHardToMatch) {
					CALLS_HARD_TO_MATCH_UNRESOLVED++;
					/*
					System.out.println("Hard to match unresolved... ");
					if (callerContext == null)
						System.out.println("Caller context is null");
					else
						System.out.println("Caller context: " + callerContext.getName());
					
					System.out.println("Candidates... ");
					for (int i = 0; i < calledSet.size(); i++) {
						System.out.println(calledSet.get(i).getName());
					}
					*/
				}
				
				if (allCallsInSameScope) {
					if (objectType != null)
						parent = objectType;
					
					if (!gdn.srcExtendsDst(callerContext, parent)) {
						createInducedLinks(callerContext, parent, "INDUCED_FUNCTION_CALL_MULTICANDS_SAME_SCOPE_" + callerContext.getCompactName() + "_" + funcCallNode.getName());
					}
				}
			}
		}
		
		// replace FUNCTION_CALL subtree with return type of the function
		ECSTNode funcCallParent = funcCallNode.getParent();
		if (called == null) {
			funcCallParent.replaceChild(funcCallNode, new UnknownRetType(funcCallParent));
		} else {
			funcCallParent.replaceChild(funcCallNode, new RewrittenRetType(called.getRetType(), called.getRetTypeAsGDNNode(), funcCallParent));
		}
	}
	
	/**
	 * Odredjuje SRC cvor za CALLS link (SRC --> DST) sto ce biti kreiran
	 * 
	 * @param funcCallNode - okidac
	 * @return
	 */
	private GDNFuncNode deduceCaller(FunctionCall funcCallNode) {
		ECSTNode tmp = funcCallNode.getParent();
		while (tmp != null) {
			
			if (tmp instanceof FunctionDecl) {
				FunctionDecl callerDecl = (FunctionDecl) tmp;
				caller = gdn.findFunction(callerDecl.getCanonicalName());
				if (caller == null) {
					LOG.error("FuncCallResolver, unable to find GDN node representing function " + 
					          callerDecl.getCanonicalName() + ", " +
					          xmlFile
					);
				}
				
				return caller;
			}
			
			tmp = tmp.getParent();
		}
		
		return caller;
	}
	
	
	/**
	 * Vraca UNIT/PACKAGE u kome se nalazi FUNCTION_DECL koji sadrzi
	 * FUNCTION_CALL koji je okinuo akciju
	 * 
	 * @return
	 */
	private GDNNode resolveFunctionContext(GDNFuncNode func) {
		GDNNode ha = gdn.getContainedIn(func);
		while (ha != null) {
			if (ha.getType() == GDNNodeType.UNIT || ha.getType() == GDNNodeType.PACKAGE)
				return ha;
		
			ha = gdn.getContainedIn(ha);
		}
		
		return ha;
	}
	
	
	
	private GDNNode resolveFunctionContext(FunctionCall func) {
		ECSTNode tmp = func.getParent();
		while (tmp != null) {
			if (tmp instanceof ConcreteUnitDecl || tmp instanceof InterfaceUnitDecl || tmp instanceof PackageDecl) {
				String canonicalName = ((ECSTNamedNode) tmp).getCanonicalName();
				GDNNode callerContext = gdn.findNode(canonicalName, false);
				if (callerContext == null) {
					LOG.error("FuncCallResolver, unable to find GDN node representing " + canonicalName + ", " + xmlFile);
				}
				return callerContext;
			}
			
			tmp = tmp.getParent();
		}
		
		return null;
	}
	
	
	/**
	 * 
	 * Odredjuje DST cvor za CALLS link (SRC --> DST) sto ce biti kreiran
	 * 
	 * @param funcCallNode
	 * @return
	 */
	private LinkedList<GDNFuncNode> deduceCalled(FunctionCall funcCallNode) {
		
		// determine function name & number of arguments
		
		ArgumentList funcArgs = null;
		Name funcName = null;
		
		LinkedList<ECSTNode> funcCallChilds = funcCallNode.getChilds();
		for (int i = 0; i < funcCallChilds.size(); i++) {
			ECSTNode tmp = funcCallChilds.get(i);
			if (tmp instanceof ArgumentList) {
				if (funcArgs == null)
					funcArgs = (ArgumentList) tmp;
			}
			else
			if (tmp instanceof Name) {
				if (funcName == null)
					funcName = (Name) tmp;
			}
			
			if (funcName != null && funcArgs != null)
				break;
			
		}
		
		// 14.10.2010, possible (Collections.<String,String>emptyMap();)
		if (funcName == null)
			return null;
		
		String functionName = funcName.dfsSubtree(true);
	
		int numArgs = 0;
		if (funcArgs != null) {
			LinkedList<ECSTNode> funcArgsChilds = funcArgs.getChilds();
			for (int i = 0; i < funcArgsChilds.size(); i++) {
				ECSTNode tmp = funcArgsChilds.get(i);
				if (tmp instanceof Argument) {
					++numArgs;
				}
			}
		}
		
		LinkedList<GDNFuncNode> calledCandidates 
			= getCandidatesForDst(funcCallNode, funcName, funcArgs, functionName, numArgs);
		
		if (calledCandidates == null)
			return null;
		else
		if (calledCandidates.size() == 0)
			return null;
		else
		if (calledCandidates.size() == 1)
			return calledCandidates;
		else {
			LinkedList<GDNFuncNode> f = filterCandidates(calledCandidates, funcArgs);
			return f;
		}	
	}
	
	private LinkedList<GDNFuncNode> filterCandidates(LinkedList<GDNFuncNode> cands, ArgumentList funcArgs) {
		
		if (funcArgs == null)
			return cands;
		
		LinkedList<GDNFuncNode> fCands = new LinkedList<GDNFuncNode>();
		
		String[] argTypes = new String[funcArgs.getChilds().size()];
		
		LinkedList<ECSTNode> funcArgsChilds = funcArgs.getChilds();
		for (int i = 0; i < funcArgsChilds.size(); i++) {
			ECSTNode tmp = funcArgsChilds.get(i);
			if (tmp instanceof Argument) {
				Argument a = (Argument) tmp;
				if (a.getChilds().size() == 1) {
					if (a.getChilds().get(0).getChilds().size() == 1) {
						String argName = a.getName();
						SymbolTableSearch sts = new SymbolTableSearch(gdn, callerContext, funcArgs);
						argTypes[i] = sts.searchTypeName(argName);
					}
				}
			} 
		}
		
		for (int i = 0; i < cands.size(); i++) {
			GDNFuncNode cand = cands.get(i);
			LinkedList<String> params = cand.getParams();
			
			boolean match = true;
			for (int j = 0; j < params.size(); j++) {
				String param = params.get(j);
				
				if (argTypes[j] != null) {
					if (param.compareTo(argTypes[j]) != 0) {
						match = false;
					}
				}
			}
			
			if (match) {
				fCands.add(cand);
			}
		}
		
		if (fCands.size() == 1)
			return fCands;
		else
			return cands;
	}
	
	
	/**
	 * 
	 * Vraca listu kandidata za DST funkciju 
	 * 
	 * @param funcCallNode
	 * @param functionName
	 * @param numArgs
	 * @return
	 */
	private LinkedList<GDNFuncNode> getCandidatesForDst(
		FunctionCall funcCallNode, 
		Name funcNameNode,
		ArgumentList funcArgsNode,
		String functionName, 
		int numArgs
	) 
	{
		LinkedList<GDNFuncNode> calledCandidates = new LinkedList<GDNFuncNode>();
	
		if (functionName.startsWith("."))
			functionName = functionName.substring(1);
		
		if (functionName.endsWith("."))
			functionName = functionName.substring(0, functionName.length() - 1);
		
		int numDots = 0;
		for (int i = 0; i < functionName.length(); i++) {
			if (functionName.charAt(i) == '.') {
				numDots++;
			}
		}
		
		if (numDots == 0) {
			//System.out.println("numDots == 0");
			// case 1.1: function declared in this CUD
			calledCandidates = _findFunctionDefinition(callerContext, functionName, numArgs);
			
			// case 1.2: function imported 
			if (calledCandidates.size() == 0) {
				calledCandidates = impList.selectFunctions(functionName, numArgs);
			}
			
			// case 1.3 constructor call
			TypeResolver tres = new TypeResolver(xmlFile, gdn, impList);
			GDNNode gdnUnit = tres.deduceType(functionName, funcNameNode);
			if (gdnUnit != null) {
				return _findFunctionDefinition(gdnUnit, functionName, numArgs);			
			}
			
			return calledCandidates;
		}
		else
		if (numDots == 1) {
			// cases: "object.method" "class.staticMethod"
			//   "object.method"
			//   "class.staticMethod"
			//   "rewrittenType.method"
			ECSTNode rew = rewrittenName(funcCallNode);
			
			if (rew != null) {
				if (rew instanceof UnknownRetType) {
					return null;
				}
				
				RewrittenRetType rrt = (RewrittenRetType) rew;
				if (rrt.getReturnType() == null) {
					String typeName = rrt.getToken();
					TypeResolver tres = new TypeResolver(xmlFile, gdn, impList);
					GDNNode gdnUnit = tres.deduceType(typeName, funcNameNode);
					objectType = gdnUnit;                                                      
					if (gdnUnit != null) {
						String methodName = formRewrittenMethodName(funcNameNode);
						if (methodName.startsWith("."))
							methodName = methodName.substring(1);
					
						createInducedLinks(callerContext, gdnUnit, "INDUCED_FUNCTION_CALL_RET_TYPE_1");
						return findFunctionDefinition(gdnUnit, methodName, numArgs);
					} 
						
					return null;
				}
				
				objectType = rrt.getReturnType();                                        
				String methodName = formRewrittenMethodName(funcNameNode);
				if (methodName.startsWith("."))
					methodName = methodName.substring(1);
				
				createInducedLinks(callerContext, rrt.getReturnType(), "INDUCED_FUNCTION_CALL_RET_TYPE_2");
				return findFunctionDefinition(rrt.getReturnType(), methodName, numArgs);
			}
			
			String methodName = functionName.substring(functionName.indexOf(".") + 1);
			String object = functionName.substring(0, functionName.indexOf("."));
			
			// check if object is class-level entity
			TypeResolver tres = new TypeResolver(xmlFile, gdn, impList);
			GDNNode gdnUnit = tres.deduceType(object, funcNameNode);
			if (gdnUnit != null) {
				createInducedLinks(callerContext, gdnUnit, "INDUCED_STATIC_FUNCTION_CALL");
				return _findFunctionDefinition(gdnUnit, methodName, numArgs);
			}
			
			// if it is not class level entity, then it is a variable
			// use symbolTable to find type
			SymbolTableSearch sts = new SymbolTableSearch(gdn, callerContext, funcCallNode);
			objectType = sts.searchType(object);
			if (objectType != null) {
				createInducedLinks(callerContext, objectType, "INDUCED_NON_STATIC_FUNCTION_CALL");
				return findFunctionDefinition(objectType, methodName, numArgs);
			} 
			
			return null;
		} else {
			int lastDot = functionName.lastIndexOf(".");
			String methodName = functionName.substring(lastDot + 1);
			String gdnName = functionName.substring(0, lastDot);
			
			// handling constructors calls first
			GDNNode gdnNode = gdn.findNode(functionName, false);
			if (gdnNode != null) {
				return _findFunctionDefinition(gdnNode, methodName, numArgs);			
			}
			
			gdnNode = gdn.findNode(gdnName, false);
			objectType = gdnNode;                                                          
			if (gdnNode != null) {
				if (gdnNode instanceof GDNVarNode) {
					createInducedLinks(callerContext, gdnNode, "FUNCTION_CALL_ON_VAR_FROM_OTHER_CU");
					
					GDNNode gdnNodeType = ((GDNVarNode) gdnNode).getVarTypeAsGDN();
					objectType = gdnNodeType;
					if (gdnNodeType != null) {
						createInducedLinks(callerContext, gdnNodeType,
							"INDUCED_DIRECT_FUNCTION_CALL{" + functionName + "}"
						);
						
						return findFunctionDefinition(gdnNodeType, methodName, numArgs);
					}
				}
				
				return findFunctionDefinition(gdnNode, methodName, numArgs);
			} else {
				// complex function call - via sequence of (UnitName|VarName).VarName.VarName.VarName...VarName.functionName
				
				// step 1 - get first token
				String varOrUnit = functionName.substring(0, functionName.indexOf("."));
				
				// first token -- unit or variable?
				TypeResolver typeResolver = new TypeResolver(xmlFile, gdn, impList);
				GDNNode firstTokenGDN = typeResolver.deduceType(varOrUnit, funcNameNode);
				if (firstTokenGDN == null) {
					SymbolTableSearch sts = new SymbolTableSearch(gdn, callerContext, funcCallNode);
					firstTokenGDN = sts.searchType(varOrUnit);
				}
				
				if (firstTokenGDN != null) {
					// induce references link
					createInducedLinks(callerContext, firstTokenGDN, "INDUCED_COMPLEX_NAME_FUNCTION_CALL");
					
					StringTokenizer st = new StringTokenizer(gdnName, ".");
					st.nextToken(); // eat first token
					
					GDNNode currentScope = firstTokenGDN;
					while (st.hasMoreTokens() && currentScope != null) {
						String varName = st.nextToken();
						
						// find varName in currentScope
						GDNVarNode varGDN = gdn.findGlobalVariable(currentScope, varName);
						if (varGDN != null) {
							currentScope = varGDN.getVarTypeAsGDN();
							if (currentScope != null)
								createInducedLinks(callerContext, currentScope, "INDUCED_COMPLEX_NAME_FUNCTION_CALL");
						} else {
							currentScope = null;
						}
					}
					
					if (currentScope != null) {
						return findFunctionDefinition(currentScope, methodName, numArgs);
					}
				}
			}
			
			return null;
		}
	}
	
	
	public void dumpCandidates(LinkedList<GDNFuncNode> cands) {
		if (cands.size() == 0) {
			System.out.println("Candidates empty");
		}
		else {
			System.out.println("Candidates... ");
			for (int i = 0; i < cands.size(); i++) {
				System.out.println(cands.get(i).getName());
			}
		}
	}
	
	/**
	 * Proverava da li je ime FUNCTION_CALL-a nastalo prepisivanjem (tree rewrite
	 * nekog nad nekim drugim FUNCTION_CALL-om)
	 * 
	 * @param funcCallNode
	 * @return
	 */
	private ECSTNode rewrittenName(FunctionCall funcCallNode) {
		LinkedList<ECSTNode> queue = new LinkedList<ECSTNode>();
		
		Name funcCallName = null;
		LinkedList<ECSTNode> fcChilds = funcCallNode.getChilds();
		for (int i = 0; i < fcChilds.size(); i++) {
			if (fcChilds.get(i) instanceof Name) {
				funcCallName = (Name) fcChilds.get(i);
			}
		}
		
		if (funcCallName == null) {
			LOG.error("FuncCallResolver, rewrittenName, unable to locate NAME for FUNCTION_CALL, "
					  + funcCallNode.getName() + ", " + xmlFile);
			return null;
		}
		
		queue.add(funcCallName);
		
		while (queue.size() > 0) {
			ECSTNode currentNode = queue.removeFirst();
			
			if (currentNode instanceof RewrittenRetType || currentNode instanceof UnknownRetType) {
				return currentNode;
			}
			
			LinkedList<ECSTNode> childs = currentNode.getChilds();
			for (int i = 0; i < childs.size(); i++) {
				queue.addLast(childs.get(i));
			}
		}
		
		return null;
	}
	
	
	private String formRewrittenMethodName(Name funcNameNode) {
		StringBuilder sb = new StringBuilder();
		
		LinkedList<ECSTNode> childs = funcNameNode.getChilds();
		
		for (int i = 0; i < childs.size(); i++) {
			sb.append(_tmpdfs(childs.get(i)));
		}
		
		return sb.toString();
	}
	
	private String _tmpdfs(ECSTNode node) {
		StringBuilder sb = new StringBuilder();
		LinkedList<ECSTNode> childs = node.getChilds();
		
		for (int i = 0; i < childs.size(); i++) {
			sb.append(_tmpdfs(childs.get(i)));
		}
		
		if (!ECSTNodeFactory.universalNode(node.getToken()) &&
		    ! (node instanceof RewrittenRetType) 		
		) 
		{
			sb.insert(0, node.getToken());
		}
		
		return sb.toString();
	}
	
	private LinkedList<GDNFuncNode> findFunctionDefinition(GDNNode packageOrUnit, String funcName, int numArgs) {
		LinkedList<GDNFuncNode> candidates = rapidTypeAnalysis(callerContext, packageOrUnit, funcName, numArgs);
		if (candidates == null || candidates.size() == 0) {
			candidates = _findFunctionDefinition(packageOrUnit, funcName, numArgs);
		}
		
		return candidates;
	}
	
	private LinkedList<GDNFuncNode> rapidTypeAnalysis(GDNNode callerContext, GDNNode calledContext, String funcName, int numArgs) {
		LinkedList<GDNNode> calledContextCandidates = new LinkedList<GDNNode>();
		
		HashSet<GDNNode> instantiatesSet = callerContext.getInstantiatesSet();
		Iterator<GDNNode> isit = instantiatesSet.iterator();
		
		while (isit.hasNext()) {
			GDNNode inst = isit.next();
			if (gdn.srcExtendsOrImplementsDst(inst, calledContext)) {
				calledContextCandidates.add(inst);
			}
		}
		
		LinkedList<GDNFuncNode> candidates = new LinkedList<GDNFuncNode>();
		for (int i = 0; i < calledContextCandidates.size(); i++) {
			GDNNode cContext = calledContextCandidates.get(i);
			candidates.addAll(_findFunctionDefinition(cContext, funcName, numArgs));
		}
		
		return null;
	}
	
	
	/**
	 * Trazi definiciju funkcije po imenu i broju parametara u zadatom paketu ili CUD-u.
	 * Ako je CUD u pitanju pretraga se propagira po EXTENDS relaciji 
	 * 
	 * Vraca listu GDN funkcijiskih cvorova koji zadovoljavaju uslove, inace
	 * praznu listu
	 * 
	 * @param packageOrUnit
	 * @return
	 */
	private LinkedList<GDNFuncNode> _findFunctionDefinition(GDNNode packageOrUnit, String funcName, int numArgs) {
		LinkedList<GDNFuncNode> candidates = __findFunctionDefinition(packageOrUnit, funcName, numArgs);
	
		if (candidates.size() == 0) {
			if (packageOrUnit.getType() == GDNNodeType.UNIT) {
				// code handling multiple inheritance
				LinkedList<GDNNode> baseUnits = gdn.getBaseUnits(packageOrUnit);
				while (baseUnits.size() > 0) {
					GDNNode baseUnit = baseUnits.removeFirst();
					candidates = __findFunctionDefinition(baseUnit, funcName, numArgs);
					if (candidates.size() > 0)
						break;
					
					LinkedList<GDNNode> expand = gdn.getBaseUnits(baseUnit);
					for (int i = 0; i < expand.size(); i++) {
						baseUnits.addLast(expand.get(i));
					}
				}
			}
		}
		
		return candidates;
	}
	
	/**
	 * Trazi definiciju funkcije odredjenu sa funcName i numArgs u zadatom GDN cvoru (paketu ili unit-u)
	 * 
	 * @param packageOrUnit
	 * @param funcName
	 * @param numArgs
	 * @return
	 */
	private LinkedList<GDNFuncNode> __findFunctionDefinition(GDNNode packageOrUnit, String funcName, int numArgs) {
		LinkedList<GDNFuncNode> candidates = new LinkedList<GDNFuncNode>();
		
		LinkedList<GDNNode> containsList = gdn.getContains(packageOrUnit);
		for (int i = 0; i < containsList.size(); i++) {
			GDNNode tmp = containsList.get(i);
			if (tmp instanceof GDNFuncNode) {
				GDNFuncNode fun = (GDNFuncNode) tmp;
				if (fun.getCompactName().compareTo(funcName) == 0
					&& fun.getParams().size() == numArgs) 
				{
					candidates.add(fun);
				}
			}
		}
		
		return candidates;
	}
	
	private void createInducedLinks(GDNNode src, GDNNode dst, String explanation) {
		if (src == null || dst == null)
			return;
		
		GDNNode srcUnit = gdn.getUnitOrInterfaceFor(src);
		GDNNode dstUnit = gdn.getUnitOrInterfaceFor(dst);
		if (dstUnit != null && srcUnit != null && srcUnit != dstUnit && !gdn.srcExtendsDst(src, dst)) {
			gdn.newLink(srcUnit, dstUnit, GDNLinkType.REFERENCES, explanation);
		}
			
		GDNNode srcPack = null;
		if (srcUnit != null)
			srcPack = gdn.getPackageFor(srcUnit);
		else
			srcPack = gdn.getPackageFor(src);
		
		GDNNode dstPack = null;
		if (dstUnit != null)
			dstPack = gdn.getPackageFor(dstUnit);
		else
			dstPack = gdn.getPackageFor(dst);
		
		if (dstPack != null && srcPack != null && srcPack != dstPack) {
			gdn.newLink(srcPack, dstPack, GDNLinkType.REFERENCES, explanation);
		}
	}
	
	private void createLinks() {
		if (caller != null && called != null) {
			// function PackageA.UnitA.FuncA calls PackageB.UnitB.FuncB
			gdn.newLink(caller, called, GDNLinkType.CALLS, "FUNCTION_CALL");
			
			GDNNode retType = called.getRetTypeAsGDNNode();
			if (retType != null) {
				createInducedLinks(callerContext, retType, "FUNCTION_CALL_INDUCED_FROM_RET_TYPE");
			}
			
			if (objectType != null)
				calledContext = objectType;
			
			// induce references links UnitA --> UnitB and PackageA --> PackageB
			createInducedLinks(
				callerContext, calledContext, 
				"INDUCED_DIRECT_FUNCTION_CALL{" + caller.getCompactName() + " --> " + called.getCompactName() + "}"
			);
					
			// function PackageA.UnitA.FuncA calls PackageB.UnitB.FuncB(param1, param2, ..., paramN)
			// Therefore, induce references links UnitA --> Type(param1), UnitA --> Type(param2), etc.
			GDNNode[] calledFunctionParamTypes = called.getParamTypes();
			for (int i = 0; i < calledFunctionParamTypes.length; i++) {
				GDNNode paramType = calledFunctionParamTypes[i];
				if (paramType != null) {
					createInducedLinks(
						callerContext, paramType, 
						"INDUCED_FROM_PARAMETER_TYPE{" + caller.getCompactName() + " --> " + called.getCompactName() + "}"
					);
				}
			}
		}
	}
}
