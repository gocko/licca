/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst.universalNodes;

import gdn.GDNNode;

import java.util.HashMap;


public class LocalSymbolTable {

	private HashMap<String, Type> localNames = 
		new HashMap<String, Type>();
	
	private HashMap<String, String> localNamesPure =
		new HashMap<String, String>();
	
	
	public boolean insertName(String varName, Type typeECSTNode, String varType) {
		if (localNames.containsKey(varName))
			return false;
		
		localNames.put(varName, typeECSTNode);
		localNamesPure.put(varName, varType);
		return true;
	}
	
	public GDNNode getType(String name) {
		Type t = localNames.get(name);
		if (t != null) {
			return t.getGDNNodeRepresentingType();
		}
		
		return null;
	}
		
	public String getTypeAsStr(String name) {
		String s = localNamesPure.get(name);
		if (s != null)
			return s;
		
		return null;
	}
	
	public boolean nameDeclaredHere(String varName) {
		return localNames.containsKey(varName);
	}
	
}
