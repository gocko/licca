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
import ecst.ECSTree;
import ecst.universalNodes.ImportDecl;
import ecst.universalNodes.PackageDecl;
import ecst.universalNodes.Type;
import gdn.GDN;
import util.*;

public class Phase2 {

	// input
	private String xmlFile;
	private ECSTree tree;

	private ImportList importList;
	private TypeResolver typeResolver;
	
	private PackageDecl packageNode = null;
	
	public Phase2(String xmlFile, ECSTree tree, GDN gdn) {
		this.xmlFile = xmlFile;
		this.tree = tree;
		
		importList = new ImportList(gdn, xmlFile);
		typeResolver = new TypeResolver(xmlFile, gdn, importList);
	}
	
	public void analyze() {
		ECSTNode root = tree.getRoot();
		LinkedList<ECSTNode> queue = new LinkedList<ECSTNode>();
		
		queue.add(root);
		
		while (queue.size() > 0) {
			ECSTNode currentNode = queue.removeFirst();
			
			if (currentNode instanceof PackageDecl) {
				if (packageNode == null) {
					packageNode = (PackageDecl) currentNode;
					importList.initWithPackage(packageNode.getName(), xmlFile);
				} else {
					LOG.error("Phase2, duplicated PACKAGE_DECL in " + xmlFile);
				}
			}
			if (currentNode instanceof ImportDecl) {
				importDeclHandler((ImportDecl) currentNode);
			} 
			else
			if (currentNode instanceof Type) {
				typeHandler((Type) currentNode);
			}
			
			LinkedList<ECSTNode> childs = currentNode.getChilds();
			for (int i = 0; i < childs.size(); i++) {
				queue.addLast(childs.get(i));
			}
		}
	}
	
	
	private void importDeclHandler(ImportDecl importNode) {
		importList.resolveImport(importNode.getName());
	}
	
	private void typeHandler(Type typeNode) {
		typeResolver.resolve(typeNode, packageNode);
	}
}
