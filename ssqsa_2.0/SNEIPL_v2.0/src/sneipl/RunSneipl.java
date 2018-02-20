/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package sneipl;

import java.io.File;
import eCSTGenerator.eCSTGenerator;


import org.apache.commons.io.FileUtils;



/**
 * Generate eCST representation from source code and then
 * run SNEIPL
 * 
 * @author svc
 */
public class RunSneipl {

	// "hard coded repository"
	private static String[][] repos = {
		
		// java
		{"IstokData/java/commons_io_2_4_src/", "IstokData/java/commons_io_2_4_ecst/", "IstokData/java/commons_io_2_4_nets/", "commons-io"},           // project 0
		{"IstokData/java/forrest_0_9_src/", "IstokData/java/forrest_0_9_ecst/", "IstokData/java/forrest_0_9_nets/", "forrest"},                       // project 1
		{"IstokData/java/pbeans_2_0_2_src/", "IstokData/java/pbeans_2_0_2_ecst/", "IstokData/java/pbeans_2_0_2_nets/", "pbeans"},                     // project 2
		{"IstokData/java/colt_1_2_0_src/", "IstokData/java/colt_1_2_0_ecst/", "IstokData/java/colt_1_2_0_nets/", "colt"},                             // project 3
		{"IstokData/java/lucene_3_6_0_src/", "IstokData/java/lucene_3.6.0_ecst/", "IstokData/java/lucene_3_6_0_nets/", "lucene"},                     // project 4                                        
		{"IstokData/java/log4j_1_2_17_src/", "IstokData/java/log4j_1_2_17_ecst/", "IstokData/java/log4j_1_2_17_nets/", "log4j"},                      // project 5
		{"IstokData/java/tomcat_7_0_29_src/", "IstokData/java/tomcat-7_0_29_ecst/", "IstokData/java/tomcat_7_0_29_nets/", "tomcat"},                  // project 6                                         
		{"IstokData/java/xerces_2_11_0_src/", "IstokData/java/xerces_2_11_0_ecst/", "IstokData/java/xerces_2_11_0_nets/", "xerces"},                  // project 7
		{"IstokData/java/ant_1_9_2_src/", "IstokData/java/ant_1_9_2_ecst/", "IstokData/java/ant_1_9_2_nets/", "ant"},                                 // project 8
		{"IstokData/java/jfreechart_1_0_17_src/", "IstokData/java/jfreechart_1_0_17_ecst/", "IstokData/java/jfreechart_1_0_17_nets/", "jfreechart"},   // project 9	
		// modula-2
		{"IstokData/m2/mas_1_0_1_src", "IstokData/m2/mas_1_0_1_ecst", "IstokData/m2/mas_1_0_1_nets", null},  // project 10
		{"IstokData/m2/lumos_src/", "IstokData/m2/lumos_ecst/", "IstokData/m2/lumos_nets", null},            // project 11
		
		// delphi
		{"IstokData/delphi/zjb_src", "IstokData/delphi/zjb_ecst/", "IstokData/delphi/zjb_nets/", null},       // project 12
		{"IstokData/delphi/mse_src", "IstokData/delphi/mse_ecst/", "IstokData/delphi/mse_nets/", null}     // project 13
	
		};
	
	private static void extract(boolean debug, int projectIndex) 
		throws Exception
	{
		int runIndex = projectIndex;
		
		if (!debug) {
			System.out.println("##### [eCSTGenerator] ##### Transforming source code to eCST representation... ");
			eCSTGenerator eCSTGen = new eCSTGenerator(repos[runIndex][0], repos[runIndex][1]);
			eCSTGen.doJob();
		}
		
		System.out.println("eCSTGenerator finished...\n");
		
		System.out.println("##### [SNEIPL] ##### Extracting software networks... ");
		Sneipl s = new Sneipl(repos[runIndex][1], repos[runIndex][2]);
		s.doJob();
		
		// move class collaboration network to repository for comparative analysis
		if (repos[runIndex][3] != null) {
			File src = new File(repos[runIndex][2] + "SNEIPL_CCN.net");
			File dst = new File("..\\repository\\" + repos[runIndex][3] + "\\SSQSA_SNEIPL_2_" + repos[runIndex][3] + ".net");
			FileUtils.copyFile(src, dst);
		}
		
		//s.explorer();
	}
	
	public static void main(String[] args) 
		throws Exception
	{
		for(int i=8; i<10; i++){
		extract(false, i);
		}
	}
}
