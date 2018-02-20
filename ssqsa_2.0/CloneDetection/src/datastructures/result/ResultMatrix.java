package datastructures.result;

import datastructures.matrix.ComplexMatrixElement;
import datastructures.matrix.MatrixElement;

public class ResultMatrix {

	static ResultMatrix createFrom(MatrixElement[][] matrix) {
		return new ResultMatrix(matrix);
	}

	private String[] rowHeaders, columnHeaders;
	private ResultMatrixElement[][] values;

	private ResultMatrix(MatrixElement[][] matrix) {
		super();
		values = new ResultMatrixElement[matrix.length - 1][matrix[0].length - 1];
		rowHeaders = new String[matrix.length - 1];
		columnHeaders = new String[matrix[0].length - 1];
		for (int i = 1; i < matrix.length; i++) {
			rowHeaders[i - 1] = matrix[i][1].getRow().getToken().getText();
		}
		for (int j = 1; j < matrix[0].length; j++) {
			columnHeaders[j - 1] = matrix[1][j].getColumn().getToken()
					.getText();
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] instanceof ComplexMatrixElement
						&& matrix[i][j].isMarkedAsClone()) {
					values[i - 1][j - 1] = new ResultMatrixElement(
							matrix[i][j].getValue(), new ResultMatrix(
									((ComplexMatrixElement) matrix[i][j])
											.getSubMatrix()),
							matrix[i][j].isMarkedAsClone());
				} else {
					values[i - 1][j - 1] = new ResultMatrixElement(
							matrix[i][j].getValue(),
							matrix[i][j].isMarkedAsClone());
				}
			}
		}
	}

	public ResultMatrixElement itemAt(int row, int col) {
		return values[row][col];
	}

	public String rowHeader(int index) {
		return rowHeaders[index];
	}

	public String columnHeader(int index) {
		return columnHeaders[index];
	}

	public int rowCount() {
		return rowHeaders.length;
	}

	public int columnCount() {
		return columnHeaders.length;
	}
}
