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
import ecst.ECSTree;
import ecst.universalNodes.AttributeDecl;
import ecst.universalNodes.ConcreteUnitDecl;
import ecst.universalNodes.FunctionDecl;
import ecst.universalNodes.InterfaceUnitDecl;
import ecst.universalNodes.PackageDecl;
import ecst.universalNodes.TypeDecl;
import gdn.GDN;
import gdn.GDNLink;
import gdn.GDNLinkType;
import gdn.GDNNode;
import gdn.GDNNodeType;
import util.LOG;

/**
 * Forms GDN nodes and CONTAINS relations
 * 
 * @author svc@dmi.uns.ac.rs
 */
public class Phase1 {

	// input
	private String xmlFile;
	private ECSTree tree;
	private GDN gdn;
	
	private boolean packageStructure = false;
	
	public static int CONTAINS_FORMED_BY_NAME = 0;
	public static int CONTAINS_FORMED_BY_HIERARCHY = 0;

	public Phase1(String xmlFile, ECSTree tree, GDN gdn) {
		this.xmlFile = xmlFile;
		this.tree = tree;
		this.gdn = gdn;
	}
	
	public void analyze() {
		ECSTNode root = tree.getRoot();
		LinkedList<ECSTNode> queue = new LinkedList<ECSTNode>();
		queue.add(root);
		
		while (queue.size() > 0) {
			ECSTNode currentNode = queue.removeFirst();
			
			if (currentNode instanceof PackageDecl) {
				PackageDecl pd = (PackageDecl) currentNode;
				gdn.newNode(pd.getCanonicalName(), GDNNodeType.PACKAGE, pd, xmlFile);
				formContains(pd);
				packageStructure = true;
			}
			else
			if (currentNode instanceof ConcreteUnitDecl) {
				addUnit((ConcreteUnitDecl) currentNode);
				formContains(currentNode);
			}
			else
			if (currentNode instanceof InterfaceUnitDecl) {
				addInterface((InterfaceUnitDecl) currentNode);
				formContains(currentNode);
			}
			else
			if (currentNode instanceof TypeDecl) {
				addType((TypeDecl) currentNode);
				formContains(currentNode);
			}
			else
			if (currentNode instanceof FunctionDecl) {
				addFunction((FunctionDecl) currentNode);
				formContains(currentNode);
			}
			else
			if (currentNode instanceof AttributeDecl) {
				addGlobalVar((AttributeDecl) currentNode);
				formContains(currentNode);
			}
			
		
			LinkedList<ECSTNode> childs = currentNode.getChilds();
			for (int i = 0; i < childs.size(); i++) {
				queue.addLast(childs.get(i));
			}
		}
		
		int numWrngContains = gdn.checkContainsLinks();
		if (numWrngContains > 0) {
			LOG.error(numWrngContains + " wrong contains in " + xmlFile);
		} 
	}
	
	private void formContains(ECSTNode node) {
		boolean formed = formContainsByName(node);
		if (!formed)
			formContainsByHierarchy(node);
	}
	
	private boolean formContainsByName(ECSTNode node) {
		if (!(node instanceof ECSTNamedNode)) {
			throw new IllegalArgumentException("Phase1, formContains, parameter is not named node");
		}
		
		ECSTNamedNode dst = (ECSTNamedNode) node;
		String dstCannonicalName = dst.getCanonicalName();
		int lastDotIndex = dstCannonicalName.lastIndexOf('.');
		if (lastDotIndex != -1) {
			String srcCannonicalName = dstCannonicalName.substring(0, lastDotIndex);
			GDNLink l = gdn.newLink(srcCannonicalName, dstCannonicalName, GDNLinkType.CONTAINS, "Contains by name");
			if (l != null) {
				++CONTAINS_FORMED_BY_NAME;
				return true;
			}
		}
		
		return false;
	}
	
