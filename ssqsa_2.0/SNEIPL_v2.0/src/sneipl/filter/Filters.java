/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package sneipl.filter;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import gdn.GDN;
import gdn.GDNLink;
import gdn.GDNLinkType;
import gdn.GDNNode;
import gdn.GDNNodeType;
import util.LOG;

public class Filters {

	public static int PCN = 0;
	public static int CCN = 1;
	public static int SCG = 2;
	public static int CCN_IMP = 3;
	public static int CCN_EXT = 4;
	public static int CCN_GV = 5;
	public static int CCN_LV = 6;
	public static int CCN_FP = 7;
	public static int CCN_FR = 8;
	public static int CCN_INS = 9;
	public static int CONT = 10;
	public static int ACC = 11;
	
	private String[] netName = {
		"PCN", "CCN", "SCG", "IMP", "EXT", "GV", "LV", "FP", "FR", "INS", "CONT", "ACC"	
	};
	
	private GDN gdn;
	
	private SoftNet[] net;
		
	public Filters(GDN gdn) {
		this.gdn = gdn;
		
		net = new SoftNet[netName.length];
		for (int i = 0; i < net.length; i++)
			net[i] = new SoftNet(netName[i]);
	}
	
	public void filter() {
		Collection<GDNLink> ilc = gdn.getNet().getEdges();
		Iterator<GDNLink> li = ilc.iterator();
		
		while (li.hasNext()) {
			GDNLink l = li.next();
			
			if (l.getType() == GDNLinkType.REFERENCES) {
				if (l.getSrc().getType() == GDNNodeType.PACKAGE && 
					l.getDst().getType() == GDNNodeType.PACKAGE) 
				{
					net[PCN].updateWithLink(l.getSrc().getName(), l.getDst().getName(), "REFERENCES");
				}
				else
				if (unitOrInterface(l.getSrc()) && unitOrInterface(l.getDst())) {
					net[CCN].updateWithLink(l.getSrc().getName(), l.getDst().getName(), l.getExplanation());
				}
				else {
					LOG.error("Filters, REFERENCES link " + 
							l.getName() + ", connecting: " + 
							GDNNodeType.desc(l.getSrc().getType()) + ", " + GDNNodeType.desc(l.getDst().getType()));
				}
			}
			else {
				int index = getIndex(l);
				if (index != -1)
					net[index].updateWithLink(l.getSrc().getName(), l.getDst().getName(), l.getType().name());
			}
		}
		
		
		Collection<GDNNode> nc = gdn.getNet().getVertices();
		Iterator<GDNNode> ni = nc.iterator();
		while (ni.hasNext()) {
			GDNNode n = ni.next();
			
			net[CONT].updateWithNode(n.getName());
			
			if (n.getType() == GDNNodeType.PACKAGE)
				net[PCN].updateWithNode(n.getName());
			else
			if (n.getType() == GDNNodeType.GLOBAL_VAR)
				net[ACC].updateWithNode(n.getName());
			else
			if (n.getType() == GDNNodeType.FUNCTION) {
				net[ACC].updateWithNode(n.getName());
				net[SCG].updateWithNode(n.getName());
			}
			else
			if (n.getType() == GDNNodeType.UNIT || n.getType() == GDNNodeType.INTERFACE) {
				net[CCN].updateWithNode(n.getName());
				net[CCN_IMP].updateWithNode(n.getName());
				net[CCN_EXT].updateWithNode(n.getName());
				net[CCN_GV].updateWithNode(n.getName());
				net[CCN_LV].updateWithNode(n.getName());
				net[CCN_FP].updateWithNode(n.getName());
				net[CCN_FR].updateWithNode(n.getName());
				net[CCN_INS].updateWithNode(n.getName());
			}
		}
	}
	
	private boolean unitOrInterface(GDNNode n) {
		return n.getType() == GDNNodeType.UNIT || n.getType() == GDNNodeType.INTERFACE;
	}
	
	private int getIndex(GDNLink l) {
		if (l.getType() == GDNLinkType.CALLS) {
			return SCG;
		}
		else if (l.getType() == GDNLinkType.EXTENDS) {
			return CCN_EXT;
		}
		else if (l.getType() == GDNLinkType.IMPLEMENTS) {
			return CCN_IMP;
		}
		else if (l.getType() == GDNLinkType.GLOBAL_VAR) {
			return CCN_GV;
		}
		else if (l.getType() == GDNLinkType.LOCAL_VAR) {
			return CCN_LV;
		}
		else if (l.getType() == GDNLinkType.FUNC_PARAM) {
			return CCN_FP;
		}
		else if (l.getType() == GDNLinkType.FUNC_RET) {
			return CCN_FR;
		}
		else if (l.getType() == GDNLinkType.INSTANTIATES) {
			return CCN_INS;
		}
		else if (l.getType() == GDNLinkType.CONTAINS) {
			return CONT;
		}
		else if (l.getType() == GDNLinkType.ACCESS) {
			return ACC;
		}
		else 
			return -1;
	}
	
	public SoftNet getNet(int index) {
		return net[index];
	}
	
	public void export(String outDir) 
		throws IOException
	{
		for (int i = 0; i < net.length; i++) {
			net[i].exportToPajek(outDir + netName[i] + ".net");
			net[i].exportNative(outDir + "SNEIPL_" + netName[i] + ".net");
		}
	}
}
