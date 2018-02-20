package datastructures.matrix;

import ecst.ECSTNode;

public class MatrixElement implements  Comparable<MatrixElement> {
	
	protected double value;
	protected ECSTNode row;
	protected ECSTNode column;
	private boolean isMarkedAsClone;
	
	public MatrixElement(double value) {
		this.value = value;
		isMarkedAsClone = false;
	}
	
	public MatrixElement(double value, ECSTNode row, ECSTNode column) {
		this(value);
		this.row = row;
		this.column = column;
	}
	
	public double getValue() {
		return value;
	}

	public ECSTNode getRow() {
		return row;
	}

	public ECSTNode getColumn() {
		return column;
	}

	public boolean isMarkedAsClone() {
		return isMarkedAsClone;
	}
	
	public void markAsClone() {
		isMarkedAsClone = true;
	}
	
	@Override
	public int compareTo(MatrixElement o) {
		return Double.compare(value, o.value);
	}
}
