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

public class UnknownRetType extends ECSTNode {

	public UnknownRetType(ECSTNode parent) {
		super("$$$_UNKNOWN_RET_TYPE_###", parent);
	}
	
	public UnknownRetType(ShortToken token ,ECSTNode parent) {
		super(token, parent);
	}

}
