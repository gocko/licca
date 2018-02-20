/*
 * Copyright (C) 2012-2013 by Milos Savic 
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst;

import java.util.LinkedList;


import ecst.universalNodes.FunctionDecl;
import ecst.universalNodes.Instantiates;
import ecst.universalNodes.Type;
import util.LOG;

public class ECSTTypedNode extends ECSTNamedNode {

	protected String type = null;
	
	protected Type typeNode = null;
	
	public static String TYPE_ERROR = "TYPE_ERROR";
	public static String NO_TYPE    = "NO_TYPE";
	
	protected boolean mustHaveType;
	
	protected boolean typeResolved;
	
	public ECSTTypedNode(ShortToken token, ECSTNode parent, boolean mustHaveName, boolean mustHaveType) {
		super(token, parent, mustHaveName);
		this.mustHaveType = mustHaveType;	
	}
	
	public String getType() {
		if (type == null) {
			boolean resolvedType = false;
			boolean multipleTypes = false;
			
			for (int i = 0; i < childs.size(); i++) {
				if (childs.get(i) instanceof Type) {
					if (!resolvedType) {
						typeNode = (Type) childs.get(i);
						if (typeNode.hasNameNode()) 
							type = typeNode.getName();
						else
							type = typeNode.printDfsSubtree(true);
						resolvedType = true;
					} else {
						multipleTypes = true;
					}
				}
			}
			
			if (!resolvedType) {
				if (mustHaveType) {
					LOG.error("There is no TYPE node for " + token.getText() + " subtree, " + toRootFingerPrint());
					type = TYPE_ERROR;
				} else {
					type = NO_TYPE;
				}
			} else {
				if (multipleTypes && !(this instanceof FunctionDecl)) {
					LOG.warning("More than one TYPE node in " + token.getText() + " subtree, " + toRootFingerPrint());
				}
			}
		}
		
		return type;
	}
	
	public Type getTypeNode() {
		getType();
		return typeNode;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[").append(token.getText());
		sb.append(", name: ").append(getName());
		
		String canonicalName = getCanonicalName();
		
		if (canonicalName.length() > 0) { 
			sb.append(", canonical: ");
			sb.append(canonicalName);
		}
		
		sb.append(", type: ").append(getType());
		
		sb.append("]");
		return sb.toString();
	}
	
	public Instantiates findInstantiate() {
		LinkedList<ECSTNode> q = new LinkedList<ECSTNode>();

		LinkedList<ECSTNode> childs = getChilds();
		for (int i = 0; i < childs.size(); i++) {
			q.addLast(childs.get(i));
		}
		
		while (q.size() > 0) {
			ECSTNode current = q.removeFirst();
			if (current instanceof Instantiates) {
				return (Instantiates) current;
			}
			
			LinkedList<ECSTNode> cc = current.getChilds();
			for (int i = 0; i < cc.size(); i++) {
				q.addLast(cc.get(i));
			}
		}
		
		return null;
	}
	
}
