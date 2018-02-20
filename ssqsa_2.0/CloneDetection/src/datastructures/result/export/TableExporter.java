package datastructures.result.export;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import datastructures.detectionUnit.DetectionUnit;
import datastructures.result.Result;
import datastructures.result.Results;

public class TableExporter {

	public void exportAsTable(Results results, PrintStream destination,
			String delimiter) {
		Map<DetectionUnit, Integer> legend = createLegend(results);
		TableExportStringBufferDecorator content = new TableExportStringBufferDecorator(
				delimiter);
		content.appendTable(legend2Table(legend));
		content.appendTable(createTable(results, legend));
		destination.print(content);
	}

	private Map<DetectionUnit, Integer> createLegend(Results results) {
		Map<DetectionUnit, Integer> legend = new HashMap<DetectionUnit, Integer>();
		int enumerator = 1;
		for (Result result : results.getResults()) {
			if (!legend.containsKey(result.getDetectionUnit1())) {
				legend.put(result.getDetectionUnit1(), enumerator++);
			}
			if (!legend.containsKey(result.getDetectionUnit2())) {
				legend.put(result.getDetectionUnit2(), enumerator++);
			}
		}
		return legend;
	}

	private Object[][] legend2Table(Map<DetectionUnit, Integer> legend) {
		Object[][] table = new Object[legend.size() + 1][3];
		table[0][0] = "Key";
		table[0][1] = "No. of statements";
		table[0][2] = "Unit";
		for (Entry<DetectionUnit, Integer> entry : legend.entrySet()) {
			table[entry.getValue()][0] = entry.getValue();
			table[entry.getValue()][1] = entry.getKey().getNumberOfStatements();
			table[entry.getValue()][2] = entry.getKey().toString();
		}
		return table;
	}

	private Object[][] createTable(Results results, Map<DetectionUnit, Integer> legend) {
		Object[][] table = new Object[legend.size() + 1][legend.size() + 1];
		for (int i = 1; i <= legend.size(); i++) {
			table[0][i] = i;
			table[i][0] = i;
		}
		for (Result result : results.getResults()) {
			int i = legend.get(result.getDetectionUnit1());
			int j = legend.get(result.getDetectionUnit2());
			table[i][j] = ((int) (result.getSimilarity() * 100)) / 100.0;
			table[j][i] = result.getNumberOfStatementsMatched();
		}
		return table;
	}

	/**
	 * Not a real decorator since StringBuffer's parent class isn't visible :)
	 * 
	 * @author Tijana Vislavski
	 * 
	 */
	private static class TableExportStringBufferDecorator {

		private static final String NEW_LINE = System
				.getProperty("line.separator");

		private StringBuffer stringBuffer;
		private String delimiter;

		TableExportStringBufferDecorator(String delimiter) {
			this.delimiter = delimiter;
			stringBuffer = new StringBuffer();
		}

		void appendTable(Object[][] elements) {
			for (int i = 0; i < elements.length; i++) {
				for (int j = 0; j < elements[i].length - 1; j++) {
					stringBuffer
							.append(elementOrEmptyStringIfItIsNull(elements[i][j])
									+ delimiter);
				}
				stringBuffer
						.append(elementOrEmptyStringIfItIsNull(elements[i][elements[i].length - 1])
								+ NEW_LINE);
			}
			stringBuffer.append(NEW_LINE);
		}

		private String elementOrEmptyStringIfItIsNull(Object element) {
			return element != null ? element.toString() : "";
		}

		@Override
		public String toString() {
			return stringBuffer.toString();
		}
	}
}
