/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package sneipl;

import java.util.LinkedList;

import ecst.ECSTNamedNode;
import ecst.ECSTNode;
import ecst.universalNodes.BlockScope;
import ecst.universalNodes.ConcreteUnitDecl;
import ecst.universalNodes.FunctionCall;
import ecst.universalNodes.FunctionDecl;
import ecst.universalNodes.InterfaceUnitDecl;
import ecst.universalNodes.Name;
import ecst.universalNodes.PackageDecl;
import ecst.universalNodes.Type;
import gdn.GDN;
import gdn.GDNFuncNode;
import gdn.GDNLinkType;
import gdn.GDNNode;
import gdn.GDNNodeType;
import gdn.GDNVarNode;
import util.LOG;

public class NameResolver {

	private String xmlFile;
	private GDN gdn;
	private ImportList impList;
		
	private GDNNodeType[] gvArr = {GDNNodeType.GLOBAL_VAR}; 
	
	public NameResolver(String xmlFile, GDN gdn, ImportList impList) {
		this.xmlFile = xmlFile;
		this.gdn = gdn;
		this.impList = impList;	
	}
	
	private FunctionDecl funcThatReferenceName(Name nameNode) {
		ECSTNode tmp = nameNode.getParent();
		while (tmp != null) {
			if (tmp instanceof FunctionDecl)
				return (FunctionDecl) tmp;
			
			tmp = tmp.getParent();
		}
		
		return null;
	}
	
	
	public void resolve(Name nameNode) {
		final String name = nameNode.getName();
	
		// seems strange, but some variables can be called NAME
		if (name.length() == 0) {
			return;
		}
		
		FunctionDecl funcScope = funcThatReferenceName(nameNode);
		
		// nothing interesting here
		if (funcScope == null) {
			accessOutOfFunction(name, nameNode);
			return;
		}
		
		// check if NAME is locally declared, if yes skip
		boolean localName = locallyDeclaredName(name, nameNode);
		if (localName)
			return;
		
		GDNFuncNode funcScopeGDN = gdn.findFunction(funcScope.getCanonicalName());
		if (funcScopeGDN == null) {
			LOG.error("NameResolver, unable to find GDN node for function " 
					  + funcScope.getCanonicalName() + ", " + xmlFile);
			return;
		}
		
		GDNNode unitOrPackageScope = gdn.getUnitFor(funcScopeGDN);
		if (unitOrPackageScope == null) {
			unitOrPackageScope = gdn.getPackageFor(funcScopeGDN);
			if (unitOrPackageScope == null) {
				GDNNode interfaceScope = gdn.getUnitOrInterfaceFor(funcScopeGDN);
				if (interfaceScope == null)
					LOG.error("Name resolver, unable to find CUD/IUD/PD for function " 
							  + funcScope.getCanonicalName() + ", " + xmlFile);
				
				return;
			}
		}
		
		boolean accessCreated = false;
		LinkedList<GDNFuncNode> fCand = new LinkedList<GDNFuncNode>();
		
		// search among global variables in first enclosing unit or package scope
		LinkedList<GDNNode> conts = gdn.getContains(unitOrPackageScope);
		for (int i = 0; i < conts.size(); i++) {
			GDNNode tmp = conts.get(i);
			if (tmp.getType() == GDNNodeType.GLOBAL_VAR) {
				if (tmp.getCompactName().compareTo(name) == 0) {
					createAccessLink(funcScopeGDN, tmp);
					accessCreated = true;
					break;
				}
			}
			/*  REFACTORED, check all variables first, then functions
			else
			if (tmp.getType() == GDNNodeType.FUNCTION) {
				if (fCand == null)
					fCand = checkIfFunction((GDNFuncNode) tmp, nameNode, name);
			}
			*/
		}
		
		if (accessCreated) 
			return;
		
		// Not found among global variables in first enclosing unit or package scope
		// Use symbol table to find the definition of the symbol
		SymbolTableSearch sts = new SymbolTableSearch(gdn, unitOrPackageScope, nameNode);
		GDNNode nameGDNType = sts.searchType(name);
		if (nameGDNType != null) {
			createAccessLink(funcScopeGDN, sts.getGDNForLastSearchedSymbol());
			induceReferencesLinks(unitOrPackageScope, nameGDNType, "INDUCED_ACCESS_TYPE_AFTER_SYMBOL_TABLE_SEARCH");
			return;
		}
		
		for (int i = 0; i < conts.size(); i++) {
			GDNNode tmp = conts.get(i);
			if (tmp.getType() == GDNNodeType.FUNCTION) {
				GDNFuncNode func = checkIfFunction((GDNFuncNode) tmp, nameNode, name);
				if (func != null)
					fCand.addLast(func);
			}
		}
	
		// see imports (directly imported variable)
		if (!accessCreated) {
			LinkedList<GDNNode> impGlVrs = impList.selectCandidates(name, gvArr);
			
			if (impGlVrs != null) {
				if (impGlVrs.size() == 1) {
					createAccessLink(funcScopeGDN, impGlVrs.get(0));
					return;
				}
				else
				if (impGlVrs.size() >= 2) {
					StringBuilder sb = new StringBuilder();
					sb.append("NameResolver, imp. glob vars with the same name\n");
					for (int i = 0; i < impGlVrs.size(); i++)
						sb.append(impGlVrs.get(i).getName()).append("\n");
					sb.append("xml: ").append(xmlFile);
					LOG.error(sb.toString());
				}
				
				if (impGlVrs.size() > 0)
					return;
			} 
		}
		
		// simple (name without dots) or complex name (name with dots)?
		boolean complex = name.contains(".");
		if (!accessCreated && complex) {
			int lastDot = name.lastIndexOf(".");
			String dstScopeName = name.substring(0, lastDot);
			String varOrMethodName = name.substring(lastDot + 1);
			
			GDNNode dstScopeGDN = gdn.findNode(dstScopeName, false);
			if (dstScopeGDN != null) {
				if (dstScopeGDN.getType() == GDNNodeType.GLOBAL_VAR) {
					createAccessLink(funcScopeGDN, dstScopeGDN);
					
					// Now varOrMethodName is actually method name
					LinkedList<GDNFuncNode> fCandidates = new LinkedList<GDNFuncNode>();
					conts = gdn.getContains(dstScopeGDN);
					for (int i = 0; i < conts.size(); i++) {
						GDNNode tmp = conts.get(i);
						if (tmp.getType() == GDNNodeType.FUNCTION) {
							if (tmp.getCompactName().compareTo(varOrMethodName) == 0) {
								fCandidates.add((GDNFuncNode) tmp);
							}
						}
					}
					
					if (fCandidates.size() == 1) {
						createCallsLink(funcScopeGDN, fCandidates.get(0));
					} 
					else 
					if (fCandidates.size() > 1) {
						induceReferencesLinks(funcScopeGDN, dstScopeGDN, "INDUCED_CALLS_IN_NAME_RESOLVER");
					}
					
					return;
				}
				else 
				if (dstScopeGDN.isUnitOrInterfaceOrPackage()) {
					//System.out.println("====> " + name + ", " + funcScopeGDN.getCompactFuncName() + ", " + dstScopeGDN.getName() + ", " + dstScopeGDN.getType());
					GDNVarNode varGDN = gdn.findGlobalVariable(dstScopeGDN, varOrMethodName);
					if (varGDN != null) {
						createAccessLink(funcScopeGDN, varGDN);
						return;
					}
					else {
						// try to see if it is function
						LinkedList<GDNFuncNode> fCandidates = gdn.findFunctionsIn(dstScopeGDN, varOrMethodName);
						if (fCandidates.size() == 1) {
							createCallsLink(funcScopeGDN, fCandidates.get(0));
						}
						else
						if (fCandidates.size() > 1) {
							induceReferencesLinks(funcScopeGDN, dstScopeGDN, "INDUCED_CALLS_IN_NAME_RESOLVER");
						}
					}
				}
			}
 			else {
				LinkedList<GDNNode> imported = impList.selectCandidates(dstScopeName, gvArr);
				if (imported != null && imported.size() == 1) {
					createAccessLink(funcScopeGDN, imported.get(0));
				}
			}
		}
		
		if (!accessCreated) {
			possibleCallsLink(fCand, funcScopeGDN, unitOrPackageScope, nameNode, name);
		}
	}
	
