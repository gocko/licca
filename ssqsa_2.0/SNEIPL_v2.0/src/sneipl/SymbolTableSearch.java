/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package sneipl;

import java.util.LinkedList;

import ecst.ECSTNode;
import ecst.universalNodes.BlockScope;
import ecst.universalNodes.FunctionDecl;

import gdn.GDNNode;
import gdn.GDN;
import gdn.GDNNodeType;
import gdn.GDNVarNode;

public class SymbolTableSearch {

	private ECSTNode startEcstNode;
	private GDNNode compUnit;
	private GDN gdn;
	
	// results
	private String symbolType;
	private GDNNode symbolTypeAsGDN;
	private GDNNode symbolGDN;
	
	public SymbolTableSearch(GDN gdn, GDNNode compUnit, ECSTNode startEcst) {
		this.startEcstNode = startEcst;
		this.compUnit = compUnit;
		this.gdn = gdn;
	}
	
	private void __search(String name) {
		
		// 
		// Step 0: initialize results
		//
		symbolType = null;
		symbolTypeAsGDN = null;
		symbolGDN = null;
		
		//
		// Step1: search among local variables in compilation unit
		//
		ECSTNode tmp = startEcstNode.getParent();
		while (tmp != null) {
			if (tmp instanceof BlockScope) {
				BlockScope bs = (BlockScope) tmp;
				if (bs.nameDeclaredHere(name)) {
					symbolGDN = null;
					symbolTypeAsGDN = bs.getType(name);
					symbolType = bs.getTypeAsStr(name);
					return;
				}
			}
			else
			if (tmp instanceof FunctionDecl) {
				FunctionDecl fd = (FunctionDecl) tmp;
				if (fd.nameDeclaredHere(name)) {
					symbolGDN = null;
					symbolTypeAsGDN = fd.getType(name);
					symbolType = fd.getTypeAsStr(name);
					return;
				}
			}
			
			tmp = tmp.getParent();
		}
		
		//
		// Step2: search among global variables in current compilation unit
		//
		boolean containedSearch = true;
		GDNNode currentGDNNode = compUnit;
		while (containedSearch) {
			LinkedList<GDNNode> conts = gdn.getContains(currentGDNNode);
			if (conts.size() == 0)
				containedSearch = false;
			else {
				for (int i = 0; i < conts.size(); i++) {
					GDNNode cc = conts.get(i);
					if (cc.getType() == GDNNodeType.GLOBAL_VAR) {
						if (cc.getCompactName().compareTo(name) == 0) {
							GDNVarNode varNode = (GDNVarNode) cc;
							symbolGDN = varNode;
							symbolType = varNode.getVarTypeAsString();
							symbolTypeAsGDN = varNode.getVarTypeAsGDN();
							return;
						}
					}
				}
			}
			
			currentGDNNode = gdn.getContainedIn(currentGDNNode);
			if (currentGDNNode == null) {
				containedSearch = false;
			}
		}
		
		
		//
		// Step3: propagate search according to EXTENDS relation
		// Multiple inheritance supported
		//
		LinkedList<GDNNode> baseUnits = gdn.getBaseUnits(compUnit);
		while (baseUnits.size() > 0) {
			currentGDNNode = baseUnits.removeFirst();
			
			LinkedList<GDNNode> conts = gdn.getContains(currentGDNNode);
			if (conts.size() == 0)
				break;
			
			for (int i = 0; i < conts.size(); i++) {
				GDNNode cc = conts.get(i);
				if (cc.getType() == GDNNodeType.GLOBAL_VAR) {
					if (cc.getCompactName().compareTo(name) == 0) {
						GDNVarNode varNode = (GDNVarNode) cc;
						symbolGDN = varNode;
						symbolType = varNode.getVarTypeAsString();
						symbolTypeAsGDN = varNode.getVarTypeAsGDN();
						return;
					}
				}
			}
			
			LinkedList<GDNNode> expand = gdn.getBaseUnits(currentGDNNode);
			for (int i = 0; i < expand.size(); i++) {
				baseUnits.addLast(expand.get(i));
			}
		}
	}
	
	public GDNNode searchType(String name) {
		__search(name);
		return symbolTypeAsGDN;
	}
	
