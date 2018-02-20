package datastructures.result.export;

import java.io.PrintStream;

import datastructures.result.Result;
import datastructures.result.Results;

class BasicExporter {

	public void print(Results results, PrintStream destination) {
		for (Result result : results.getResults()) {
			printResult(result, destination);
		}
	}
	
	private void printResult(Result result, PrintStream destination) {
		destination.println("Source files:");
		destination.println(result.getDetectionUnit1().getSourceFile());
		destination.println(result.getDetectionUnit2().getSourceFile() + "\n");
		destination.println("Blocks compared: " + result.getTitle());
		destination.println("Calculated similarity: " + result.getSimilarity());
		destination.println("Number of statements matched: "
				+ result.getNumberOfStatementsMatched());
	}
}
