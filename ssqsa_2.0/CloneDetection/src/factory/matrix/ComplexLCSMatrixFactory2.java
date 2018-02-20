package factory.matrix;

import java.util.Iterator;
import java.util.List;

import ecst.ECSTNode;
import ecst.ECSTNodeFactory;

public class ComplexLCSMatrixFactory2 extends ComplexLCSMatrixFactory {

	@Override
	protected void removeRedundantNodes(List<ECSTNode> list) {
		Iterator<ECSTNode> it = list.iterator();
		while (it.hasNext()) {
			ECSTNode current = it.next();
			if (!ECSTNodeFactory.universalNode(current.getToken())
					|| !isStatementOrFunctionCall(current)
					|| isStatementButPartOfLoopDeclaration(current)) {
				it.remove();
			}
		}
	}

	private boolean isStatementOrFunctionCall(ECSTNode node) {
		return node.getToken().getText().indexOf("STATEMENT") != -1
				|| node.getToken().getText().equals("FUNCTION_CALL");
	}

	private boolean isStatementButPartOfLoopDeclaration(ECSTNode node) {
		return node.getToken().getText().indexOf("STATEMENT") != -1
				&& isLoopOrLoopDeclarationElement(node);
	}

	private boolean isLoopOrLoopDeclarationElement(ECSTNode node) {
		ECSTNode parent = node.getParent();
		while (parent != null) {
			if (parent.getToken().getText().equals("INIT")
					|| parent.getToken().getText().equals("CONDITION")
					|| parent.getToken().getText().equals("STEP")) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
}