	public GDNNode getGDNForLastSearchedSymbol() {
		return symbolGDN;
	}
	
	public String searchTypeName(String name) {
		__search(name);
		return symbolType;
	}
	
}	

//	
//  OLD, code before refactoring 	
//
//	/**
//	 * Returns TYPE(name) as GDNNode
//	 * 
//	 * @param name
//	 * @return
//	 */
//	public GDNNode search(String name) {
//		
//		//
//		// search among local variables in compilation unit
//		//
//		ECSTNode tmp = startEcstNode.getParent();
//		while (tmp != null) {
//			if (tmp instanceof BlockScope) {
//				BlockScope bs = (BlockScope) tmp;
//				if (bs.nameDeclaredHere(name)) {
//					return bs.getType(name);
//					/*
//					GDNNode typeForName = bs.getType(name);
//					if (typeForName != null) {
//						return typeForName;
//					} 
//					*/
//				}
//			}
//			else
//			if (tmp instanceof FunctionDecl) {
//				FunctionDecl fd = (FunctionDecl) tmp;
//				if (fd.nameDeclaredHere(name)) {
//					return fd.getType(name);
//				}
//				
//				/*
//				GDNNode typeForName = fd.getType(name);
//				if (typeForName != null) {
//					return typeForName;
//				}
//				*/
//				
//				break;
//			}
//			
//			tmp = tmp.getParent();
//		}
//		
//		//
//		// search among global variables in compilation unit
//		//
//		boolean containedSearch = true;
//		GDNNode currentGDNNode = compUnit;
//		while (containedSearch) {
//			LinkedList<GDNNode> conts = gdn.getContains(currentGDNNode);
//			if (conts.size() == 0)
//				containedSearch = false;
//			else {
//				for (int i = 0; i < conts.size(); i++) {
//					GDNNode cc = conts.get(i);
//					if (cc.getType() == GDNNodeType.GLOBAL_VAR) {
//						if (cc.getCompactName().compareTo(name) == 0) {
//							//return cc;  --[ BUG ]--
//							GDNVarNode varNode = (GDNVarNode) cc;
//							return varNode.getVarTypeAsGDN();
//						}
//					}
//				}
//			}
//			
//			currentGDNNode = gdn.getContainedIn(currentGDNNode);
//			if (currentGDNNode == null) {
//				containedSearch = false;
//			}
//		}
//		
//		
//		//
//		// propagate search according to EXTENDS relation
//		//
//		/* ---- CODE HANDLING SINGLE INHERITANCE 
//		currentGDNNode = gdn.getBaseUnit(compUnit);
//		while (currentGDNNode != null) {
//			LinkedList<GDNNode> conts = gdn.getContains(currentGDNNode);
//			if (conts.size() == 0)
//				break;
//			
//			for (int i = 0; i < conts.size(); i++) {
//				GDNNode cc = conts.get(i);
//				if (cc.getType() == GDNNodeType.GLOBAL_VAR) {
//					if (cc.getCompactName().compareTo(name) == 0) {
//						GDNVarNode varNode = (GDNVarNode) cc;
//						return varNode.getVarTypeAsGDN();
//					}
//				}
//			}
//			
//			currentGDNNode = gdn.getBaseUnit(currentGDNNode);
//		}
//		*/
//		
//		//
//		// code handling multiple inheritance
//		//
//		LinkedList<GDNNode> baseUnits = gdn.getBaseUnits(compUnit);
//		while (baseUnits.size() > 0) {
//			currentGDNNode = baseUnits.removeFirst();
//			
//			LinkedList<GDNNode> conts = gdn.getContains(currentGDNNode);
//			if (conts.size() == 0)
//				break;
//			
//			for (int i = 0; i < conts.size(); i++) {
//				GDNNode cc = conts.get(i);
//				if (cc.getType() == GDNNodeType.GLOBAL_VAR) {
//					if (cc.getCompactName().compareTo(name) == 0) {
//						GDNVarNode varNode = (GDNVarNode) cc;
//						return varNode.getVarTypeAsGDN();
//					}
//				}
//			}
//			
//			LinkedList<GDNNode> expand = gdn.getBaseUnits(currentGDNNode);
//			for (int i = 0; i < expand.size(); i++) {
//				baseUnits.addLast(expand.get(i));
//			}
//		}
//		
//		return null;
//	}
//	
//	
//	
//	/**
//	 * Return TYPE(name) as String
//	 * 
//	 * @param name
//	 * @return
//	 */
//	public String searchTypeName(String name) {
//		//
//		// search among local variables in compilation unit
//		//
//		ECSTNode tmp = startEcstNode.getParent();
//		while (tmp != null) {
//			
//			if (tmp instanceof BlockScope) {
//				BlockScope bs = (BlockScope) tmp;
//				if (bs.nameDeclaredHere(name)) {
//					return bs.getTypeAsStr(name);
//				}
//				/*
//				String typeForName = bs.getTypeAsStr(name);
//				if (typeForName != null) {
//					return typeForName;
//				}
//				*/
//			}
//			else
//			if (tmp instanceof FunctionDecl) {
//				FunctionDecl fd = (FunctionDecl) tmp;
//				if (fd.nameDeclaredHere(name)) {
//					return fd.getTypeAsStr(name);
//				}
//				
//				/*
//				String typeForName = fd.getTypeAsStr(name);
//				if (typeForName != null) {
//					return typeForName;
//				} */
//				
//				break;
//			}
//			
//			tmp = tmp.getParent();
//		}
//		
//		//
//		// search among global variables in compilation unit
//		//
//		boolean containedSearch = true;
//		GDNNode currentGDNNode = compUnit;
//		while (containedSearch) {
//			LinkedList<GDNNode> conts = gdn.getContains(currentGDNNode);
//			if (conts.size() == 0)
//				containedSearch = false;
//			else {
//				for (int i = 0; i < conts.size(); i++) {
//					GDNNode cc = conts.get(i);
//					if (cc.getType() == GDNNodeType.GLOBAL_VAR) {
//						if (cc.getCompactName().compareTo(name) == 0) {
//							GDNVarNode varNode = (GDNVarNode) cc;
//							return varNode.getVarTypeAsString();
//						}
//					}
//				}
//			}
//			
//			currentGDNNode = gdn.getContainedIn(currentGDNNode);
//			if (currentGDNNode == null) {
//				containedSearch = false;
//			}
//		}
//		
//		
//		//
//		// propagate search according to EXTENDS relation
//		//
//		/* ---- CODE HANDLING SINGLE INHERITANCE 
//		currentGDNNode = gdn.getBaseUnit(compUnit);
//		while (currentGDNNode != null) {
//			LinkedList<GDNNode> conts = gdn.getContains(currentGDNNode);
//			if (conts.size() == 0)
//				break;
//			
//			for (int i = 0; i < conts.size(); i++) {
//				GDNNode cc = conts.get(i);
//				if (cc.getType() == GDNNodeType.GLOBAL_VAR) {
//					if (cc.getCompactName().compareTo(name) == 0) {
//						GDNVarNode varNode = (GDNVarNode) cc;
//						return varNode.getVarTypeAsString();
//					}
//				}
//			}
//			
//			currentGDNNode = gdn.getBaseUnit(currentGDNNode);
//		}
//		*/
//		
//		// code handling multiple inheritance
//		LinkedList<GDNNode> baseUnits = gdn.getBaseUnits(compUnit);
//		while (baseUnits.size() > 0) {
//			currentGDNNode = baseUnits.removeFirst();
//			
//			LinkedList<GDNNode> conts = gdn.getContains(currentGDNNode);
//			if (conts.size() == 0)
//				break;
//			//
//			for (int i = 0; i < conts.size(); i++) {
//				GDNNode cc = conts.get(i);
//				if (cc.getType() == GDNNodeType.GLOBAL_VAR) {
//					if (cc.getCompactName().compareTo(name) == 0) {
//						GDNVarNode varNode = (GDNVarNode) cc;
//						return varNode.getVarTypeAsString();
//					}
//				}
//			}
//			
//			LinkedList<GDNNode> expand = gdn.getBaseUnits(currentGDNNode);
//			for (int i = 0; i < expand.size(); i++) {
//				baseUnits.addLast(expand.get(i));
//			}
//		}
//		
//		return null;
//	}	
//}
