package factory.matrix;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import datastructures.matrix.MatrixElement;
import ecst.ECSTNode;
import ecst.ECSTNodeFactory;

public class LCSMatrixFactory extends AbstractLCSMatrixFactory {
	
	private static LCSMatrixFactory instance = new LCSMatrixFactory();
	
	private LCSMatrixFactory() {
		super();
	}
	
	public static LCSMatrixFactory instance() {
		return instance;
	}

	@Override
	protected MatrixElement handleMatch(MatrixElement[][] matrix, int i, int j, ECSTNode row, ECSTNode column) {
		double value = matrix[i-1][j-1].getValue() + 1;
		if (value < matrix[i-1][j].getValue()) {
			value = matrix[i-1][j].getValue();
		}
		if (value < matrix[i][j-1].getValue()) {
			value = matrix[i][j-1].getValue();
		}
		return new MatrixElement(value, row, column);
	}

	
	@Override
	protected ECSTNode[] treeToArray(ECSTNode node) {
		LinkedList<ECSTNode> dfsList = new LinkedList<>();
		for (ECSTNode child : node.getChilds()) {
			dfs(child, dfsList);
		}
		removeRedundantNodes(dfsList);
		return dfsList.toArray(new ECSTNode[dfsList.size()]);
	}
	
	private void dfs(ECSTNode node, LinkedList<ECSTNode> list) {
		if (node.getToken().getText().indexOf("BLOCK") == -1) {
			list.add(node);
			for (ECSTNode child : node.getChilds()) {
				dfs(child, list);
			}
		}
	}
	
	
/*	protected void removeRedundantNodes(List<ECSTNode> list) {
		Iterator<ECSTNode> it = list.iterator();
		while (it.hasNext()) {
			if (!ECSTNodeFactory.universalNode(it.next().getToken())) {
				it.remove();
			}
		}
	}
*/
	@Override
	protected void removeRedundantNodes(List<ECSTNode> list) {
		
		Iterator<ECSTNode> it = list.iterator();
		while (it.hasNext()) {
			ECSTNode current = it.next();
			if (!ECSTNodeFactory.universalNode(current.getToken()) || 
				current.getToken().getText().equals("SEPARATOR") || 
				current.getToken().getText().equals("KEYWORD")  || 
				current.getToken().getText().equals("TYPE") || 
				current.getToken().getText().equals("MODIFIER_LIST") || 
			 	current.getToken().getText().equals("VAR_DECL"))  {
					it.remove();
			}
		}
	}

	@Override
	protected int backtrackMiss() {
		return 1;
	}
	

}
