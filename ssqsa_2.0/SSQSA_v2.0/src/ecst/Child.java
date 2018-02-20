package ecst;

import java.util.*;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Child {
 
	private ArrayList<Child> children;
	private ShortToken token;
	
	public Child(Node node){
		
		NodeList nodeList = node.getChildNodes();

		if (nodeList.getLength()!= 0){
						
			children = new ArrayList<Child>();
					
			for (int i=0; i < nodeList.getLength(); i++) {
			
				Node subNode = nodeList.item(i);
				
				if (subNode.getNodeName().compareTo("token") == 0)
				{
					this.token = readToken(subNode);
				}
				else if (subNode.getNodeName().compareTo("childElement") == 0)
				{					
					Child aChild = new Child(subNode);
					children.add(aChild);
				}
			}
			
			//this.children = aChildren;
	}

	}
	
	
	public void printChild()
	{
		System.out.println("text " + this.getToken().getText());
		
		for (int i = 0; i < this.getChildren().size(); i++)
		{
			((Child)this.getChildren().get(i)).printChild();
		}
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(ArrayList<Child> children) {
		this.children = children;
	}

	/**
	 * @return the children
	 */
	public ArrayList<Child> getChildren() {
		return children;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(ShortToken token) {
		this.token = token;
	}

	/**
	 * @return the token
	 */
	public ShortToken getToken() {
		return token;
			}
	
	public ShortToken readToken(Node subNode) {
		NamedNodeMap attributes = subNode.getAttributes();
				
		String text = attributes.getNamedItem("text").getNodeValue();
		//String index = attributes.getNamedItem("index").getNodeValue();
		//String type = attributes.getNamedItem("type").getNodeValue();
		String line = attributes.getNamedItem("line").getNodeValue();
		String column = attributes.getNamedItem("column").getNodeValue();
		
		return new ShortToken(text, line, column);
 
	}
	
	/*public LongToken readToken(Node subNode) {
		NamedNodeMap attributes = subNode.getAttributes();
				
		String text = attributes.getNamedItem("text").getNodeValue();
		String index = attributes.getNamedItem("index").getNodeValue();
		String type = attributes.getNamedItem("type").getNodeValue();
		String line = attributes.getNamedItem("line").getNodeValue();
		String column = attributes.getNamedItem("column").getNodeValue();
		
		return new ShortToken(text, line, column);
 
	}*/
	
	


 
}
