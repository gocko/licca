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
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

import gdn.GDN;
import gdn.GDNFuncNode;
import gdn.GDNNode;
import gdn.GDNNodeType;
import util.LOG;

/**
 * 
 * ImportList: list of visible names (GDN nodes) that are imported
 * 
 * @author svc
 */
public class ImportList {

	private static HashMap<String, GDNNode> importCache = 
		new HashMap<String, GDNNode>();
	
	private static HashSet<String> unresolvedImports =
		new HashSet<String>();
	
	private class Import {
		public String entity;
		public GDNNode gdnNode;
		public boolean declared;
		
		public Import(String entity, GDNNode gdnNode, boolean declared) {
			this.entity = entity;
			this.gdnNode = gdnNode;
			this.declared = declared;
		}
	}
	
	private LinkedList<Import> importList = 
		new LinkedList<Import>();
	
	private GDN gdn;
	private String xmlFile;
	
	public ImportList(GDN gdn, String xmlFile) {
		this.gdn = gdn;
		this.xmlFile = xmlFile;
	}
	
	public void resolveImport(String name) {
		
		if (unresolvedImports.contains(name))
			return;
		
		GDNNode impNode = importCache.get(name);
		
		if (impNode == null) {
			GDNNode node = gdn.findNode(name, true);
			if (node != null) {
				_resolveImport(name, node);
			} else {
				/* special case for Modula-2 */
				node = gdn.findNode("M2IF_" + name, false);
				if (node != null) {
					_resolveImport("M2IF_" + name, node);
				} else {
					unresolvedImports.add(name);
				}
			}
		} else {
			_resolveImport(name, impNode);
		}
	}
	
	private void _resolveImport(String name, GDNNode node) {
		if (node.getType() == GDNNodeType.PACKAGE) {
			populateWithPackage(node, true);
		}
		else {
			if (node instanceof GDNFuncNode) {
				name = ((GDNFuncNode) node).getCompactFuncName();
			} 
		
			boolean duplicated = checkForDuplicates(name);
		
			if (!duplicated) {
				importList.add(new Import(name, node, true));
				importCache.put(name, node);
				
				if (node.getType() == GDNNodeType.UNIT || node.getType() == GDNNodeType.INTERFACE) {
					populateWithClassLevelNode(node);
				}
			}
		}
	}
	
	public void initWithPackage(String packageName, String xmlFile) {
		GDNNode gdnNode = gdn.findNode(packageName, false);
		if (gdnNode == null) {
			LOG.error("Phase2, unable to find package " + packageName 
					                + ", currently analyzing " + xmlFile);
			
			return;
		}
		
		if (gdnNode.getType() != GDNNodeType.PACKAGE) {
			LOG.error("Phase2, init import list called with node that is not PACKAGE, " 
		                            + gdnNode.getDesc() + ", currently analyzing " + xmlFile);
			
			return;
		}
		
		populateWithPackage(gdnNode, false);
	}
	
	private boolean checkForDuplicates(String name) {
		boolean duplicated = false;
		for (int k = 0; k < importList.size(); k++) {
			if (importList.get(k).entity.compareTo(name) == 0) {
				duplicated = true;
				break;
			}
		}
		
		return duplicated;
	}
	
	private void populateWithPackage(GDNNode packageNode, boolean declared) {
		LinkedList<GDNNode> contained = gdn.getContains(packageNode);
		
		for (int i = 0; i < contained.size(); i++) {
			GDNNode n = contained.get(i);
			String name = n.getName();
			if (n instanceof GDNFuncNode)
				name = ((GDNFuncNode) n).getCompactFuncName();
			
			boolean duplicated = checkForDuplicates(name);
			
			if (!duplicated) {
				importList.add(new Import(name, n, declared));
				importCache.put(name, n);
				
				if (n.getType() == GDNNodeType.UNIT || n.getType() == GDNNodeType.INTERFACE) {
					populateWithClassLevelNode(n);
				}
			}
		}
	}
	
	private void populateWithClassLevelNode(GDNNode classNode) {
		LinkedList<GDNNode> contained = gdn.getContains(classNode);
		
		for (int i = 0; i < contained.size(); i++) {
			GDNNode n = contained.get(i);
			if (n.getType() == GDNNodeType.UNIT || n.getType() == GDNNodeType.INTERFACE) {
				String name = n.getName();
			
				boolean duplicated = checkForDuplicates(name);
			
				if (!duplicated) {
					importList.add(new Import(name, n, false));
					importCache.put(name, n);
				}
			}
		}
	}
	
	public static int getImportCacheSize() {
		return importCache.size();
	}
	
	public static int getUnresolvedImportSize() {
		return unresolvedImports.size();
	}
	