	private void formContainsByHierarchy(ECSTNode node) {
		
		ECSTNode parent = node.getParent();
		while (parent != null) {
			if (ECSTNamedNode.canonicalUniversalNode(parent)) {
				break;
			}
			
			parent = parent.getParent();
		}
		
		if (parent != null) {
			ECSTNamedNode src = (ECSTNamedNode) parent;
			ECSTNamedNode dst = (ECSTNamedNode) node;
			GDNLink l = gdn.newLink(src.getCanonicalName(), dst.getCanonicalName(), GDNLinkType.CONTAINS, "Contains by hierarchy");
			
			if (l == null) {
				GDNNode srcNode = gdn.getNode(src.getCanonicalName());
				if (srcNode == null) {
					LOG.error("Phase1, unable to create CONTAINS link, src node missing, " +
				                            src.getCanonicalName() + ", " + xmlFile);
				}
				
				GDNNode dstNode = gdn.getNode(dst.getCanonicalName());
				if (dstNode == null) {
					LOG.error("Phase1, unable to create CONTAINS link, dst node missing, " +
							                 dst.getCanonicalName() + ", " + xmlFile);
				}
			} else {
				CONTAINS_FORMED_BY_HIERARCHY++;
			}
		} else {
			
			if (node instanceof PackageDecl)
				return;
			
			if (packageStructure) {
				LOG.error("Phase1, CONTAINS link not created for node " + node.getToken() + 
						                ", " + node.toRootFingerPrint() + ", " + xmlFile);
			} else {
				if (!(node instanceof ConcreteUnitDecl) && !(node instanceof InterfaceUnitDecl)) {
					if (node instanceof TypeDecl) {
						LOG.warning("Phase1, CONSTAINS link not created for node " + node.getToken() + 
				                                  ", " + node.toRootFingerPrint() + ", " + xmlFile);
					}
					else {
						LOG.error("Phase1, CONSTAINS link not created for node " + node.getToken() + 
								                ", " + node.toRootFingerPrint() + ", " + xmlFile);
					}
				}
			}
		}
	}
	
	// HANDLERS
	
	private void addGlobalVar(AttributeDecl ad) {
		String canonicalName = ad.getCanonicalName();
		GDNNode node = gdn.getNode(canonicalName);
		if (node == null) {
			gdn.newNode(canonicalName, GDNNodeType.GLOBAL_VAR, ad, xmlFile);
		} else {
			LOG.warning("Phase1, duplicated global variable " + canonicalName + 
				    			      ", existing: " + node.getDesc() + ", " + xmlFile + 
				    			      ", " + node.getSourceFileName());
		}
	}
	
	private void addFunction(FunctionDecl fd) {	
		String fullName = fd.getCanonicalName();
		GDNNode node = gdn.getNode(fullName);
		if (node == null) {
			gdn.newNode(fullName, GDNNodeType.FUNCTION, fd, xmlFile);
		}
	}
	
	private void addType(TypeDecl td) {
		String canonicalName = td.getCanonicalName();
		GDNNode node = gdn.getNode(canonicalName);
		if (node == null) {
			gdn.newNode(canonicalName, GDNNodeType.TYPE, td, xmlFile);
		} else {
			LOG.warning("Phase1, duplicated type " + canonicalName + 
								      ", existing: " + node.getDesc() + 
								      ", " + xmlFile +
								      ", " + node.getSourceFileName());
		}
	}
	
	private void addUnit(ConcreteUnitDecl cud) {
		String canonicalName = cud.getCanonicalName();
		GDNNode node = gdn.getNode(canonicalName);
		if (node == null) {
			gdn.newNode(canonicalName, GDNNodeType.UNIT, cud, xmlFile);
		} else {
			LOG.warning("Phase1, duplicated unit " + canonicalName + 
									  ", existing: " + node.getDesc() + 
									  ", " + xmlFile + 
									  ", " + node.getSourceFileName());
		}
	}
	
	public void addInterface(InterfaceUnitDecl iud) {
		String canonicalName = iud.getCanonicalName();
		GDNNode node = gdn.getNode(canonicalName);
		if (node == null) {
			gdn.newNode(canonicalName, GDNNodeType.INTERFACE, iud, xmlFile);
		} else {
			if (node.getType() == GDNNodeType.UNIT) {
				canonicalName = canonicalName + "_INTERFACE";
				GDNNode again = gdn.getNode(canonicalName);
				if (again == null) {
					gdn.newNode(canonicalName, GDNNodeType.INTERFACE, iud, xmlFile);
				} else {
					LOG.warning("Phase1, duplicated interface " + canonicalName + 
							                  ", existing: " + again.getDesc() + ", " + xmlFile);
				}
			} else {
				LOG.warning("Phase1, duplicated interface " + canonicalName + 
						                  ", existing: " + node.getDesc() + ", " + xmlFile);
			}
		}
	}
}
