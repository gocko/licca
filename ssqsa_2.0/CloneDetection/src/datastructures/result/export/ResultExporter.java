package datastructures.result.export;

import java.io.PrintStream;

import datastructures.result.Results;


/**
 * Interface that contains methods for exporting results of clone detection to
 * various destinations and in different formats.
 * 
 * @author Tijana Vislavski
 * 
 */
public interface ResultExporter {

	/**
	 * Prints results of clone detection to standard out.
	 * 
	 * @param results
	 *            of clone detection
	 */
	void print(Results results);

	/**
	 * Prints results of clone detection to given stream
	 * 
	 * @param results
	 *            of clone detection
	 * @param destination
	 *            stream to print results to
	 */
	void print(Results results, PrintStream destination);

	/**
	 * Prints results of clone detection to standard out. Results are in tabular
	 * format with \t used as a delimiter between columns.
	 * 
	 * @param results
	 *            of clone detection
	 */
	void exportAsTable(Results results);

	/**
	 * Prints results of clone detection to given stream. Results are in tabular
	 * format with \t used as a delimiter between columns.
	 * 
	 * @param results
	 *            of clone detection
	 * @param destination
	 *            stream to print results to
	 */
	void exportAsTable(Results results, PrintStream destination);

	/**
	 * Prints results of clone detection to standard out. Results are in tabular
	 * format with a given String as a delimiter between columns.
	 * 
	 * @param results
	 *            of clone detection
	 * @param delimiter
	 *            used as a delimiter
	 */
	void exportAsTable(Results results, String delimiter);

	/**
	 * Prints results of clone detection to given stream. Results are in
	 * tabular format with a given String as a delimiter between columns.
	 * 
	 * @param results
	 *            of clone detection
	 * @param destination
	 *            stream to print results to
	 * @param delimiter
	 *            used as a delimiter
	 */
	void exportAsTable(Results results, PrintStream destination,
			String delimiter);
	
	/**
	 * Prints results of clone detection to standard out. Results are in ARFF
	 * format ({@link https://weka.wikispaces.com/ARFF}).
	 * 
	 * @param results
	 *            of clone detection
	 */
	void toARFF(Results results);
	
	/**
	 * Prints results of clone detection to given stream. Results are in ARFF
	 * format ({@link https://weka.wikispaces.com/ARFF}).
	 * 
	 * @param results
	 *            of clone detection
	 */
	void toARFF(Results results, PrintStream destination);
}
