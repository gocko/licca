/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package sneipl;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;

import gdn.GDN;
import gdn.GDNFuncNode;
import gdn.GDNNode;
import util.LOG;

/**
 * Counts how many function have the following property
 * Hard(f) <--> there is another function with the same name (f) and the same
 *              number of arguments in the same unit or one of parent or child units
 */
public class HardToMatchFunction {

	private GDN gdn;
	
	private int numFunctions = 0;
	private int hardToMatch = 0;
	
	public HardToMatchFunction(GDN gdn) {
		this.gdn = gdn;
	}
	
	public void analyze() {
		Iterator<GDNNode> it = gdn.getNet().getVertices().iterator();
		while (it.hasNext()) {
			GDNNode n = it.next();
			if (n instanceof GDNFuncNode) {
				++numFunctions;
				
				GDNFuncNode f = (GDNFuncNode) n;
				if (isHardToMatch(f)) {
					++hardToMatch;
					f.setHardToMatch();
				}
			}
		}
	}
	
	private boolean isHardToMatch(GDNFuncNode f) {
		
		GDNNode scope = gdn.getScope(f);
		
		// this should never happen
		if (scope == null) {
			LOG.warning("HardToMatchFunction, found function without enclosing scope: " + f.getName());
			return false;
		}
		
		LinkedList<GDNNode> contains = gdn.getContains(scope);
		for (int i = 0; i < contains.size(); i++) {
			GDNNode c = contains.get(i);
			if (c instanceof GDNFuncNode && c != f) {
				GDNFuncNode cf = (GDNFuncNode) c;
				if (match(f, cf)) {
					return true;
				}
			}
		}
		
		LinkedList<GDNNode> superUnits = gdn.getAllParents(scope);
		LinkedList<GDNNode> subUnits = gdn.getAllChilds(scope);
		
		LinkedList<GDNNode> nodesInInheritanceHierarchy = new LinkedList<GDNNode>();
		nodesInInheritanceHierarchy.addAll(superUnits);
		nodesInInheritanceHierarchy.addAll(subUnits);
		
		for (GDNNode n : nodesInInheritanceHierarchy) {
			LinkedList<GDNNode> conts = gdn.getContains(n);
			for (GDNNode c : conts) {
				if (c instanceof GDNFuncNode && c != f) {
					GDNFuncNode cf = (GDNFuncNode) c;
					if (match(f, cf)) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	private boolean match(GDNFuncNode src, GDNFuncNode dst) {
		String srcName = src.getCompactFuncName();
		String dstName = dst.getCompactFuncName();
		int srcArgs = src.getParams().size();
		int dstArgs = dst.getParams().size();
		
		return srcName.compareTo(dstName) == 0 && srcArgs == dstArgs;
	}
	
	public String report() {
		StringBuilder sb = new StringBuilder();
		
		DecimalFormat df = new DecimalFormat("#.##");
		String perc = "UNDEFINED";
		if (numFunctions > 0)
			perc = df.format(100.0 * (double) hardToMatch / (double) numFunctions);
		
		sb.append("HardToMatchReport\n")
		  .append("Total functions = ").append(numFunctions).append("\n")
		  .append("Hard to match   = ").append(hardToMatch).append(", ").append(perc).append("[%]");
		
		return sb.toString();
	}
}
