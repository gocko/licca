/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package sneipl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map.Entry;

import ecst.ECSTNamedNode;
import ecst.ECSTNode;
import ecst.universalNodes.Argument;
import ecst.universalNodes.ArgumentList;
import ecst.universalNodes.AttributeDecl;
import ecst.universalNodes.BlockScope;
import ecst.universalNodes.ConcreteUnitDecl;
import ecst.universalNodes.Extends;
import ecst.universalNodes.FormalParamList;
import ecst.universalNodes.FunctionCall;
import ecst.universalNodes.FunctionDecl;
import ecst.universalNodes.Ignore;
import ecst.universalNodes.Implements;
import ecst.universalNodes.Instantiates;
import ecst.universalNodes.InterfaceUnitDecl;
import ecst.universalNodes.PackageDecl;
import ecst.universalNodes.ParameterDecl;
import ecst.universalNodes.Type;
import ecst.universalNodes.TypeDecl;
import ecst.universalNodes.VarDecl;
import gdn.GDN;
import gdn.GDNFuncNode;
import gdn.GDNLinkType;
import gdn.GDNNode;
import gdn.GDNNodeType;
import gdn.GDNVarNode;
import util.LOG;

/**
 * TypeResolver creates REFERENCES links for CUDs/IUDs (classes/interfaces)
 * It also determine the type of REFERENCES link, induce links for packages
 *   and determine type of global variable
 *   
 * @author svc
 */
public class TypeResolver {

	// input
	private String xmlFile;
	private GDN gdn;
	private ImportList impList;

	// this structure contains all types that are already resolved
	// using import list
	private HashMap<String, GDNNode> importedTypesCache;
	
	// GDN node representing type
	private GDNNode gdnReflectingType = null;
	
	// src & dst node for REFERENCES link that will be created
	private GDNNode srcNode = null;
	private GDNNode dstNode = null;
	
	// induced REFERENCES link
	private GDNNode srcPackage = null;
	private GDNNode dstPackage = null;
	
	// Blue node, determining the type of reference
	private ECSTNode blue = null;
	
	public static int couplingTypeDetermined = 0;
	public static int couplingTypeUnknown = 0;
	
	// array used in GDN searching
	private static GDNNodeType[] gdnTypeArr = {
		GDNNodeType.UNIT,
		GDNNodeType.INTERFACE,
		GDNNodeType.TYPE
	};
	
	// all resolved types
	private static HashMap<String, LinkedList<GDNNode>> resolvedTypes =
		new HashMap<String, LinkedList<GDNNode>>();
	
	// all unresolved types
	private static HashMap<String, String> unresolvedTypes =
		new HashMap<String, String>();
	
	public TypeResolver(String xmlFile, GDN gdn, ImportList impList) {
		this.xmlFile = xmlFile;
		this.gdn = gdn;
		this.impList = impList;
		
		importedTypesCache = new HashMap<String, GDNNode>();
	}
	
