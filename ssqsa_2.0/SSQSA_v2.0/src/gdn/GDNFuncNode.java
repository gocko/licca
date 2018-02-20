/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package gdn;

import java.util.LinkedList;

public class GDNFuncNode extends GDNNode {

	private LinkedList<String> params = 
		new LinkedList<String>();
	
	private GDNNode[] paramsAsGDNNodes = null;
		
	private String retType;
	
	private GDNNode retTypeGDNNode = null;
	
	private boolean hardToMatch = false;
	
	
	/**
	 * compactFuncName(java.io.IOClass.method@Type1...@TypeN#RetType) = java.io.IOClass.method
	 */
	private String compactFuncName;
	
	public GDNFuncNode(String name, GDNNodeType nodeType, LinkedList<String> params, String retType, String sourceFileName) {
		super(name, nodeType, sourceFileName);
		
		this.retType = new String(retType);
		
		for (int i = 0; i < params.size(); i++) {
			this.params.addLast(new String(params.get(i)));
		}
		
		int indexOfAt = name.indexOf("@");
		if (indexOfAt == -1) {
			int indexOfTar = name.indexOf("#");
			if (indexOfTar == -1) {
				compactFuncName = name;
			} else {
				compactFuncName = name.substring(0, indexOfTar);
			}
		} else {
			compactFuncName = name.substring(0, indexOfAt);
		}
		
		paramsAsGDNNodes = new GDNNode[params.size()];
		for (int i = 0; i < paramsAsGDNNodes.length; i++)
			paramsAsGDNNodes[i] = null;
	}
	
	public String getRetType() {
		return retType;
	}
	
	public GDNNode getRetTypeAsGDNNode() {
		return retTypeGDNNode;
	}
	
	public LinkedList<String> getParams() {
		return params;
	}
	
	public String getCompactFuncName() {
		return compactFuncName;
	}

	public void setType(GDNNode gdnReflectingType) {
		retTypeGDNNode = gdnReflectingType;
	}
	
	public void recordParamType(GDNNode paramType, int paramNo) {
		paramsAsGDNNodes[paramNo] = paramType;
	}
	
	public GDNNode[] getParamTypes() {
		return paramsAsGDNNodes;
	}
	
	public void setHardToMatch() {
		hardToMatch = true;
	}
	
	public boolean isHardToMatch() {
		return hardToMatch;
	}
}
