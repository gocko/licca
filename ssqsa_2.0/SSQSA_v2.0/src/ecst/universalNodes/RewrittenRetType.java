/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst.universalNodes;

import ecst.ECSTNode;
import ecst.ShortToken;
import gdn.GDNNode;

public class RewrittenRetType extends ECSTNode {

	private GDNNode retType;
	
	public RewrittenRetType(ShortToken token, GDNNode returnType, ECSTNode parent) {
		super(token, parent);
		this.retType = returnType;
	}
	
	public RewrittenRetType(String text, GDNNode returnType, ECSTNode parent) {
		super(text, parent);
		this.retType = returnType;
	} 
	
	public GDNNode getReturnType() {
		return retType;
	}

}