	public void resolve(Type typeECSTNode, PackageDecl srcPackageEcstNode) {
		
		// initialization
		srcNode = null;
		dstNode = null;
		srcPackage = null;
		dstPackage = null;
		blue = null;
		gdnReflectingType = null;
		
		// get name contained below TYPE universal node
		String typeName = typeECSTNode.getName();
		
		// strange, but some variables can be called "TYPE"
		if (typeName == Type.NO_NAME)
			return;
		
		//
		//  ---[ D E D U C E ]---
		//
		
		// determine srcPackage node
		if (srcPackageEcstNode != null) {
			srcPackage = gdn.findNode(srcPackageEcstNode.getCanonicalName(), false);
			if (srcPackage == null) {
				LOG.error("TypeResolver, resolve, unable to find GDN node representing package "
					  + srcPackageEcstNode.getCanonicalName() + ", "
					  + xmlFile
				);
			}
		}
		
		deduceSrcAndBlueNode(typeECSTNode);
	
		gdnReflectingType = deduceType(typeName, typeECSTNode);
		if (gdnReflectingType != null) {
			addResolvedType(typeName, gdnReflectingType);
			
			determineDstUnitAndPackage(typeName);
			typeECSTNode.setGDNNodeRepresentingType(gdnReflectingType);
		} else {
			unresolvedTypes.put(typeName, xmlFile);
		}
		
		//
		//  ---[ A C T I O N S ]---
		//
		
		if (blue != null) {
			if (blue instanceof AttributeDecl) {
				recordTypeForAttribute((AttributeDecl) blue);
			}
			else
			if (blue instanceof ParameterDecl) {
				recordTypeForFunctionParameter(typeName);
			}
			else
			if (blue instanceof FunctionDecl) {
				recordTypeForFunction(typeName);
			}
			else
			if (blue instanceof Instantiates) {
				ECSTNode tmp = blue.getParent();
				while (tmp != null) {
					// ovverriden, run-time type
					if (tmp instanceof AttributeDecl) {
						recordTypeForAttribute((AttributeDecl) tmp);
						break;
					}
					
					tmp = tmp.getParent();
				}
			}
		}
				
		if (gdnReflectingType != null) {
			if (srcNode != null && dstNode != null) {
				if (srcNode != dstNode) {
					if (blue != null) {
						GDNLinkType linkType = convertNodeToLinkType(blue);
						if (linkType != null) {
							gdn.newLink(srcNode, dstNode, linkType, "COUPLING_" + blue.getToken());
							couplingTypeDetermined++;
						} else {
							couplingTypeUnknown++;
						}
						
						gdn.newLink(srcNode, dstNode, GDNLinkType.REFERENCES, blue.getToken());
					} else {
						gdn.newLink(srcNode, dstNode, GDNLinkType.REFERENCES, "FOUND_TYPE");
					}
				}
			}
			
			if (srcPackage != null && dstPackage != null) {
				if (srcPackage != dstPackage) 
					gdn.newLink(srcPackage, dstPackage, GDNLinkType.REFERENCES, "REFERENCES (direct)");
			}
		}
	}
	
	private void recordTypeForAttribute(AttributeDecl ad) {
		String adNameInGDN = ad.getCanonicalName();
		GDNNode adGdn = gdn.findNode(adNameInGDN, false);
		if (adGdn == null || !(adGdn instanceof GDNVarNode)) {
			LOG.error("TypeResolver, recordTypeForAttribute, GDN node for " 
					  + adNameInGDN + " null or not global variable, " + xmlFile);
			return;
		}
		
		GDNVarNode var = (GDNVarNode) adGdn;
		var.setType(gdnReflectingType);
	}
	
	/*
	private void recordTypeForAttribute() {
		AttributeDecl ad = (AttributeDecl) blue;
		String adNameInGDN = ad.getCanonicalName();
		GDNNode adGdn = gdn.findNode(adNameInGDN, false);
		if (adGdn == null || !(adGdn instanceof GDNVarNode)) {
			LOG.error("TypeResolver, recordTypeForAttribute, GDN node for " 
					  + adNameInGDN + " null or not global variable, " + xmlFile);
			return;
		}
		
		GDNVarNode var = (GDNVarNode) adGdn;
		var.setType(gdnReflectingType);
	}
	*/
	
	private void recordTypeForFunction(String typeName) {
		FunctionDecl fd = (FunctionDecl) blue;
		String fdNameInGDN = fd.getCanonicalName();
		GDNNode fdGDN = gdn.findNode(fdNameInGDN, true);
		if (fdGDN == null || !(fdGDN instanceof GDNFuncNode)) {
			LOG.error(
				"TypeResolver, unable to resolve return type " + typeName + " for function " +
				fdNameInGDN + ": unable to find GDN node representing function " + xmlFile		
			);
		}
		
		GDNFuncNode func = (GDNFuncNode) fdGDN;
		if (func.getRetType().compareTo(typeName) == 0) {
			func.setType(gdnReflectingType);
		}
	}
	
