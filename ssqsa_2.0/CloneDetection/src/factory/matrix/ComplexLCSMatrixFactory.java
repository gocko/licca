package factory.matrix;

import java.util.Iterator;
import java.util.List;

import datastructures.matrix.ComplexMatrixElement;
import datastructures.matrix.MatrixElement;
import ecst.ECSTNode;
import ecst.ECSTNodeFactory;

public class ComplexLCSMatrixFactory extends AbstractLCSMatrixFactory {

	//private static ComplexLCSMatrixFactory instance = new ComplexLCSMatrixFactory();
	private static ComplexLCSMatrixFactory instance = new ComplexLCSMatrixFactory2();

	protected ComplexLCSMatrixFactory() {
		super();
	}

	public static ComplexLCSMatrixFactory instance() {
		return instance;
	}

	@Override
	protected MatrixElement handleMatch(MatrixElement[][] matrix, int i, int j,
			ECSTNode row, ECSTNode column) {
		MatrixElement[][] subMatrix = LCSMatrixFactory.instance().createFrom(
				row, column);
		double value = matrix[i - 1][j - 1].getValue()
				+ LCSMatrixFactory.instance().calculateSimilarity(subMatrix);
		if (matrix[i - 1][j].getValue() > value) {
			value = matrix[i - 1][j].getValue();
		}
		if (matrix[i][j - 1].getValue() > value) {
			value = matrix[i][j - 1].getValue();
		}
		return new ComplexMatrixElement(value, row, column, subMatrix);
	}

	@Override
	protected void removeRedundantNodes(List<ECSTNode> list) {

		Iterator<ECSTNode> it = list.iterator();
		while (it.hasNext()) {
			ECSTNode current = it.next();
			if (!ECSTNodeFactory.universalNode(current.getToken())
					|| !(current.getToken().getText().indexOf("STATEMENT") != -1
					// 2.1.2017. Goca, how much is thi important? It makes us
					// some problems in matrix,
					// and we should care only if we have initialization of the
					// variable
					// || current.getToken().getText().equals("VAR_DECL")
					// 7.1.2017. Goca...let us see BRANCHES?
					// || current.getToken().getText().equals("BRANCH")
					|| current.getToken().getText().equals("FUNCTION_CALL"))) {
				it.remove();
			}
		}
	}

	@Override
	protected int backtrackMiss() {
		return 0;
	}

}
