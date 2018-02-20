/*
 * Copyright (C) 2012-2013 by Milos Savic 
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst.universalNodes;

import java.util.LinkedList;

import ecst.ECSTNode;
import ecst.ECSTTypedNode;
import ecst.ShortToken;
import gdn.GDNNode;

public class FunctionDecl extends ECSTTypedNode implements SymTab {

	private LinkedList<String> paramTypes = null;
	private String retType = null;
	
	public LocalSymbolTable symTab;
	
	public FunctionDecl(ShortToken token, ECSTNode parent) {
		// mustHaveName = true
		// mustHaveType = false
		super(token, parent, true, false);
		symTab = new LocalSymbolTable();
	}
		
	public String getCanonicalName() {
		if (canonicalName == null) {
			canonicalName = resolve();
		}
		
		return canonicalName;
	}
	
	private String resolve() {
		String fullName = super.getCanonicalName();
		LinkedList<String> pTypes = getParamTypes();
		String rType = getRetType();
	    
		for (int i = 0; i < pTypes.size(); i++) {
			fullName = fullName + "@" + pTypes.get(i);
		}
			
		fullName = fullName + "#" + rType;
		
		return fullName;
	}
	
	
	public LinkedList<String> getParamTypes() {
		if (paramTypes == null) {
			
			FormalParamList fpl = null;
			for (int i = 0; i < childs.size(); i++) {
				if (childs.get(i) instanceof FormalParamList) {
					fpl = (FormalParamList) childs.get(i);
				}
			}
			
			paramTypes = new LinkedList<String>();
			
			if (fpl != null) {
				LinkedList<ECSTNode> fplChilds = fpl.getChilds();
				
				for (int i = 0; i < fplChilds.size(); i++) {
					ECSTNode fplChild = fplChilds.get(i);
					if (fplChild instanceof ParameterDecl) {
						ParameterDecl param = (ParameterDecl) fplChild;
						paramTypes.add(param.getType());
					}
				}
			}
		}
		
		return paramTypes;
	}
	
	public String getRetType() {
		if (retType == null) {
			retType = getType();
			if (retType == ECSTTypedNode.NO_TYPE)
				retType = "VOID";
		}
		
		return retType;
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
