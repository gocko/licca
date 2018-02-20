/*
 * Copyright (C) 2012-2013 by Milos Savic 
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst;


import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import ecst.universalNodes.BlockScope;
import ecst.universalNodes.ConcreteUnitDecl;
import ecst.universalNodes.FunctionDecl;
import ecst.universalNodes.Ignore;
import ecst.universalNodes.InterfaceUnitDecl;
import ecst.universalNodes.TypeDecl;
import util.LOG;
import XMLManipulator.XMLReader;

/**
 * Enriched Concrete Syntax Tree
 * 29 jul 2012, svc@dmi.uns.ac.rs
 */
public class ECSTree {

	// ECST root node
	private ECSTNode root = null;
	
	// path to xml file containing tree
	private String xmlFile;
	
	public ECSTree(String xmlFile) { 
		try {			
			this.xmlFile = xmlFile;
			XMLReader xmlR = new XMLReader();
			Document doc = xmlR.initXMLParser(xmlFile);
			parse(doc);
			clean();
		} catch (ECSTLoaderException e) {
			LOG.error("Unable to load tree from " + xmlFile + ", ECSTLoaderException");
			e.dump();
		}
	}
	
	@Override
	public String toString() {
		return xmlFile;
	}
	
	/*private Document initXMLParser(String xmlFile) 
		throws ECSTLoaderException
	{
		File file = new File(xmlFile);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
				throw new ECSTLoaderException("Cannot instantiate new document builder," +
					"ParserConfigurationException", e);
		}
	
		Document doc = null;
		try {
			doc = db.parse(file);
		} catch (SAXException e) {
			throw new ECSTLoaderException("Cannot parse " + xmlFile + ", SAXException ", e);
		} catch (IOException e) {
			throw new ECSTLoaderException("Cannot parse " + xmlFile + ", IOException ", e);
		}
		
		doc.getDocumentElement().normalize();
	
		return doc;
	}*/
	
	private String elementToString(Node item) {
		return item.getAttributes().toString();
		
	}
	
	private void parse(Document doc) 
		throws ECSTLoaderException
	{
		LinkedList<ShortToken> rootTokens = new LinkedList<ShortToken>();
		Element rootElement = doc.getDocumentElement();
		NodeList rootNodes = rootElement.getChildNodes();
		for (int i = 0; i < rootNodes.getLength(); i++) {
			Node current = rootNodes.item(i);
			if (current.getNodeType() == Node.ELEMENT_NODE) {
				if (((Element) current).getTagName().equals("token")) {
					Child currentChild = new Child(current.getParentNode());
					rootTokens.add(currentChild.getToken());
				}
			}
		}
		
		if (rootTokens.size() == 0) {
			throw new ECSTLoaderException("Invalid XML file " + xmlFile + ", there is not root element?!");
		} 
		else
		if (rootTokens.size() > 1) {
			throw new ECSTLoaderException("Invalid XML file " + xmlFile + ", there is more than one root element?!");
		}
		
		root = ECSTNodeFactory.create(rootTokens.get(0), null);
		
		LinkedList<Element> elementQueue = new LinkedList<Element>(); 
		LinkedList<ECSTNode> ecstNodeQueue = new LinkedList<ECSTNode>();
		elementQueue.add(rootElement);
		ecstNodeQueue.add(root);
		
		while (elementQueue.size() > 0) {
			ECSTNode currentECSTParent = ecstNodeQueue.removeFirst();
			Element currentXMLParent = elementQueue.removeFirst();
			NodeList childXMLNodes = currentXMLParent.getChildNodes();
			
			for (int i = 0; i < childXMLNodes.getLength(); i++) {
				Node item = childXMLNodes.item(i);
				
				/* find childElement */
				if (item.getNodeType() == Node.ELEMENT_NODE &&
					((Element) item).getTagName().equals("childElement")) 
				{
					LinkedList<ShortToken> tokenList = new LinkedList<ShortToken>();
					NodeList tmp = ((Element) item).getChildNodes();
					for (int j = 0; j < tmp.getLength(); j++) {
						Node tmpItem = tmp.item(j);
						if (tmpItem.getNodeType() == Node.ELEMENT_NODE &&
						    ((Element) tmpItem).getTagName().equals("token"))
						{
							Child child = new Child(tmpItem.getParentNode());
							tokenList.add(child.getToken());
						}
					}
				//	if (tokenList.size() != 1) {
					if (tokenList.size() > 1) {
						throw new ECSTLoaderException("Invalid xml file, " + xmlFile + ", element " + 
					                                  elementToString(item) +
								                      "has more than one token");
					}
					
					/* create ecst children node and embeed into ecst */
					if (tokenList.size() > 0) {
						ShortToken childrenToken = tokenList.get(0);
						//ECSTNode children = new ECSTNode(childrenToken, currentESCTParent);
						ECSTNode children = ECSTNodeFactory.create(childrenToken, currentECSTParent);
						currentECSTParent.addChildren(children);
					
						/* update end of queue */
						ecstNodeQueue.add(children);
						elementQueue.add((Element) item);
					}
				}
			}
		}
	}
	
