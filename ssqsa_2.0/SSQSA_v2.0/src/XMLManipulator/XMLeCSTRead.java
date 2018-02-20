package XMLManipulator;

import java.util.*;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.io.File;
import java.io.IOException;

import org.w3c.dom.*;

public class XMLeCSTRead {
	
	public Document document;

	// This method gets the active child from the DOM tree.
	public Child getChildElement(Node n)
	{
		NodeList nodeList = n.getChildNodes();

		if (nodeList.getLength()!= 0){
			
			Child startChild = new Child();
			ArrayList aChildren = new ArrayList();
			Token aToken = new Token();
		
		
			for (int i=0; i < nodeList.getLength(); i++) {
			
				Node subNode = nodeList.item(i);
				
				if (subNode.getNodeName().compareTo("token") == 0)
				{
					NamedNodeMap attributes = subNode.getAttributes();
							
					aToken.text = attributes.getNamedItem("text").getNodeValue();
					aToken.index = attributes.getNamedItem("index").getNodeValue();
					aToken.type = attributes.getNamedItem("type").getNodeValue();
					try{
						aToken.line = Integer.parseInt(attributes.getNamedItem("line").getNodeValue().trim());
					}catch(NumberFormatException nfe) {
						System.out.println("NumberFormatException: " + nfe.getMessage());
					}
					aToken.column = attributes.getNamedItem("column").getNodeValue();
				}
				else if (subNode.getNodeName().compareTo("childElement") == 0)
				{
					Child aChild = new Child();
					aChild = getChildElement(subNode);
					aChildren.add(aChild);
				}
			}
			startChild.setToken(aToken);
			startChild.setChildren(aChildren);

			return startChild;
					
		}
		else 	return null;

	}
}