	private void accessOutOfFunction(String name, Name nameNode) {
		
		ECSTNode enclosingScope = enclosingScopeForNameWithoutType(nameNode);
		if (enclosingScope == null)
			return; // skip what is already done by TypeHandler
				
		GDNNode src = gdn.findNode(((ECSTNamedNode) enclosingScope).getCanonicalName(), false);
		
		SymbolTableSearch sts = new SymbolTableSearch(gdn, src, nameNode);
		GDNNode nameGDNType = sts.searchType(name);
		if (nameGDNType != null) {
			induceReferencesLinks(src, nameGDNType, "INDUCED_ACCESS_TYPE_AFTER_SYMBOL_TABLE_SEARCH_ACCESS_OUT_OF_FUNCTION");
			return;
		}
		
		LinkedList<GDNNode> impGlVrs = impList.selectCandidates(name, gvArr);
		if (impGlVrs != null) {
			if (impGlVrs.size() == 1) {
				GDNNode dst = impGlVrs.get(0);
				if (src.getType() == dst.getType()) {
					gdn.newLink(src, dst, GDNLinkType.ACCESS, "(access out of function)");
				} else {
					GDNNode srcUnit = gdn.getUnitOrInterfaceFor(src);
					GDNNode dstUnit = gdn.getUnitOrInterfaceFor(dst);
					if (srcUnit != null && dstUnit != null && srcUnit != dstUnit && !gdn.srcExtendsDst(srcUnit, dstUnit)) {
						gdn.newLink(srcUnit, dstUnit, GDNLinkType.REFERENCES, "INDUCED_ACCESS_OUT_OF_FUNCTION");
					}
					
					GDNNode srcPackage = gdn.getPackageFor(src);
					GDNNode dstPackage = gdn.getPackageFor(dst);
					if (srcPackage != null && dstPackage != null && srcPackage != dstPackage) {
						gdn.newLink(srcPackage, dstPackage, GDNLinkType.REFERENCES, "INDUCED_ACCESS_OUT_OF_FUNCTION");
					}
				}
			}
			else
			if (impGlVrs.size() >= 2) {
				StringBuilder sb = new StringBuilder();
				sb.append("NameResolver, imp. glob vars with the same name\n");
				for (int i = 0; i < impGlVrs.size(); i++)
					sb.append(impGlVrs.get(i).getName()).append("\n");
				sb.append("xml: ").append(xmlFile);
				LOG.error(sb.toString());
			}
		}
	}
		
