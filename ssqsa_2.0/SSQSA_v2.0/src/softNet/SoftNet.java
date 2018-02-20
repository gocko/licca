/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package softNet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.collections15.Transformer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import gdn.GDNLinkType;
import gdn.GDNNodeType;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.io.PajekNetWriter;

public class SoftNet {

	private String name;
	
	public class SNNode { 
		public String name;
		public GDNNodeType type;
		
		public SNNode(String name) {
			this.name = name;
		}
	}
	
	public class SNLink { 
		public SNNode src;
		public SNNode dst;
		public String type;
		
		public SNLink(SNNode src, SNNode dst, String type) {
			this.src = src;
			this.dst = dst;
			this.type = type;
		}
	}
	
	private DirectedSparseGraph<SNNode, SNLink> net;
		
	private HashMap<String, SNNode> nodeMap;
	
	public SoftNet(String name) {
		net = new DirectedSparseGraph<SNNode, SNLink>();
		nodeMap = new HashMap<String, SNNode>();
		this.name = name;
	}
	
	
	
	public SoftNet(Document doc, String[] nodeFilter, String[] edgeFilter){
	/**
	 * This constructor reads from GDN XML file and creates SoftNet structure
	 * 
	 * SoftNet is a structure similar to GND
	 * It contains less information than GDN file
	 * 

	 * 
	 * @param doc
	 *            - GDN XML file this method reads from
	 */
	
		this.name = doc.getBaseURI();
		net = new DirectedSparseGraph<SNNode, SNLink>();
		nodeMap = new HashMap<String, SNNode>();
		
		System.out.println("usao sam u metod za softnet");
		
		getEdges(doc, edgeFilter);
		getNodes(doc, nodeFilter);
		
	}

	public void getNodes(Document doc, String[] filter) {
		NodeList nl = doc.getElementsByTagName("node");
		if (nl != null && nl.getLength() > 0) {
			for (int i = 0; i < nl.getLength(); i++) {

				// get the node element
				Element el = (Element) nl.item(i);

				// get the id
				String name = el.getAttribute("id");
				NodeList data = el.getElementsByTagName("data");
				Element type = (Element)data.item(0);
				String nodeTypeName = type.getTextContent();
				GDNNodeType NodeType = GDNNodeType.valueOf(nodeTypeName);
				
				boolean inFilter = true;
				if (filter!=null){
					inFilter = false;				
					for (int j=0; j < filter.length; j++){
						inFilter = inFilter || (filter[j].compareToIgnoreCase(NodeType.toString())==0);
					}
				}
				if (inFilter){
					this.updateWithNode(name);
				}
				

				

			}

		}
	}
	
	
	


	public void getEdges(Document doc, String[] filter) {
		NodeList edges = doc.getElementsByTagName("edge");
		if (edges != null && edges.getLength() > 0) {
			for (int i = 0; i < edges.getLength(); i++) {

				Element el = (Element) edges.item(i);

				String source = el.getAttribute("source");
				String target = el.getAttribute("target");

				NodeList data = el.getElementsByTagName("data");

				Element type = (Element) data.item(0);
				String edgeType = type.getTextContent();

				GDNLinkType LinkType = GDNLinkType.valueOf(edgeType);
				boolean inFilter = true;
				if (filter!=null){
					inFilter = false;				
					for (int j=0; j < filter.length; j++){
						inFilter = inFilter || (filter[j].compareToIgnoreCase(LinkType.toString())==0);
					}
				}
				if (inFilter){
					this.updateWithLink(source, target, LinkType.toString());
				}

			}

		}
	}
	
	public String getName() {
		return name;
	}
	
	private SNNode getNode(String nodeName) {
		SNNode ret = nodeMap.get(nodeName);
		if (ret == null) {
			ret = new SNNode(nodeName);
			net.addVertex(ret);
			nodeMap.put(nodeName, ret);
		}
		
		return ret;
	}
	
	public void updateWithLink(String srcName, String dstName, String type) {
		SNNode srcNode = getNode(srcName);
		SNNode dstNode = getNode(dstName);
		SNLink link = new SNLink(srcNode, dstNode, type);
		net.addEdge(link, srcNode, dstNode, EdgeType.DIRECTED);
	}
	
	public void updateWithNode(String nodeName) {
		getNode(nodeName);
	}
	
	private class NodeTransformer implements Transformer<SNNode, String> {
		@Override
		public String transform(SNNode arg0) {
			return arg0.name;
		}
	}
	
	private class LinkTransformer implements Transformer<SNLink, Number> {

		@Override
		public Number transform(SNLink arg0) {
			return new Integer(1);
		}
	}
	
	public void exportToPajek(String outFilePath) 
		throws IOException
	{
		PajekNetWriter<SNNode, SNLink> pajko = new PajekNetWriter<SNNode, SNLink>();
		pajko.save(net, outFilePath, new NodeTransformer(), new LinkTransformer());
	}
	
	public void exportNative(String out) 
		throws IOException
	{
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(out)));
		
		pw.println("#nodes");
		Iterator<SNNode> nit = net.getVertices().iterator();
		while (nit.hasNext()) {
			String nodeName = nit.next().name;
			pw.println(nodeName);
		}
			
		pw.println("#links");
		Iterator<SNLink> lit = net.getEdges().iterator();
		while (lit.hasNext()) {
			SNLink cd = lit.next();
			String srcName = cd.src.name;
			String dstName = cd.dst.name;
			pw.println(srcName + "," + dstName + "," + cd.type);
		}
			
		pw.close();
	}
	
	public DirectedSparseGraph<SNNode, SNLink> getNet() {
		return net;
	}
	
	

}
