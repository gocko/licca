package XMLManipulator;

import java.util.*;

public class Child {

	private ArrayList<Child> children = new ArrayList<Child>();
	private Token token;
	
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
	public void setToken(Token token) {
		this.token = token;
	}

	/**
	 * @return the token
	 */
	public Token getToken() {
		return token;
	}

 
}
