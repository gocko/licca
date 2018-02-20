package gdn.util;

import gdn.GDNLink;
import gdn.GDNNode;

import java.util.LinkedList;

public class GDNStruct {
	
	private LinkedList<GDNNode> nodes;
	private LinkedList<GDNLink> links;
	
	public GDNStruct(LinkedList<GDNNode> nodes, LinkedList<GDNLink> links){
		this.nodes=nodes;
		this.links=links;
		
	}

	public LinkedList<GDNNode> getNodes() {
		return nodes;
	}

	public void setNodes(LinkedList<GDNNode> nodes) {
		this.nodes = nodes;
	}

	public LinkedList<GDNLink> getLinks() {
		return links;
	}

	public void setLinks(LinkedList<GDNLink> links) {
		this.links = links;
	}
	
	
	

}
