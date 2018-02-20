package datastructures.result;

import java.util.HashSet;
import java.util.Set;

import datastructures.detectionUnit.DetectionUnit;
import datastructures.matrix.ComplexMatrixElement;
import datastructures.matrix.MatrixElement;
import ecst.ECSTNode;
import ecst.ECSTNodeFactory;
import factory.matrix.ComplexLCSMatrixFactory;

public class Result {

	public static Result createFrom(MatrixElement[][] matrix,
			DetectionUnit detectionUnit1, DetectionUnit detectionUnit2) {
		return new Result(matrix, detectionUnit1, detectionUnit2);
	}

	private String title;
	private DetectionUnit detectionUnit1, detectionUnit2;
	private double similarity;
	private int numberOfStatementsMatched;
	Set<Integer> matchedNodesIds;
	ResultMatrix resultMatrix;

	public String getTitle() {
		return title;
	}

	public double getSimilarity() {
		return ((int)(similarity * 100)) / 100.0;
	}

	public DetectionUnit getDetectionUnit1() {
		return detectionUnit1;
	}

	public DetectionUnit getDetectionUnit2() {
		return detectionUnit2;
	}

	public int getNumberOfStatementsMatched() {
		return numberOfStatementsMatched;
	}

	public Set<Integer> getMatchedNodesIds() {
		return matchedNodesIds;
	}

	public ResultMatrix getResultMatrix() {
		return resultMatrix;
	}

	private Result(MatrixElement[][] matrix, DetectionUnit detectionUnit1,
			DetectionUnit detectionUnit2) {
		similarity = calculateSimilarity(matrix);
		numberOfStatementsMatched = getNumberOfMatchedStatements(matrix);
		this.detectionUnit1 = getCopyOfDetectionUnit(detectionUnit1,
				matrix.length - 1);
		this.detectionUnit2 = getCopyOfDetectionUnit(detectionUnit2,
				matrix[0].length - 1);
		title = generateTitle();
		matchedNodesIds = extractConcreteNodes(matrix);
		resultMatrix = createResultMatrix(matrix);
	}

	private DetectionUnit getCopyOfDetectionUnit(DetectionUnit detectionUnit,
			int numberOfStatements) {
		return DetectionUnit.newInstance(detectionUnit.getSourceFile(),
				detectionUnit.getRootNode(), numberOfStatements);
	}

	private int getNumberOfMatchedStatements(MatrixElement[][] matrix) {
		return ComplexLCSMatrixFactory.instance().numberOfMatchedNodes(matrix);
	}

	private double calculateSimilarity(MatrixElement[][] matrix) {
		return ComplexLCSMatrixFactory.instance().calculateSimilarity(matrix);
	}

	private String generateTitle() {
		if (detectionUnit1 == null || detectionUnit2 == null
				|| detectionUnit1.getRootNode() == null
				|| detectionUnit2.getRootNode() == null) {
			return "ERROR";
		} else {
			return detectionUnit1.getName() + " vs. "
					+ detectionUnit2.getName();
		}
	}

	private Set<Integer> extractConcreteNodes(MatrixElement[][] matrix) {
		Set<Integer> concreteNodes = new HashSet<>();
		int i = matrix.length - 1;
		int j = matrix[0].length - 1;
		while (i != 0 && j != 0) {
			if (matrix[i][j].isMarkedAsClone()) {
				concreteNodes.addAll(extractConcreteNodes(matrix[i][j]));
				if (matrix[i][j] instanceof ComplexMatrixElement) {
					concreteNodes
							.addAll(extractConcreteNodes(((ComplexMatrixElement) matrix[i][j])
									.getSubMatrix()));
				}
				i--;
				j--;
			} else if (matrix[i - 1][j].compareTo(matrix[i][j - 1]) > 0) {
				i--;
			} else {
				j--;
			}
		}
		return concreteNodes;
	}

	private Set<Integer> extractConcreteNodes(MatrixElement matrixElement) {
		Set<Integer> concreteNodes = new HashSet<>();
		concreteNodes.addAll(extractConcreteNodes(matrixElement.getRow()));
		concreteNodes.addAll(extractConcreteNodes(matrixElement.getColumn()));
		return concreteNodes;
	}

	private Set<Integer> extractConcreteNodes(ECSTNode node) {
		Set<Integer> ids = new HashSet<>();
		for (ECSTNode child : node.getChilds()) {
			if (!ECSTNodeFactory.universalNode(child.getToken())) {
				ids.add(child.getId());
			}
			if (child.getToken().getText().equals("KEYWORD")) {
				ids.addAll(extractConcreteNodes(child));
			}
		}
		return ids;
	}

	private ResultMatrix createResultMatrix(MatrixElement[][] matrix) {
		return ResultMatrix.createFrom(matrix);
	}
}