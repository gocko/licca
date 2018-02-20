package datastructures.result;

public class ResultMatrixElement {

	private double value;
	private ResultMatrix subMatrix;
	private boolean markedAsClone;
	
	public ResultMatrixElement(double value, ResultMatrix subMatrix, boolean markedAsClone) {
		super();
		this.value = value;
		this.subMatrix = subMatrix;
		this.markedAsClone = markedAsClone;
	}

	public ResultMatrixElement(double value, boolean markedAsClone) {
		this(value, null, markedAsClone);
	}
	
	public boolean hasSubMatrix() {
		return subMatrix != null;
	}
	
	public double getValue() {
		return value;
	}
	
	public ResultMatrix getSubMatrix() throws NoSuchFieldException {
		if (!hasSubMatrix()) {
			throw new NoSuchFieldException();
		}
		return subMatrix;
	}
	
	public boolean isMarkedAsClone() {
		return markedAsClone;
	}
}
