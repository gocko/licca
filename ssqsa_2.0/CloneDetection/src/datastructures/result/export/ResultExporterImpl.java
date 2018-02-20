package datastructures.result.export;

import java.io.PrintStream;

import datastructures.result.Results;

public class ResultExporterImpl implements ResultExporter {

	private static final String DEFAULT_DELIMITER = "\t";
	private static final PrintStream DEFAULT_DESTINATION = System.out;
	
	private BasicExporter basicExporter;
	private TableExporter tableExporter;
	private ARFFExporter arffExporter; 
	
	public ResultExporterImpl() {
		basicExporter = new BasicExporter();
		tableExporter = new TableExporter();
		arffExporter = new ARFFExporter();
	}
	

	@Override
	public void print(Results results) {
		print(results, DEFAULT_DESTINATION);
	}

	@Override
	public void print(Results results, PrintStream destination) {
		basicExporter.print(results, destination);
	}	

	@Override
	public void exportAsTable(Results results) {
		exportAsTable(results, DEFAULT_DESTINATION, DEFAULT_DELIMITER);
	}

	@Override
	public void exportAsTable(Results results, PrintStream destination) {
		exportAsTable(results, destination, DEFAULT_DELIMITER);
	}

	@Override
	public void exportAsTable(Results results, String delimiter) {
		exportAsTable(results, DEFAULT_DESTINATION, delimiter);
	}

	@Override
	public void exportAsTable(Results results, PrintStream destination,
			String delimiter) {
		tableExporter.exportAsTable(results, destination, delimiter);
	}


	@Override
	public void toARFF(Results results) {
		arffExporter.export(results, DEFAULT_DESTINATION);
	}


	@Override
	public void toARFF(Results results, PrintStream destination) {
		arffExporter.export(results, destination);
	}
}