	private void possibleCallsLink(
		LinkedList<GDNFuncNode> fCand, 
		GDNFuncNode funcScopeGDN, 
		GDNNode unitOrPackageScope,
		Name nameNode,
		String name
	) 
	{
		// multiple candidates, we cannot do nothing
		if (fCand.size() > 1)
			return;
		
		// check if name is function name (M2/Delphi functions without parameters)
		if (fCand.size() == 1) {
			createCallsLink(funcScopeGDN, fCand.get(0));
			return;
		}
		
		unitOrPackageScope = gdn.getContainedIn(unitOrPackageScope);
		while (unitOrPackageScope != null) {
			LinkedList<GDNNode> conts = gdn.getContains(unitOrPackageScope);
			for (int i = 0; i < conts.size(); i++) {
				GDNNode tmp = conts.get(i);
				if (tmp.getType() == GDNNodeType.FUNCTION) {
					GDNFuncNode func = checkIfFunction((GDNFuncNode) tmp, nameNode, name);
					if (func != null) {
						fCand.add(func);
					}
				}
			}
			
			// multiple candidates, we cannot do nothing
			if (fCand.size() > 1)
				return;
			else
			if (fCand.size() == 1) {
				createCallsLink(funcScopeGDN, fCand.get(0));
				return;
			}
			
			unitOrPackageScope = gdn.getContainedIn(unitOrPackageScope);
		}
		
		LinkedList<GDNFuncNode> importedFuncs = impList.selectFunctions(name);
		if (importedFuncs == null || importedFuncs.size() != 1) {
			return;
		} else {
			createCallsLink(funcScopeGDN, importedFuncs.get(0));
		}
	}
	
