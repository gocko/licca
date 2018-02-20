/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package dmetrics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

import sneipl.filter.SoftNet;
import sneipl.filter.SoftNet.SNLink;
import sneipl.filter.SoftNet.SNNode;

public class InheritanceMetrics {

	private SoftNet extGraph;
	private String outDir;
	
	public InheritanceMetrics(SoftNet extGraph, String outDir) {
		this.extGraph = extGraph;
		this.outDir = outDir;
	}
	
	public void calc()
		throws IOException
	{
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outDir + "inheritanceMetrics.txt")));
	
		DirectedSparseGraph<SNNode, SNLink> g = extGraph.getNet();
		Collection<SNNode> nc = g.getVertices();
		Iterator<SNNode> it = nc.iterator();
		pw.println("CLASS_NAME, NOC, DIT");
		int maxNoc = 0;
		int maxDit = 0;
		LinkedList<Integer> nocs = new LinkedList<Integer>();
		LinkedList<Integer> dits = new LinkedList<Integer>();
		
		while (it.hasNext()) {
			SNNode node = it.next();
			String nodeName = node.name;
			int noc = g.inDegree(node);
			int dit = calcDit(node, g);
			
			if (dit > maxDit)
				maxDit = dit;
			
			if (noc > maxNoc)
				maxNoc = noc;
			
			nocs.add(noc);
			dits.add(dit);
			
			pw.println(nodeName + ", " + noc + ", " + dit);
		}
		
		pw.close();
		
		distribution(dits, maxDit, "ditDistr.txt");
		distribution(nocs, maxNoc, "nocDistr.txt");
	
	}
	
	private int calcDit(SNNode node, DirectedSparseGraph<SNNode, SNLink> g) {
		SNNode tmp = node;
		int dit = 0;
		
		while (tmp != null) {
			Collection<SNLink> outLinks = g.getOutEdges(tmp);
			if (outLinks == null || outLinks.size() == 0)
				break;
			
			SNLink outLink = outLinks.iterator().next();
			tmp = g.getOpposite(tmp, outLink);
			if (tmp != null)
				++dit;
		}
		
		return dit;
	}
	
	private void distribution(LinkedList<Integer> val, int max, String out) 
		throws IOException
	{
		PrintWriter o = new PrintWriter(new BufferedWriter(new FileWriter(outDir + out)));
		
		int[] d = new int[max + 1];
		for (int i = 0; i < val.size(); i++) {
			d[val.get(i)]++;
		}
		
		for (int i = 0; i < d.length; i++) {
			if (d[i] != 0) {
				o.println(i + " " + d[i]);
			}
		}
		
		o.close();
	}
}
