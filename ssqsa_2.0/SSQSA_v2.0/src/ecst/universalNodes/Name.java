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

public class Name extends ECSTNode {

	private String name = null;
	
	public Name(ShortToken token, ECSTNode parent) {
		super(token, parent);	
	}
	
	public String getName() {
		if (name == null) {
			name = printDfsSubtree(true);
			if (name.length() == 0) 
				name = printDfsSubtree(false);
		} 
		
		if (name.startsWith("."))
			name = name.substring(1);
		
		return name;
	}
	
	public String toString() {
		return "[NAME, " + getName() + "]";
	}
}
