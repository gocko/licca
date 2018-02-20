/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package gdn;

public class GDNVarNode extends GDNNode {

	private String varTypeStr;
	
	private GDNNode varTypeGdn = null;
	
	public GDNVarNode(String name, GDNNodeType nodeType, String sourceFileName, String varType) {
		super(name, nodeType, sourceFileName);
		this.varTypeStr = varType;
	}

	public String getVarTypeAsString() {
		return varTypeStr;
	}
	
	public GDNNode getVarTypeAsGDN() {
		return varTypeGdn;
	}

	public void setType(GDNNode type) {
		varTypeGdn = type;
	}
}
