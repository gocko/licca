/*
 * Copyright (C) 2012-2013 by Milos Savic 
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst;

import ecst.universalNodes.Name;
import ecst.universalNodes.PackageDecl;
import ecst.universalNodes.ConcreteUnitDecl;
import ecst.universalNodes.InterfaceUnitDecl;
import ecst.universalNodes.FunctionDecl;
import ecst.universalNodes.AttributeDecl;
import ecst.universalNodes.TypeDecl;

import util.LOG;

public class ECSTNamedNode extends ECSTNode {

	protected String name = null;
	
	public static final String NO_NAME = "NO_NAME";
	public static final String NAME_ERROR = "NAME_ERROR";
	public static final String NO_CANONICAL_NAME = "NO_CANONICAL_NAME";
	public static final String CANONICAL_NAME_ERROR = "CANNONICAL_NAME_ERROR";
	
	protected String canonicalName = null;
	
	protected boolean mustHaveName;
	
	public ECSTNamedNode(ShortToken token, ECSTNode parent, boolean mustHaveName) {
		super(token, parent);
		this.mustHaveName = mustHaveName;
	}
	
	/**
	 * @return name of node or ECSTNamedNode.NO_NAME or ECSTNamedNode.NAME_ERROR
	 */
	public String getName() {
		if (name == null) {
			boolean resolvedName = false;
			boolean multipleNames = false;
			
			for (int i = 0; i < childs.size(); i++) {
				if (childs.get(i) instanceof Name) {
					if (!resolvedName) {
						Name nameNode = (Name) childs.get(i);
						name = nameNode.getName();
						resolvedName = true;
					} else {
						multipleNames = true;
					}
				}
			}
			
			if (!resolvedName) {
				if (mustHaveName) {
					LOG.error("There is no NAME node for " + token.getText() + " subtree, " + toRootFingerPrint());
					name = NAME_ERROR;
				} else {
					name = NO_NAME;
				}
			} else {
				if (multipleNames) {
					LOG.warning("More than one NAME node in " + token.getText() + " subtree, " + toRootFingerPrint());
				}
			}
		}
		
		return name;
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
		
		sb.append("]");
		return sb.toString();
	}
	
	public static boolean canonicalUniversalNode(ECSTNode node) {
		return 
		node instanceof PackageDecl       ||
		node instanceof ConcreteUnitDecl  ||
		node instanceof InterfaceUnitDecl ||
		node instanceof AttributeDecl     ||
		node instanceof FunctionDecl      ||
		node instanceof TypeDecl          ;
	}
	
	
	/**
	 * @return canonical name of node or ECTSNamedNode.NO_CANONICAL_NAME or ECSTNamedNode.NAME_NODE_ERROR
	 */
	public String getCanonicalName() {
		if (canonicalName == null) {
			
			if (canonicalUniversalNode(this)) {
				if (this instanceof PackageDecl) {
					canonicalName = getName();
				} else {
					ECSTNode tmp = parent;
					while (tmp != null && !canonicalUniversalNode(tmp)) {
						tmp = tmp.getParent();
					}
					
					if (tmp == null) {
						canonicalName = getName();
					}
					else {
						if (canonicalUniversalNode(tmp)) {
							ECSTNamedNode firstHierarchicalAbove = (ECSTNamedNode) tmp;
							canonicalName = firstHierarchicalAbove.getCanonicalName() + "." + getName();
						} else {
							LOG.error("Unable to determine canonical name for " 
						                            + token.getText() + ", " + toRootFingerPrint());
							canonicalName = CANONICAL_NAME_ERROR;
						}
					}
				}
			}
			else
				canonicalName = NO_CANONICAL_NAME;
			
		}
		
		return canonicalName;
	}
	
	public void resetName() {
		name = null;
		canonicalName = null;
	}
}