	// debug method
	public void bfsDump() {
		LinkedList<ECSTNode> queue = new LinkedList<ECSTNode>();
		queue.add(root);
		System.out.println(root.getToken().getText());
		while (queue.size() > 0) {
			ECSTNode c = queue.removeFirst();
			if (ECSTNodeFactory.universalNode(c.getToken()))
				System.out.println(c.toString());
			
			LinkedList<ECSTNode> childrens = c.getChilds();
			for (int i = 0; i < childrens.size(); i++) {
				queue.add(childrens.get(i));
			}
		}
	}
	
	public ECSTNode getRoot() {
		return root;
	}
	
	private void clean() {
		LinkedList<ECSTNode> queue = new LinkedList<ECSTNode>();
		queue.add(root);
		
		while (queue.size() > 0) {
			ECSTNode current = queue.removeFirst();
			
			if (current instanceof Ignore) {
				ECSTNode parent = current.getParent();
				parent.getChilds().remove(current);
				current = null;
			}
			else
			if (current instanceof ConcreteUnitDecl  ||
			    current instanceof InterfaceUnitDecl ||
			    current instanceof FunctionDecl      ||
			    current instanceof TypeDecl          ) 
			{
				ECSTNode parent = current.getParent();
				while (parent != null && 
					   !(parent instanceof BlockScope) &&
				       !(parent.getToken().getText().compareTo("PROCEDURE_BODY") == 0)  
				) {
					parent = parent.getParent();
				}
				
				if (parent != null) {
					parent = current.getParent();
					parent.getChilds().remove(current);
					current = null;
				}
			}
			
			if (current != null) {
				for (int i = 0; i < current.getChilds().size(); i++) {
					queue.add(current.getChilds().get(i));
				}
			}
		}
	}
	
	public String createDotDescription() {
		String begin = "digraph G \n { \n" + 
				"edge [fontname=\"FreeSans\",fontsize=\"10\",labelfontname=\"FreeSans\",labelfontsize=\"10\"];\n" + 
				"node [fontname=\"FreeSans\",fontsize=\"10\",shape=record]; \n" + 
				"rankdir=TB;\n\n";
		String end = "}"; 
		String linkProp = "[color=\"midnightblue\",fontsize=\"10\",style=\"solid\",fontname=\"FreeSans\"];";
		String nodeProp = ",height=0.2,width=0.4,color=\"black\", fillcolor=\"white\", style=\"filled\"];";
		
		StringBuilder sb = new StringBuilder();
		sb.append(begin);
		LinkedList<ECSTNode> queue = new LinkedList<ECSTNode>();
		queue.add(root);
		while (queue.size() > 0) {
			ECSTNode c = queue.removeFirst();
			sb.append("Node" + c.getId() + " [label=\"" + transformTokenDot(c.getToken().getText()) + "\"" + nodeProp + "\n");
			
			LinkedList<ECSTNode> childrens = c.getChilds();
			for (int i = 0; i < childrens.size(); i++) {
				ECSTNode child = childrens.get(i);
				sb.append("Node" + c.getId() + " -> Node" + child.getId() + " " + linkProp + "\n");
				queue.add(childrens.get(i));
			}
		}
		
		sb.append(end);
		return sb.toString();
	}
	
	private String transformTokenDot(String token) {
		if (token.compareTo("{") == 0)
			return "_OPB";
		else
		if (token.compareTo("}") == 0)
			return "_CLB";
		else {
			//&quot;John&quot;
			token = token.replace("&quot;", "_QUOT_");
			token = token.replace("\"\"", "_QUOT_");
			return token;
		}
	}
}