	private GDNFuncNode checkIfFunction(GDNFuncNode f, Name nameNode, String name) {
		if (f.getCompactName().compareTo(name) == 0) {
			if (!(nameNode.getParent() instanceof FunctionCall)) {
				ECSTNode parent = nameNode.getParent();
				while (parent != null) {
					if (parent instanceof BlockScope)
						return f;
					else
					if (parent instanceof FunctionDecl)
						return null;
					
					parent = parent.getParent();
				}
			}
		}
		
		return null;
	}
	
	private ECSTNode enclosingScopeForNameWithoutType(ECSTNode startECSTNode) {
		ECSTNode tmp = startECSTNode.getParent();
		while (tmp != null) {
			if (tmp instanceof Type)
				return null;
			
			if (tmp instanceof ConcreteUnitDecl  || 
				tmp instanceof InterfaceUnitDecl || 
				tmp instanceof PackageDecl
			) 
			{
				return tmp; 
			}
			
			tmp = tmp.getParent();
		}
		
		return null;
	}
	
	private boolean locallyDeclaredName(String name, ECSTNode startEcstNode) {
		ECSTNode tmp = startEcstNode.getParent();
		while (tmp != null) {
			
			if (tmp instanceof BlockScope) {
				BlockScope bs = (BlockScope) tmp;
				String typeForName = bs.getTypeAsStr(name);
				if (typeForName != null) {
					return true;
				}
			}
			else
			if (tmp instanceof FunctionDecl) {
				FunctionDecl fd = (FunctionDecl) tmp;
				String typeForName = fd.getTypeAsStr(name);
				if (typeForName != null) {
					return true;
				}
				
				break;
			}
			
			tmp = tmp.getParent();
		}
		
		return false;
	}
	
	private void createAccessLink(GDNFuncNode funcScopeGDN, GDNNode globalVar) {
		gdn.newLink(funcScopeGDN, globalVar, GDNLinkType.ACCESS, "ACCESS");
		
		// induce links for CUDs, PDs
		induceReferencesLinks(funcScopeGDN, globalVar, "INDUCED_ACCESS");
		
		// catching hidden dependencies
		GDNVarNode vr = (GDNVarNode) globalVar;
		if (vr.getVarTypeAsGDN() != null) {
			induceReferencesLinks(funcScopeGDN, vr.getVarTypeAsGDN(), "INDUCED_ACCESS_VARIABLE_TYPE");
		}
	}
	
	private void createCallsLink(GDNFuncNode funcScopeGDN, GDNFuncNode dstCall) {
		gdn.newLink(funcScopeGDN, dstCall, GDNLinkType.CALLS, "CALLS [wo args]");
		
		// induce REFERENCES links for CUDs, PDs
		induceReferencesLinks(funcScopeGDN, dstCall, "INDUCED_CALLS_IN_NAME_RESOLVER");
		
		GDNNode dstCallReturnType = dstCall.getRetTypeAsGDNNode();
		if (dstCallReturnType != null) {
			induceReferencesLinks(funcScopeGDN, dstCallReturnType, "INDUCED_CALLS_RET_TYPE_IN_NAME_RESOLVER");
		}
	}
	
	private void induceReferencesLinks(GDNNode src, GDNNode dst, String referencesTypeMsg) {
		GDNNode srcUnit = gdn.getUnitOrInterfaceFor(src);
		GDNNode dstUnit = gdn.getUnitOrInterfaceFor(dst);
		
		if (srcUnit != null && dstUnit != null) {
			if (srcUnit != dstUnit && !gdn.srcExtendsDst(srcUnit, dstUnit)) {
				gdn.newLink(srcUnit, dstUnit, GDNLinkType.REFERENCES, referencesTypeMsg);
			}
		}
		
		GDNNode srcPackage = gdn.getPackageFor(src);
		GDNNode dstPackage = gdn.getPackageFor(dst);
		
		if (srcPackage != null && dstPackage != null && srcPackage != dstPackage) {
			gdn.newLink(srcPackage, dstPackage, GDNLinkType.REFERENCES, referencesTypeMsg);
		}
	}
}