	public static void dumpImportCache(String outFile) 
		throws IOException
	{
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
		Set<Entry<String, GDNNode>> es = importCache.entrySet();
		Iterator<Entry<String, GDNNode>> it = es.iterator();
		while (it.hasNext()) {
			Entry<String, GDNNode> curr = it.next();
			pw.println(GDNNodeType.desc(curr.getValue().getType()) 
					   + ", " + curr.getKey() 
					   + ": " + curr.getValue().getName());
		}
		pw.close();
	}
	
	public static void dumpUnresolvedImports(String outFile) 
		throws IOException
	{
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
		Iterator<String> it = unresolvedImports.iterator();
		while (it.hasNext()) {
			pw.println(it.next());
		}
		pw.close();
	}
	
	/* No one is using this method
	public LinkedList<GDNNode> selectCandidates(String name) {
		String forComp = "." + name;
		LinkedList<GDNNode> cand = new LinkedList<GDNNode>();
		
		for (int i = 0; i < importList.size(); i++) {
			Import im = importList.get(i);
			if (im.entity.endsWith(forComp)) {
				cand.add(im.gdnNode);
			}
		}
		
		return cand;
	}
	*/
	
	public LinkedList<GDNNode> selectCandidates(String name, GDNNodeType[] types) {
		String forComp = "." + name;
		LinkedList<GDNNode> cand = new LinkedList<GDNNode>();
		LinkedList<GDNNode> explicitlyImportedCands = new LinkedList<GDNNode>();
				
		for (int i = 0; i < importList.size(); i++) {
			Import im = importList.get(i);
			if (im.entity.endsWith(forComp)) {
				for (int k = 0; k < types.length; k++) {
					if (im.gdnNode.getType() == types[k]) {
						if (im.declared)
							explicitlyImportedCands.add(im.gdnNode);
						cand.add(im.gdnNode);
						break;
					}
				}
			}
		}
		
		if (explicitlyImportedCands.size() >= 2) {
			StringBuilder sb = new StringBuilder();
			sb.append(xmlFile).append(" More than one explicit import for ").append(name).append("\n");
			for (int i = 0; i < explicitlyImportedCands.size(); i++) {
				sb.append(explicitlyImportedCands.get(i).getName());
			}
			LOG.error(sb.toString());
		}
		
		if (cand.size() == 1)
			return cand;
		
		if (cand.size() >= 2 && explicitlyImportedCands.size() == 1) {
			return explicitlyImportedCands;
		}
		
		if (cand.isEmpty() && name.contains(".")) {
			int dotIndex = name.indexOf(".");
			forComp = "." + name.substring(0, dotIndex);
			String entityName = name.substring(dotIndex + 1);
			
			for (int i = 0; i < importList.size(); i++) {
				Import im = importList.get(i);
				if (im.entity.endsWith(forComp)) {
					GDNNode entityInsideImported = null;
					
					LinkedList<GDNNode> contains = gdn.getContains(im.gdnNode);
					for (int j = 0; j < contains.size(); j++) {
						GDNNode cont = contains.get(j);
						if (cont.getCompactName().compareTo(entityName) == 0) {
							entityInsideImported = cont;
							break;
						}
					}
					
					if (entityInsideImported != null) {
						for (int k = 0; k < types.length; k++) {
							if (entityInsideImported.getType() == types[k]) {
								cand.add(entityInsideImported);
								break;
							}
						}
					}
				}
			}
		}
		
		return cand;
	}
	
	public LinkedList<GDNFuncNode> selectFunctions(String name, int numArgs) {
		String forComp = "." + name;
		LinkedList<GDNFuncNode> cand = new LinkedList<GDNFuncNode>();
		
		for (int i = 0; i < importList.size(); i++) {
			Import im = importList.get(i);
			if (im.entity.endsWith(forComp)) {
				if (im.gdnNode instanceof GDNFuncNode) {
					GDNFuncNode fNode = (GDNFuncNode) im.gdnNode;
					if (fNode.getParams().size() == numArgs) {
						cand.add((GDNFuncNode) im.gdnNode);
					}
				}
			}
		}
		
		return cand;
	}
	
	public LinkedList<GDNFuncNode> selectFunctions(String name) {
		String forComp = "." + name;
		LinkedList<GDNFuncNode> cand = new LinkedList<GDNFuncNode>();
		
		for (int i = 0; i < importList.size(); i++) {
			Import im = importList.get(i);
			if (im.entity.endsWith(forComp)) {
				if (im.gdnNode instanceof GDNFuncNode) {
					cand.add((GDNFuncNode) im.gdnNode);
				}
			}
		}
		
		return cand;
	}
	
	public String dump() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < importList.size(); i++) {
			sb.append(importList.get(i).entity)
			  .append("\n");
		}
		
		return sb.toString();
	}
}
