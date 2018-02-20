/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst.universalNodes;

import gdn.GDNNode;

public interface SymTab {

	boolean insertName(String varName, Type typeECSTNode, String varType);
	
	GDNNode getType(String name);
	
	String getTypeAsStr(String name);
	
	boolean nameDeclaredHere(String varName);
}
