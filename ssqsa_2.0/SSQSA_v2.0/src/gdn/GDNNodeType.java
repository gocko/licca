/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package gdn;

public enum GDNNodeType {
	PACKAGE,
	UNIT,
	INTERFACE,
	FUNCTION,
	//BLOCK_SCOPE,
	TYPE,
	GLOBAL_VAR;
	
	public static String desc(GDNNodeType nodeType) {
		switch (nodeType) {
			case PACKAGE:     return "PACKAGE";
			case UNIT:        return "UNIT";
			case FUNCTION:    return "FUNCTION";
			case INTERFACE:   return "INTERFACE";
			//case BLOCK_SCOPE: return "BLOCK_SCOPE";
			case TYPE:        return "TYPE";
			case GLOBAL_VAR:  return "GLOBAL_VAR";
			default:          return "UNKNOWN_GDN_NODE_TYPE";
		}
	}
}
