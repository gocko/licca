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

public class FunctionCall extends ECSTNamedNode {

	public FunctionCall(ShortToken token, ECSTNode parent) {
		super(token, parent, true);
	}
	
	// ako nema ARGUMENT_LIST medju djecom onda nema argumenata
}
