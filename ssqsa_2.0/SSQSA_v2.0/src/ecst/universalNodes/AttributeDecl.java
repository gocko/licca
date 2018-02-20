/*
 * Copyright (C) 2012-2013 by Milos Savic 
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst.universalNodes;

import ecst.ECSTNode;
import ecst.ECSTTypedNode;
import ecst.ShortToken;

public class AttributeDecl extends ECSTTypedNode {

	public AttributeDecl(ShortToken token, ECSTNode parent) {
		// mustHaveName = true, mustHaveType = true
		super(token, parent, true, true);
	}

}