	private void recordTypeForFunctionParameter(String typeName) {
		ParameterDecl pd = (ParameterDecl) blue;
		ECSTNode parent = pd.getParent();
		FormalParamList paramList = null;
		
		while (parent != null && !(parent instanceof FunctionDecl)) {
			if (parent instanceof FormalParamList) {
				paramList = (FormalParamList) parent;
			}
			parent = parent.getParent();
		}
		
		// not parameter of function
		if (parent == null || paramList == null)
			return;
		
		if (paramList.getParent() != parent) {
			String msg = "Found FORMAL_PARAM_LIST that is not child of FUNCTION_DECL: "
					+ parent.dfsSubtree(true) + ", " + xmlFile;
			
			System.out.println(" ======> " + msg);
			LOG.warning(msg);
		}
		
		FunctionDecl fd = (FunctionDecl) parent;
		String functionName = fd.getCanonicalName();
		
		int paramNo = -1;
		LinkedList<ECSTNode> params = paramList.getChilds();
		for (int i = 0; i < params.size(); i++) {
			if (params.get(i) instanceof ParameterDecl)
				paramNo++;
			
			if (params.get(i) == blue) {
				break;
			}
		}
		
		if (paramNo == -1) {
			LOG.error("Found PARAMETER_DECL having enclosing FUNCTION_DECL & FORMAL_PARAM_LIST, but unable" + 
					  " to determine the position of parameter in param list: " + typeName + ", " + xmlFile);
			return;
		}
		
		GDNFuncNode funGDNNode = gdn.findFunction(functionName);
		if (funGDNNode == null) {
			LOG.error("[Record type for function parameter] Unable to find a GDN node representing function " +
					  functionName + ", " + xmlFile);
			return;
		}
		
		funGDNNode.recordParamType(gdnReflectingType, paramNo);
	}
	
	
	//
	//  FUNCTIONS USED IN DEDUCE PHASE
	//
	
	private void deduceSrcAndBlueNode(Type typeECSTNode) {
		ECSTNode tmp = typeECSTNode.getParent();
		
		boolean blueNodeFound = false;
		FunctionDecl fd = null;
		
		while (tmp != null) {
			
			if (!blueNodeFound) {
				if (tmp instanceof Extends         ||
					tmp instanceof Implements      ||
					tmp instanceof AttributeDecl   ||
					tmp instanceof VarDecl         ||
					tmp instanceof FunctionDecl    ||
					tmp instanceof ParameterDecl   ||
					tmp instanceof FormalParamList ||
					tmp instanceof Instantiates    ||
					tmp instanceof FunctionCall    ||
					tmp instanceof Argument        ||
					tmp instanceof ArgumentList    ||
					tmp instanceof FunctionCall    ||
					tmp instanceof BlockScope      ||
					tmp instanceof Ignore
				) 
				{
					blue = tmp;
					blueNodeFound = true;
				}
			}
			
			if (tmp instanceof ConcreteUnitDecl  ||
				tmp instanceof InterfaceUnitDecl
			)
			{
				ECSTNamedNode namedNode = (ECSTNamedNode) tmp;
				srcNode = gdn.findNode(namedNode.getCanonicalName(), false);
				
				if (srcNode == null) {
					StringBuilder sb = new StringBuilder();
					sb.append("TypeResolver, deduceSrcAndBlueNode, unable to find GDN node representing CUD/IUD ");
					sb.append(namedNode.getCanonicalName());
					sb.append(", ");
					sb.append(xmlFile);
					LOG.error(sb.toString());
				}
				
				break;
			}
			
			// this is for functions that can exists out of class definition
			if (tmp instanceof FunctionDecl) {
				fd = (FunctionDecl) tmp;
			}
			
			tmp = tmp.getParent();
		}
		
		// cont. this is for functions that can exists out of class definition
		if (fd != null) {
			GDNFuncNode fdGDN = (GDNFuncNode) gdn.findNode(fd.getCanonicalName(), true);
			if (fdGDN != null) {
				GDNNode contIn = gdn.getContainedIn(fdGDN);
				if (contIn.getType() == GDNNodeType.UNIT || contIn.getType() == GDNNodeType.INTERFACE)
					srcNode = contIn;
			}
		}
	}
	
	
	public GDNNode deduceType(String typeName, ECSTNode typeECSTNode) {
		
		// first possibility: full type name without import
		GDNNode typeGdn = fullTypeNameWoImport(typeName);
		if (typeGdn != null) {
			return typeGdn;
		}
		
		// second possibility: type defined in the same compilation unit or package
		typeGdn = typeDeclaredInThisCompilationUnit(typeName, typeECSTNode);
		if (typeGdn != null) {
			return typeGdn;
		}
		
		// third possibility: type already resolved using import list
		typeGdn = importedTypesCache.get(typeName);
		if (typeGdn != null) {
			return typeGdn; 
		}
		
		// fourth possibility: resolve type using import list
		return resolveTypeUsingImportList(typeName);
	}
	
