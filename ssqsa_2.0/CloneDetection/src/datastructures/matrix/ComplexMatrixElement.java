package datastructures.matrix;

import ecst.ECSTNode;

public class ComplexMatrixElement extends MatrixElement {

	private MatrixElement[][] subMatrix;
	
	public ComplexMatrixElement(double value, ECSTNode row, ECSTNode column, MatrixElement[][] subMatrix) {
		super(value, row, column);
		this.subMatrix = subMatrix;
	}

	public MatrixElement[][] getSubMatrix() {
		return subMatrix;
	}
}
