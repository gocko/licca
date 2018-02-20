/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package sneipl;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.commons.io.FileUtils;

import ecst.ECSTree;
import gdn.GDN;
import gdn.GDNLink;
import gdn.GDNNode;
import sneipl.filter.Filters;
import sneipl.filter.HierarchyTreeAnalyzer;
import sneipl.filter.NetworkQDAnalyzer;
import util.DirectoryWalker;
import util.LOG;

/**
 * sneipl main class
 * 
 * @author svc@dmi.uns.ac.rs
 */
public class Sneipl {
	
	// output directory
	public static String outDir = null;
	
	// general dependency network
	private GDN gdn = new GDN();
	
	// list of compilation units
	private LinkedList<String> compilationUnits; 
	
	// true, if sneipl initialized correctly
	private boolean initOk = false;
	
	public Sneipl(String workingDir, String outDirectory) {
		initOk = false;
		
		File out = new File(outDirectory);
		if (!out.exists()) {
			out.mkdir();
		} else {
			if (!out.isDirectory()) {
				System.out.println("Sneipl error, outDir " + outDirectory + " is not directory");
			} else {
				System.out.println("Sneipl warning, outDir " + outDirectory + " already exists");
				System.out.println("Cleaning " + outDirectory);
				try {
					FileUtils.cleanDirectory(out);
				} catch (IOException e) {
					System.out.println("Sneipl error, IOException during directory cleaning");
					return;
				}
			}
		}
		
		outDir = out.getAbsolutePath() + "/";
		try {
			LOG.init(outDir);
		} catch (IOException e) {
			System.out.println("Sneipl error, unable to initialize LOG file");
			return;
		}
		
		File f = new File(workingDir);
		if (!f.exists() && !f.isDirectory()) {
			LOG.info("Sneipl error: directory " + workingDir + " does not exists");
			return;
		} 
			
		DirectoryWalker dw = new DirectoryWalker(workingDir, new String[]{"xml"});
		compilationUnits = dw.getFiles();
		
		initOk = true;
		LOG.info("Sneipl created [" + new Date().toString() + "]" + 
					       "\nworkingDir = " + f.getAbsolutePath() + 
					       "\noutDir = " + outDir);
	}
	
	private String getStatus(String phase) {
		int numErr = LOG.getNumErrors();
		int numWar = LOG.getNumWarnings();
		
		StringBuilder sb = new StringBuilder();
		sb.append(phase).append(" [");
		
		if (numErr == 0 && numWar == 0)
			sb.append("OK, ");
		else
		if (numErr == 0 && numWar > 0) 
			sb.append(numWar).append(" warnings,");
		else
		if (numErr > 0 && numWar == 0) 
			sb.append(numErr).append(" errors,");
		else
			sb.append(numErr).append(" errors, ")
			  .append(numWar).append(" warnings, ");
		
		sb.append("gdn nodes: ")
		  .append(gdn.getNumNodes()) 
		  .append(", gdn links: ")
		  .append(gdn.getNumLinks())
		  .append("]");
		
		sb.append("\nnum contains formed by name: ").append(Phase1.CONTAINS_FORMED_BY_NAME);
		sb.append("\nnum contains formed by hierarchy: ").append(Phase1.CONTAINS_FORMED_BY_HIERARCHY);
		
		return sb.toString();
	}
	
	private void phase1() 
		throws IOException
	{
		for (int i = 0; i < compilationUnits.size(); i++) {
			String compilationUnit = compilationUnits.get(i);
			ECSTree t = new ECSTree(compilationUnit);
			Phase1 p1 = new Phase1(compilationUnit, t, gdn);
			p1.analyze();
		}
		
		gdn.exportUnits(outDir);
	}
	
	private void phase2() 
		throws IOException
	{	
		for (int i = 0; i < compilationUnits.size(); i++) {
			String compilationUnit = compilationUnits.get(i);
			ECSTree t = new ECSTree(compilationUnit);
			Phase2 p2 = new Phase2(compilationUnit, t, gdn);
			p2.analyze();
		}
	}
	
	private void phase3()
		throws IOException
	{
		for (int i = 0; i < compilationUnits.size(); i++) {
			String compilationUnit = compilationUnits.get(i);
			ECSTree t = new ECSTree(compilationUnit);
			Phase3 p3 = new Phase3(compilationUnit, t, gdn);
			p3.analyze();
		}
	}
	
