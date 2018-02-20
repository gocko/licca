package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LOG {

	private static int numErrors = 0;
	private static int numWarnings = 0;
	
	private static PrintWriter logFile = null; 
	
	public static void init(String outDirName, String logFileName) 
		throws IOException
	{
		logFile = new PrintWriter(new BufferedWriter(new FileWriter(outDirName + logFileName + "LOG.txt")));	
	}
	
	public static void error(String msg) {
		++numErrors;
		if (logFile != null) {
			logFile.println("ERR|" + msg);
		}
	}
	
	public static void warning(String msg) {
		++numWarnings;
		if (logFile != null) {
			logFile.println("WAR|" + msg);
		}
	}
	
	public static void notification(String msg) {
		if (logFile != null) {
			logFile.println("NTF|" + msg);
		}
	}
	
	public static void info(String msg) {
		if (logFile != null) {
			logFile.println(msg);
		}
		
		System.out.println(msg);
	}
	
	public static void closeLog() {
		info("Closing sneipl log file");
		info("recorded errors  :   " + numErrors);
		info("recorded warnings:   " + numWarnings);
	
		if (logFile != null)
			logFile.close();
	}
	
	public static int getNumErrors() {
		return numErrors;
	}
	
	public static int getNumWarnings() {
		return numWarnings;
	}
}
