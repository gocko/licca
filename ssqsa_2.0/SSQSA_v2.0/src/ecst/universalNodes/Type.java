/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst.universalNodes;

import ecst.ECSTNamedNode;
import ecst.ECSTNode;
import ecst.ShortToken;

import gdn.GDNNode;

public class Type extends ECSTNamedNode {

	private GDNNode gdnRepresentingType = null;
	
	public Type(ShortToken token, ECSTNode parent) {
		super(token, parent, false);
	}
	
	public boolean hasNameNode() {
		for (int i = 0; i < childs.size(); i++) {
			if (childs.get(i) instanceof Name) {
				return true;
			}
		}
		
		return false;
	}
	
	public void setGDNNodeRepresentingType(GDNNode gdnNode) {
		gdnRepresentingType = gdnNode;
	}
	
	public GDNNode getGDNNodeRepresentingType() {
		return gdnRepresentingType;
	}

}
