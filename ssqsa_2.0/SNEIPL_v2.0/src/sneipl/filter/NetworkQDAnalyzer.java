/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package sneipl.filter;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import sneipl.filter.SoftNet.SNLink;
import sneipl.filter.SoftNet.SNNode;
import edu.uci.ics.jung.algorithms.cluster.WeakComponentClusterer;
import edu.uci.ics.jung.algorithms.filters.FilterUtils;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * Network analyzer computes macroscopic properties
 * of extracted software networks
 * 
 * @author svc
 */
public class NetworkQDAnalyzer {
	
	protected DirectedSparseGraph<SNNode, SNLink> net;
	protected DirectedSparseGraph<SNNode, SNLink> gwcc;
	
	private String name;
	
	private int maxInDeg = 0;
	private int maxOutDeg = 0;
	private int maxTotDeg = 0;
	
	private String maxInDegName = "none";
	private String maxOutDegName = "none";
	private String maxTotDegName = "none";
	
	private double avgIn = 0.0;
	private double avgOut = 0.0;
	private double avgTot = 0.0;
	
	private int numWCC = 0;
	private int numGWCCNodes = 0;
	private int numGWCCLinks = 0;
	
	private int zeroIn = 0;
	private int zeroOut = 0;
	
	public NetworkQDAnalyzer(SoftNet net) {
		this.net = net.getNet();
		this.name = net.getName();
	}
	
	protected double round(double d) {
		d *= 1000;
		int di = (int) d;
		return (double) di / (double) 1000;
	}
	
	protected double perc(int f, int total) {
		double p = (double) f / (double) total;
		
		p *= 100000;
		int pi = (int) p;
		
		return (double) 100.0 * pi / 100000.0;
	}
	
	private void avgDeg() {
		Collection<SNNode> nc = net.getVertices();
		Iterator<SNNode> ni = nc.iterator();
		
		double sin = 0.0, sout = 0.0, stot = 0.0;
		
		while (ni.hasNext()) {
			SNNode n = ni.next();
			sin += net.inDegree(n);
			sout += net.outDegree(n);
			stot += net.degree(n);
		}
		
		avgIn = round(sin / (double) net.getVertexCount());
		avgOut = round(sout / (double) net.getVertexCount());
		avgTot = round(stot / (double) net.getVertexCount());
	}
	
	private void connectedComponents() {
		WeakComponentClusterer<SNNode, SNLink> wcc = new WeakComponentClusterer<SNNode, SNLink>();
		Set<Set<SNNode>> clusters = wcc.transform(net);
		
		numWCC = clusters.size();
		
		Iterator<Set<SNNode>> clIt = clusters.iterator();
		int maxSize = Integer.MIN_VALUE;
		Set<SNNode> gwccNodes = null;
		while (clIt.hasNext()) {
			Set<SNNode> cluster = clIt.next();
			if (cluster.size() > maxSize) {
				maxSize = cluster.size();
				gwccNodes = cluster;
			}
		}
		
		if (gwccNodes != null) {
			numGWCCNodes = gwccNodes.size();
			gwcc = FilterUtils.createInducedSubgraph(gwccNodes, net);
			numGWCCLinks = gwcc.getEdgeCount();
		}
	}
	
	public String getReport() {
		StringBuilder sb = new StringBuilder();
		sb.append("Network ").append(name).append("\n");
		sb.append("#nodes = ").append(net.getVertexCount()).append("\n");
		sb.append("#links = ").append(net.getEdgeCount()).append("\n");
		
		int numIsolated = detIsolated();
		int nonIsolated = net.getVertexCount() - numIsolated;
		sb.append("#isolated = ").append(numIsolated).append(", ").append(perc(numIsolated, net.getVertexCount())).append("%").append("\n");
		sb.append("#nonisolated = ").append(nonIsolated).append(", ").append(perc(nonIsolated, net.getVertexCount())).append("%").append("\n");
		sb.append("#zeroIn = ").append(zeroIn).append(", ").append(perc(zeroIn, net.getVertexCount())).append("%\n");
		sb.append("#zeroOut = ").append(zeroOut).append(", ").append(perc(zeroOut, net.getVertexCount())).append("%\n");
		
		avgDeg();
		sb.append("avg-in-deg = ").append(avgIn).append("\n");
		sb.append("avg-out-deg = ").append(avgOut).append("\n");
		sb.append("avg-tot-deg = ").append(avgTot).append("\n");
		
		maxDeg();
		sb.append("maxIn = ").append(maxInDeg).append(", ").append(maxInDegName).append("\n");
		sb.append("maxOut = ").append(maxOutDeg).append(", ").append(maxOutDegName).append("\n");
		sb.append("maxTot = ").append(maxTotDeg).append(", ").append(maxTotDegName).append("\n");
		
		connectedComponents();
		sb.append("#wcc = ").append(numWCC).append("\n");
		sb.append("#gwcc_nodes = ").append(numGWCCNodes).append(", ").append(perc(numGWCCNodes, net.getVertexCount())).append("%").append("\n");
		sb.append("#gwcc_links = ").append(numGWCCLinks).append(", ").append(perc(numGWCCLinks, net.getEdgeCount())).append("%").append("\n");
		
		sb.append("-------------------------------------\n\n\n");
		return sb.toString();
	}
	
	private int detIsolated() {
		int numIsol = 0;
		
		Collection<SNNode> nc = net.getVertices();
		Iterator<SNNode> ni = nc.iterator();
		while (ni.hasNext()) {
			SNNode n = ni.next();
			if (net.degree(n) == 0) {
				++numIsol;
			}
			
			if (net.inDegree(n) == 0)
				++zeroIn;
			
			if (net.outDegree(n) == 0)
				++zeroOut;
		}
		
		return numIsol;
	}
	
	private void maxDeg() {
		Collection<SNNode> nc = net.getVertices();
		Iterator<SNNode> ni = nc.iterator();
		while (ni.hasNext()) {
			SNNode n = ni.next();
			if (net.degree(n) > maxTotDeg) {
				maxTotDeg = net.degree(n);
				maxTotDegName = n.name;
			}
			
			if (net.inDegree(n) > maxInDeg) {
				maxInDeg = net.inDegree(n);
				maxInDegName = n.name;
			}
			
			if (net.outDegree(n) > maxOutDeg) {
				maxOutDeg = net.outDegree(n);
				maxOutDegName = n.name;
			}
		}
	}

}
