package cloneDetection;

import java.io.File;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

import util.treeTraversal.TreeTraversal;
import util.treeTraversal.Visitor;
import datastructures.detectionUnit.DetectionUnit;
import datastructures.matrix.MatrixElement;
import datastructures.result.Result;
import datastructures.result.Results;
import ecst.ECSTNode;
import ecst.ECSTree;
import factory.matrix.ComplexLCSMatrixFactory;

public class LCSCloneDetective implements CloneDetective {

	private LinkedList<Result> results;

	public LCSCloneDetective() {
		results = new LinkedList<>();
	}
	
	@Override
	public Results detectClones(List<ECSTree> compilationUnits) {
		results.clear();
		LinkedList<DetectionUnit> detectionUnits = findDetectionUnits(compilationUnits);
		
		for (int i = 0; i < detectionUnits.size() - 1; i++) {
			for (int j = i + 1; j < detectionUnits.size(); j++) {
				DetectionUnit detectionUnit1 = detectionUnits.get(i);
				DetectionUnit detectionUnit2 = detectionUnits.get(j);
				MatrixElement[][] matrix = createMatrix(
						detectionUnit1.getRootNode(),
						detectionUnit2.getRootNode());
				 
				createResult(detectionUnit1, detectionUnit2, matrix);
			}
		}
		return new Results(results);
	}


	private MatrixElement[][] createMatrix(ECSTNode row, ECSTNode column) {
		return ComplexLCSMatrixFactory.instance().createFrom(row, column);
	}

	private void createResult(DetectionUnit detectionUnit1,
			DetectionUnit detectionUnit2, MatrixElement[][] matrix) {
		results.add(Result.createFrom(matrix, detectionUnit1, detectionUnit2));
	}

	private LinkedList<DetectionUnit> findDetectionUnits(
			List<ECSTree> compilationUnits) {
		LinkedList<DetectionUnit> block = new LinkedList<DetectionUnit>();
		for (ECSTree tree : compilationUnits) {
			block.addAll(findBlockScopes(tree));
		}
		return block;
	}

	// searches for function blocks in one compilation unit
	private List<DetectionUnit> findBlockScopes(final ECSTree tree) {
		final LinkedList<DetectionUnit> blockScopes = new LinkedList<>();
		Visitor visitor = new Visitor() {

			@Override
			public void doJob(ECSTNode node) {
				/**
				 * TODO: enable for blocks not only on the first level under the
				 * function declaration
				 */
				if (node.getToken().getText().compareTo("FUNCTION_DECL") == 0) {
					for (ECSTNode child : node.getChilds()) {
						if (child.getToken().getText().compareTo("BLOCK_SCOPE") == 0
								|| child.getToken().getText()
										.compareTo("BLOCK") == 0) {
							blockScopes.add(DetectionUnit.newInstance(
									new File(tree.toString()), child));
						}
					}
				}
			}

		};
		TreeTraversal.dfs(tree.getRoot(), visitor);
		/* out.println("Found " + blockScopes.size() + " function blocks in " +
				 tree.toString());*/
		return blockScopes;
	}
}