	private GDNNode fullTypeNameWoImport(String typeName) {
		GDNNode dstTypeNode = gdn.findNode(typeName, false);
		if (dstTypeNode != null) {
			return dstTypeNode;
		}
		
		return null;
	}
	
	private GDNNode typeDeclaredInThisCompilationUnit(String typeName, ECSTNode typeECSTNode) {
		
		ECSTNode tmp = typeECSTNode.getParent();
		while (tmp != null) {
			if (tmp instanceof ConcreteUnitDecl  ||
				tmp instanceof InterfaceUnitDecl ||
				tmp instanceof TypeDecl)    
			{
				ECSTNamedNode namedNode = (ECSTNamedNode) tmp;
				GDNNode scopeNode = gdn.findNode(namedNode.getCanonicalName(), false);
				if (scopeNode == null) {
					LOG.error("Phase 2, TypeResolver, unable to find scope node " + namedNode.getCanonicalName() 
							  + ", " + xmlFile);
				} else {
					LinkedList<GDNNode> contains = gdn.getContains(scopeNode);
					for (int i = 0; i < contains.size(); i++) {
						GDNNode cont = contains.get(i);
						GDNNodeType contType = cont.getType();
						if (contType == GDNNodeType.UNIT      || 
							contType == GDNNodeType.INTERFACE || 
							contType == GDNNodeType.TYPE) 
						{
							if (cont.getCompactName().compareTo(typeName) == 0) {
								return cont;
							}
						}
					}
				}
			}
				
			tmp = tmp.getParent();
		}
		
		return null;
	}
	
	
	private GDNNode resolveTypeUsingImportList(String typeName) {
		LinkedList<GDNNode> candidates = impList.selectCandidates(typeName, gdnTypeArr);
		
		if (candidates.size() == 0) {
			return null;
		}
		else
		if (candidates.size() == 1) {
			importedTypesCache.put(typeName, candidates.get(0));
			return candidates.get(0);
		}
		else
		if (candidates.size() == 2) {
			// u slucaju da imamo dva kandidata
			// onda je prvi nastao kao posledica importa tekuceg paketa
			// a drugi je onaj pravi
			importedTypesCache.put(typeName, candidates.get(1));
			return candidates.get(1);
		}
		else {
			StringBuilder sb = new StringBuilder();
			sb.append("Phase2, TypeResolver, multiple candidates after matcing with import list\n");
			sb.append("source: ").append(xmlFile).append("\n");
			sb.append("typeName: ").append(typeName).append("\n");
			sb.append("candidates: \n");
			for (int i = 0; i < candidates.size(); i++) {
				sb.append(candidates.get(i).getDesc()).append("\n");
			}
			sb.append("import list: \n");
			sb.append(impList.dump());
			sb.append("\n");
			
			LOG.error(sb.toString());
			
			return null;
		}
	}
	
	
	private void determineDstUnitAndPackage(String typeName) {
		GDNNodeType typeOfDstTypeNode = gdnReflectingType.getType();
		
		if (typeOfDstTypeNode == GDNNodeType.PACKAGE) {
			dstNode = null;
			dstPackage = gdnReflectingType;
		}
		else
		if (typeOfDstTypeNode == GDNNodeType.UNIT || typeOfDstTypeNode == GDNNodeType.INTERFACE) {
			dstNode = gdnReflectingType;
			dstPackage = gdn.getPackageFor(dstNode);
		}
		else 
		if (typeOfDstTypeNode == GDNNodeType.TYPE) {
			dstNode = gdn.getUnitOrInterfaceFor(gdnReflectingType);
			
			// java enums
			if (dstNode != null)
				dstPackage = gdn.getPackageFor(dstNode);
			else
				dstPackage = null;
		}
		else {
			LOG.error("TypeResolver, GDN reflecting noticed type has strange type: " 
					   + GDNNodeType.desc(typeOfDstTypeNode)
					   + ", type: " + typeName 
					   + ", GDNNode: " + gdnReflectingType.getName() 
					   + ", " + xmlFile);
			
			dstNode = null;
			dstPackage = null;
		}
	}
	
	
	
