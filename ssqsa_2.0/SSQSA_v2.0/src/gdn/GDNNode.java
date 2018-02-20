/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package gdn;

import java.util.HashSet;


public class GDNNode  {

	protected GDNNodeType type;
	
	protected String name;
	
	protected String compactName;
	
	protected String sourceFileName;
	
	// what is instantiated by this node (unit, package, class, function, etc.)
	// and all units referencing this node
	private HashSet<GDNNode> instantiatesSet = null;
		
		
	public GDNNode(String name, GDNNodeType nodeType, String sourceFileName) {
		this.name = new String(name);
		this.type = nodeType;
		this.compactName = resolveCompactName(name);
		this.sourceFileName = sourceFileName;
	}
	
	public GDNNode(String name, GDNNodeType nodeType) {
		this.name = new String(name);
		this.type = nodeType;
		this.compactName = resolveCompactName(name);
		
	}
	
	public GDNNode(){
		
	}
	
	private static String resolveCompactName(String name) {
		String compactName = new String(name);
		
		int indexOfAt = compactName.indexOf("@");
		if (indexOfAt == -1) {
			int indexOfTar = compactName.indexOf("#");
			if (indexOfTar != -1) {
				compactName = compactName.substring(0, indexOfTar);
			}
		} else {
			compactName = compactName.substring(0, indexOfAt);
		}
		
		int indexOfLastDot = compactName.lastIndexOf('.');
		if (indexOfLastDot != -1)
			compactName = compactName.substring(indexOfLastDot + 1);
		
		return compactName;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCompactName() {
		return compactName;
	}
	
	public GDNNodeType getType() {
		return type;
	}
	
	public String getDesc() {
		return GDNNodeType.desc(type) +  ": " + name;
	}
	
	public String getSourceFileName() {
		return sourceFileName;
	}

	public boolean isUnit() {
		return type == GDNNodeType.UNIT;
	}
	
	public boolean isInterface() {
		return type == GDNNodeType.INTERFACE;
	}
	
	public boolean isUnitOrInterface() {
		return isUnit() || isInterface();
	}
	
	public boolean isUnitOrInterfaceOrPackage() {
		return isUnit() || isInterface() || isPackage();
	}
	
	public boolean isPackage() {
		return type == GDNNodeType.PACKAGE;
	}
	
	public boolean isFunction() {
		return type == GDNNodeType.FUNCTION;
	}
	
	public boolean isGlobalVar() {
		return type == GDNNodeType.GLOBAL_VAR;
	}
	
	public void setInstantiatesSet(HashSet<GDNNode> instSet) {
		this.instantiatesSet = instSet;
	}
	
	public HashSet<GDNNode> getInstantiatesSet() {
		return instantiatesSet;
	}
}