	private void phase3Report() {
		LOG.info("##########################################  Phase 2 report");
		LOG.info(getStatus("Phase2"));

		LOG.info("ImportList report: ");
		LOG.info("Resolved imports: " + ImportList.getImportCacheSize() + 
		           ", out-of-source imports: " + ImportList.getUnresolvedImportSize());
		
		LOG.info("TypeResolver report: ");
		LOG.info("Resolved types: " + TypeResolver.getResolvedTypeSize() + 
					", out-of-source types: " + TypeResolver.getUnresolvedTypeSize());
		
		DecimalFormat df = new DecimalFormat("#.##");
		int totalCalls = FuncCallResolver.CALLS_RESOLVED + FuncCallResolver.CALLS_UNRESOLVED;
		LOG.info("CALLS_RESOLVED = " + FuncCallResolver.CALLS_RESOLVED + ", " + 
				  df.format(100.0 * (double) FuncCallResolver.CALLS_RESOLVED / (double) totalCalls) + "[%]");
		LOG.info("CALLS_UNRESOLVED = " + FuncCallResolver.CALLS_UNRESOLVED + ", " + 
				  df.format(100.0 * (double) FuncCallResolver.CALLS_UNRESOLVED / (double) totalCalls) + "[%]");
		LOG.info("Total FUNCTION_CALL nodes: " + FuncCallResolver.TOTAL_FUNCTION_CALLS);
		
		LOG.info("CALLS_HARD_TO_MATCH_RESOLVED = " + FuncCallResolver.CALLS_HARD_TO_MATCH_RESOLVED);
		LOG.info("CALLS_HARD_TO_MATCH_UNRESOLVED = " + FuncCallResolver.CALLS_HARD_TO_MATCH_UNRESOLVED);
			
		LOG.info("##########################################  End of phase 2 report");
	}
	
	public void doJob() 
		throws IOException
	{
		if (!initOk)
			return;
		
		LOG.info("Entering phase1");
		phase1();
		
		HardToMatchFunction htmf = new HardToMatchFunction(gdn);
		htmf.analyze();
		LOG.info(htmf.report());
		
		LOG.info("Entering phase2");
		phase2();
		gdn.collectInstantiates();
		
		// phase 2 for second time
		LOG.info("Entering phase3");
		phase3();
		phase3Report();
		
		ImportList.dumpImportCache(outDir + "importCache.txt");
		ImportList.dumpUnresolvedImports(outDir + "unresolvedImports.txt");
		TypeResolver.dumpResolvedTypes(outDir + "resolvedTypes.txt");
		TypeResolver.dumpUnresolvedTypes(outDir + "unresolvedTypes.txt");
		TypeResolver.checkUnresolvedTypes(gdn);
		
		LOG.info(gdn.gdnStatus());
		if (gdn.UNCONSISTENT_LINKS == 0)
			LOG.info("All GDN links _CONSISTENT_");
		else {
			LOG.info("GDN links _NOT CONSISTENT_, num inconsistent links: " + gdn.UNCONSISTENT_LINKS);
		}
		
		gdn.dump(outDir + "GDN.txt");
		gdn.exportToPajek(outDir + "GDN.net");
		gdn.exportToGraphML(outDir + "GDN.xml");
		
		//GDN gdn2 = new GDN();
		//gdn2.importFromGraphML(outDir + "GDN.xml");
		//System.out.println(gdn2.gdnStatus());
		//gdn2.dump(outDir + "GDN2.txt");
		//gdn2.exportToPajek(outDir + "GDN2.net");
		//gdn2.exportToGraphML(outDir + "GDN2.xml");
		
		
		
		
		Filters f = new Filters(gdn);
		f.filter();
		f.export(outDir);
		
		quickAnalyzer(f);
	
		LOG.info("Sneipl finished [" + new Date().toString() + "]");
		LOG.closeLog();
	}
	
	private void quickAnalyzer(Filters f) {
		int[] netIndexes = {
			Filters.CONT,
			Filters.PCN,
			Filters.CCN,
			Filters.CCN_EXT,
			Filters.SCG,
			Filters.ACC
		};
		
		System.out.println("\n\nMacroscopic properties... ");
		for (int i = 0; i < netIndexes.length; i++) {
			NetworkQDAnalyzer na = null;
			if (i == 0)
				na = new HierarchyTreeAnalyzer(gdn, f.getNet(netIndexes[i]));
			else
				na = new NetworkQDAnalyzer(f.getNet(netIndexes[i]));
			
			System.out.println(na.getReport());
		}
	}
	
	public void explorer() {
		java.util.Scanner scan= new java.util.Scanner(System.in);
	
		System.out.println("Starting explorer... ");
		
		while (true) {
			System.out.print("Node name (<exit> to end): ");
			String nname = scan.nextLine();
			if (nname.compareTo("exit") == 0) {
				break;
			}
			
			GDNNode gdnNode = gdn.findNodeByName(nname);
			if (gdnNode == null) {
				System.out.println("Not found");
				continue;
			}
			
			System.out.println(gdnNode.getDesc());
			
			System.out.println("Incoming links");
			Iterator<GDNLink> inLinks = gdn.getNet().getInEdges(gdnNode).iterator();
			while (inLinks.hasNext()) {
				GDNLink l = inLinks.next();
				System.out.println(l.getType() + ": " + l.getSrc().getName());
			}
			
			System.out.println("Outgoind links");
			Iterator<GDNLink> outLinks = gdn.getNet().getOutEdges(gdnNode).iterator();
			while (outLinks.hasNext()) {
				GDNLink l = outLinks.next();
				System.out.println(l.getType() + ": " + l.getDst().getName());
			}
		}
		
		scan.close();
	}
	
	public static void main(String[] args) 
		throws IOException
	{
		if (args.length != 2) {
			System.out.println("Sneipl <ecst-dir> <gen-net-dir>");
			return;
		}
		
		Sneipl s = new Sneipl(args[0], args[1]);
		s.doJob();
	}
	
}
