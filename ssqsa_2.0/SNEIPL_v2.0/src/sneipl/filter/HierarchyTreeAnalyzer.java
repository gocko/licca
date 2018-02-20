/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */
package sneipl.filter;

import java.util.Iterator;
import java.util.LinkedList;

import sneipl.filter.SoftNet.SNNode;
import gdn.GDN;
import gdn.GDNNode;

/**
 * Special analyzer for hierarchy trees
 * 
 * @author svc
 */
public class HierarchyTreeAnalyzer extends NetworkQDAnalyzer {

	private GDN gdn;
	
	public HierarchyTreeAnalyzer(GDN gdn, SoftNet net) {
		super(net);
		this.gdn = gdn;
	}
	
	@Override
	public String getReport() {
		String rep = super.getReport();
	
		int pinp = 0, cinp = 0, minp = 0, vinp = 0;
		int pinc = 0, cinc = 0, minc = 0, vinc = 0;
		int numPacks = 0, numClasses = 0;
		
		int maxP = 0, maxC = 0;
		GDNNode maxPack = null, maxUnit = null;
		
		Iterator<SNNode> it = net.getVertices().iterator();
		while (it.hasNext()) {
			SNNode n = it.next();
			GDNNode gdnNode = gdn.findNodeByName(n.name);
			containsDistr(gdnNode);
			
			if (gdnNode.isPackage()) {
				pinp += packages;
				cinp += classes;
				minp += methods;
				vinp += variables;
				++numPacks;
				
				if (gdn.getContains(gdnNode).size() > maxP) {
					maxPack = gdnNode;
					maxP = gdn.getContains(gdnNode).size();
				}
			}
			else
			if (gdnNode.isUnitOrInterface()) {
				pinc += packages;
				cinc += classes;
				minc += methods;
				vinc += variables;
				++numClasses;
				
				if (gdn.getContains(gdnNode).size() > maxC) {
					maxUnit = gdnNode;
					maxC = gdn.getContains(gdnNode).size();
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if (numPacks != 0) {
			sb.append("Packages per package = ").append(round((double) pinp / (double) numPacks)).append("\n");
			sb.append("Units per package    = ").append(round((double) cinp / (double) numPacks)).append("\n");
			sb.append("Funcs per package    = ").append(round((double) minp / (double) numPacks)).append("\n");
			sb.append("Vars per package     = ").append(round((double) vinp / (double) numPacks)).append("\n");
		}
		
		if (numClasses != 0) {
			sb.append("Packages per units   = ").append(round((double) pinc / (double) numClasses)).append("\n");
			sb.append("Units per units      = ").append(round((double) cinc / (double) numClasses)).append("\n");
			sb.append("Funcs per units      = ").append(round((double) minc / (double) numClasses)).append("\n");
			sb.append("Vars per units       = ").append(round((double) vinc / (double) numClasses)).append("\n");
		}
		
		sb.append("Max package --> ").append(containsReport(maxPack)).append("\n");
		sb.append("Max unit    --> ").append(containsReport(maxUnit)).append("\n");
		
		sb.append("\n").append(rep);
		
		return sb.toString();
	}
	
	private String containsReport(GDNNode n) {
		if (n == null)
			return "There is no max.";
		
		containsDistr(n);
		return n.getName() + ": packs (" + packages + "), units: (" + classes + "), funcs: (" + methods + "), vars: (" + variables + ")";
	}
	
 	private int packages, classes, methods, variables;
	
	private void containsDistr(GDNNode n) {
		packages = classes = methods = variables = 0;
	
		LinkedList<GDNNode> conts = gdn.getContains(n);
		for (GDNNode c : conts) {
			if (c.isPackage()) {
				++packages;
			} 
			else
			if (c.isUnitOrInterface()) {
				++classes;
			}
			else
			if (c.isFunction()) {
				++methods;
			}
			else
			if (c.isGlobalVar()) {
				++variables;
			}
		}
	}

}