	//
	//  FUNCTIONS USED IN ACTION PHASE
	//
	
	private GDNLinkType convertNodeToLinkType(ECSTNode node) {
		if (node instanceof Extends) return GDNLinkType.EXTENDS;
		else if (node instanceof Implements) return GDNLinkType.IMPLEMENTS;
		else if (node instanceof AttributeDecl) return GDNLinkType.GLOBAL_VAR;
		else if (node instanceof VarDecl) return GDNLinkType.LOCAL_VAR;
		else if (node instanceof FunctionDecl) return GDNLinkType.FUNC_RET;
		else if (node instanceof ParameterDecl) return GDNLinkType.FUNC_PARAM;
		else if (node instanceof Instantiates) return GDNLinkType.INSTANTIATES;
		else return null;
	}
	
	//
	// UTILITY FUNCTIONS OR FUNCTIONS THAT PROVIDE ADDITIONAL INSIGHTS
	//
	
	public static void dumpUnresolvedTypes(String outFile) 
		throws IOException
	{
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
		Set<Entry<String, String>> es = unresolvedTypes.entrySet();
		Iterator<Entry<String, String>> it = es.iterator();
		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			pw.println(e.getKey() + ", " + e.getValue());
		}
		pw.close();
	}
	
	public static void checkUnresolvedTypes(GDN gdn) {
		Set<Entry<String, String>> es = unresolvedTypes.entrySet();
		Iterator<Entry<String, String>> it = es.iterator();
		
		int numWars = 0;
		
		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			String unresolvedType = e.getKey();
			String source = e.getValue();
			
			GDNNode node = gdn.findNodeByCompactName(unresolvedType);
			if (node != null) {
				if (node.getType() == GDNNodeType.UNIT ||
					node.getType() == GDNNodeType.INTERFACE ||
					node.getType() == GDNNodeType.TYPE)
				{
					LOG.warning("Suspicious unresolved type " + unresolvedType + ", source: " + source  
						        + ", possible match with " + node.getDesc());
				
					++numWars;
				}
			}
		}
		
		if (numWars == 0) {
			System.out.println("Checking unresolved types [OK]");
		} else {
			System.out.println("Checking unresolved types [" + numWars + " warnings]");
		}
	}
	
	private static void addResolvedType(String type, GDNNode node) {
		LinkedList<GDNNode> list = resolvedTypes.get(type);
		if (list == null) {
			list = new LinkedList<GDNNode>();
			list.add(node);
			resolvedTypes.put(type, list);
		} else {
			boolean alreadyThere = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().compareTo(node.getName()) == 0) {
					alreadyThere = true;
					break;
				}
			}
			
			if (!alreadyThere)
				list.add(node);
		}
	}
	
	public static void dumpResolvedTypes(String outFile) 
		throws IOException
	{
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
		Set<Entry<String, LinkedList<GDNNode>>> es = resolvedTypes.entrySet();
		Iterator<Entry<String, LinkedList<GDNNode>>> it = es.iterator();
		while (it.hasNext()) {
			Entry<String, LinkedList<GDNNode>> curr = it.next();
			String name = curr.getKey();
			LinkedList<GDNNode> nodeList = curr.getValue();
			
			for (int i = 0; i < nodeList.size(); i++) {
				pw.println(name + ", " + nodeList.get(i).getDesc());
			}
		}
		pw.close();
	}

	public static int getResolvedTypeSize() {
		return resolvedTypes.size();
	}

	public static int getUnresolvedTypeSize() {
		return unresolvedTypes.size();
	}
	
}
