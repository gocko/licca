package treeCheckers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.tree.CommonTree;

public class TreeChecker {

	private PrintWriter pw = null;
	
	private boolean sncStatus = true;
	private int sncCounter = 0;
	
	private boolean encStatus = true;
	private int encCounter = 0;
	
	private boolean scStatus = true;
	private int scCounter = 0;
	
	private boolean hcStatus = true;
	private int hcCounter = 0;
	
	public TreeChecker(String outFile) 
		throws IOException
	{
		pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
	}
	
	public void check(CommonTree tree, String source) {
		SuspiciousNodeChecker snc = new SuspiciousNodeChecker();
		boolean ok = snc.evaluate(tree, source, pw);
		if (!ok) sncCounter++;
		sncStatus = sncStatus && ok;
		
		EmptyNodeChecker enc = new EmptyNodeChecker();
		ok = enc.evaluate(tree, source, pw);
		if (!ok) encCounter++;
		encStatus = encStatus && ok;
		
		SneiplCompatibilityChecker sc = new SneiplCompatibilityChecker();
		ok = sc.evaluate(tree, source, pw);
		if (!ok) scCounter++;
		scStatus = scStatus && ok;
		
		HalsteadCompatibilityChecker hc = new HalsteadCompatibilityChecker();
		ok = hc.evaluate(tree, source, pw);
		if (!ok) hcCounter++;
		hcStatus = hcStatus && ok;
		
	}
	
	private String status(boolean status, int counter) {
		if (status) {
			return "[OK]";
		} else {
			return "[WARNING, " + counter + "]";
		}
	}
	
	public void close() {
		System.out.println("Suspicious node checker " + status(sncStatus, sncCounter)); 
		System.out.println("Empty node checker " + status(encStatus, encCounter));
		System.out.println("Sneipl compatibility checker " + status(scStatus, scCounter));
		System.out.println("Halstead compatibility checker " + status(hcStatus, hcCounter));
		
		pw.close();
	}
	

}
