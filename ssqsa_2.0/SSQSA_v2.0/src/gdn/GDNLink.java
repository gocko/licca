/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package gdn;

import java.util.HashSet;
import java.util.Iterator;

public class GDNLink {

	private String name;
	
	private int weight;
	
	private GDNLinkType type;
	
	private GDNNode src;
	
	private GDNNode dst;
	
	private HashSet<String> explanations = 
		new HashSet<String>();
	
	public GDNLink(){
		
	}
	
	public GDNLink(String name, GDNNode src, GDNNode dst, GDNLinkType type, String explanation) {
		this.name = name;
		this.src = src;
		this.dst = dst;
		this.type = type;
		explanations.add(explanation);
		weight = 1;
	}
	
	public String getName()      { return name; }
	public int getWeight()       { return weight; }
	public GDNNode getSrc()      { return src; }
	public GDNNode getDst()      { return dst; }
	public GDNLinkType getType() { return type; }
	
	public String getExplanation() {
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = explanations.iterator();
		int total = explanations.size();
		int cnt = 0;
		while (it.hasNext()) {
			sb.append(it.next());
			++cnt;
			if (cnt < total)
				sb.append(",");
		}
		
		return sb.toString();
	}
	
	public void updateExplanation(String expl) {
		explanations.add(expl);
	}
	
	public void incWeight() {
		++weight;
	}
	
	public String getDesc() {
		return GDNLinkType.desc(type) + ": (" + src.getDesc() + " --> " + dst.getDesc() + ", w = " + weight + ")";
	}	
}