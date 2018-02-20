package ecstVisualizer;
import java.util.HashSet;
import java.util.Set;

import ecst.ECSTNode;
import ecst.ECSTree;


class ECSTTreeModelFactory {

	public static ECSTTreeNode createModel(ECSTree ecstTree) {
		return createModel(ecstTree, new HashSet<Integer>());
	}
	
	public static ECSTTreeNode createModel(ECSTree ecstTree, Set<Integer> matchedNodesIds) {
		ECSTTreeNode top = new ECSTTreeNode(ecstTree.getRoot(), matchedNodesIds.contains(ecstTree.getRoot().getId()) ? 1 : 0);
		addChildren(top, matchedNodesIds);
		return top;
	}
	
	private static void addChildren(ECSTTreeNode node, Set<Integer> matchedNodesIds) {
		for (ECSTNode child : node.getNode().getChilds()) {
			ECSTTreeNode childTreeNode = new ECSTTreeNode(child, matchedNodesIds.contains(child.getId()) ? 1 : 0);
			node.add(childTreeNode);
			addChildren(childTreeNode, matchedNodesIds);
		}
	}
}
