package factory.matrix;

import java.util.LinkedList;
import java.util.List;

import util.treeTraversal.TreeTraversal;
import datastructures.matrix.MatrixElement;
import ecst.ECSTNode;

abstract class AbstractLCSMatrixFactory {

	public final MatrixElement[][] createFrom(ECSTNode node1, ECSTNode node2) {
		ECSTNode[] rows = treeToArray(node1);
		ECSTNode[] columns = treeToArray(node2);
		MatrixElement[][] matrix = arraysToMatrix(rows, columns);
		return matrix;
	}

	private MatrixElement[][] arraysToMatrix(ECSTNode[] rows, ECSTNode[] columns) {
		MatrixElement[][] matrix = new MatrixElement[rows.length + 1][columns.length + 1];
		for (int i = 0; i <= rows.length; i++) {
			for (int j = 0; j <= columns.length; j++) {
				if (oneOfIndexesIsZero(i, j)) {
					matrix[i][j] = new MatrixElement(0);
				} else if (tokensMatch(rows[i - 1], columns[j - 1])) {
					matrix[i][j] = handleMatch(matrix, i, j, rows[i - 1],
							columns[j - 1]);
				} else {
					matrix[i][j] = new MatrixElement(max(matrix[i - 1][j],
							matrix[i][j - 1]).getValue(), rows[i - 1],
							columns[j - 1]);
				}
			}

		}
		return matrix;
	}

	private boolean oneOfIndexesIsZero(int i, int j) {
		return i == 0 || j == 0;
	}

	private boolean tokensMatch(ECSTNode node1, ECSTNode node2) {
		return node1.getToken().getText().equals(node2.getToken().getText());
	}

	public double calculateSimilarity(MatrixElement[][] matrix) {
		int numOfNodes = nodesOnPath(matrix);
		return matrix[matrix.length - 1][matrix[0].length - 1].getValue()
				/ numOfNodes;
	}

	private int nodesOnPath(MatrixElement[][] matrix) {
		return backtrack(matrix, matrix.length - 1, matrix[0].length - 1);
	}

	private int backtrack(MatrixElement[][] matrix, int i, int j) {
		if (oneOfIndexesIsZero(i, j)) {
			return 0;
		}
		if (tokensMatch(matrix[i][j].getRow(),matrix[i][j].getColumn())) {
			if (Double.compare(matrix[i][j].getValue(),
					matrix[i - 1][j].getValue()) == 0) {
				return backtrackMiss() + backtrack(matrix, i - 1, j);
			}
			if (Double.compare(matrix[i][j].getValue(),
					matrix[i][j - 1].getValue()) == 0) {
				return backtrackMiss() + backtrack(matrix, i, j - 1);
			}
			matrix[i][j].markAsClone();
			return 1 + backtrack(matrix, i - 1, j - 1);
		} else {
			return backtrackMiss()
					+ ((matrix[i - 1][j].compareTo(matrix[i][j - 1]) > 0) ? backtrack(
							matrix, i - 1, j) : backtrack(matrix, i, j - 1));
		}
	}

	protected abstract int backtrackMiss();

	public int numberOfMatchedNodes(MatrixElement[][] matrix) {
		int counter = 0;
		int i = matrix.length - 1;
		int j = matrix[0].length - 1;
		while (i != 0 && j != 0) {
			if (matrix[i][j].isMarkedAsClone()) {
				counter++;
				i--;
				j--;
			} else if (matrix[i - 1][j].compareTo(matrix[i][j - 1]) > 0) {
				i--;
			} else {
				j--;
			}
		}
		return counter;
	}

	protected abstract MatrixElement handleMatch(MatrixElement[][] matrix,
			int i, int j, ECSTNode row, ECSTNode column);

	protected abstract void removeRedundantNodes(List<ECSTNode> list);

	private MatrixElement max(MatrixElement elem1, MatrixElement elem2) {
		return elem1.compareTo(elem2) > 0 ? elem1 : elem2;
	}

	protected ECSTNode[] treeToArray(ECSTNode node) {
		LinkedList<ECSTNode> dfsList = TreeTraversal.dfs(node);
		removeRedundantNodes(dfsList);
		return dfsList.toArray(new ECSTNode[dfsList.size()]);
	}
}
