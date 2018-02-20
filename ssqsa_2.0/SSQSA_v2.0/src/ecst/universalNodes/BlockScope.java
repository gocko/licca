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

public class BlockScope extends ECSTNode implements SymTab {

	public LocalSymbolTable symTab;
	
	public BlockScope(ShortToken token, ECSTNode parent) {
		super(token, parent);
		
		symTab = new LocalSymbolTable();
	}

	@Override
	public boolean insertName(String varName, Type typeECSTNode, String varType) {
		return symTab.insertName(varName, typeECSTNode, varType);
	}

	@Override
	public GDNNode getType(String name) {
		return symTab.getType(name);
	}

	@Override
	public String getTypeAsStr(String name) {
		return symTab.getTypeAsStr(name);
	}

	@Override
	public boolean nameDeclaredHere(String varName) {
		return symTab.nameDeclaredHere(varName);
	}
}
