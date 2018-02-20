package datastructures.result.export;

import java.io.PrintStream;

import datastructures.result.Result;
import datastructures.result.Results;

class ARFFExporter {

	private static final String NEW_LINE = System.getProperty("line.separator");
	private static final String RELATION_NAME = "clones";

	public void export(Results results, PrintStream destination) {
		destination.print(createContent(results));
	}

	private String createContent(Results results) {
		StringBuffer content = new StringBuffer();
		content.append(relation());
		content.append(attributes());
		content.append(data(results));
		return content.toString();
	}

	private String relation() {
		return Tags.RELATION + " " + RELATION_NAME + NEW_LINE + NEW_LINE;
	}

	private String attributes() {
		StringBuffer attributes = new StringBuffer();
		for (Attributes attribute : Attributes.values()) {
			attributes.append(attributeLine(attribute));
		}
		attributes.append(NEW_LINE);
		return attributes.toString();
	}

	private String attributeLine(Attributes attribute) {
		return Tags.ATTRIBUTE + " " + attribute + " " + NEW_LINE;
	}

	private String data(Results results) {
		StringBuffer data = new StringBuffer();
		data.append(Tags.DATA + NEW_LINE);
		for (Result result : results.getResults()) {
			data.append(dataLine(result));
		}
		return data.toString();
	}

	private String dataLine(Result result) {
		return detectionUnits(result) + result.getSimilarity() + ","
				+ result.getNumberOfStatementsMatched() + NEW_LINE;
	}
	
	private String detectionUnits(Result result) {
		return "\"" + result.getDetectionUnit1() + "\",\"" + result.getDetectionUnit2() + "\",";
	}

	private enum Tags {
		RELATION, ATTRIBUTE, DATA;

		private static final String PREFFIX = "@";

		@Override
		public String toString() {
			return PREFFIX + name();
		}
	}

	private enum Attributes {
		UNIT1("STRING"), UNIT2("STRING"), SIMILARITY("REAL"), COVERAGE("NUMERIC");

		private String type;

		private Attributes(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return name().toLowerCase() + " " + type;
		}
	}
}
