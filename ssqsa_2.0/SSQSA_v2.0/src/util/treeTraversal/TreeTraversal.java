package util.treeTraversal;

import java.util.LinkedList;

import ecst.ECSTNode;

public class TreeTraversal {

	public static LinkedList<ECSTNode> bfs(ECSTNode root, Visitor visitor) {
		LinkedList<ECSTNode> queue = new LinkedList<>();
		queue.add(root);
		int k = 0;
		while (k < queue.size()) {
			ECSTNode current = queue.get(k);
			visitor.doJob(current);
			queue.addAll(current.getChilds());
			k++;
		}
		return queue;
	}
	
	public static LinkedList<ECSTNode> bfs(ECSTNode root) {
		return bfs(root, new Visitor() {
			@Override
			public void doJob(ECSTNode node) {}
		});
	}
	
	public static LinkedList<ECSTNode> dfs(ECSTNode root) {
		return dfs(root, new Visitor() {
			@Override
			public void doJob(ECSTNode node) {}
		});
	}
	
	public static LinkedList<ECSTNode> dfs(ECSTNode node, Visitor visitor) {
		LinkedList<ECSTNode> dfsList = new LinkedList<>();
		dfs(node, visitor, dfsList);
		return dfsList;
	}
	
	private static void dfs(ECSTNode node, Visitor visitor, LinkedList<ECSTNode> dfsList) {
		dfsList.addLast(node);
		visitor.doJob(node);
		for (ECSTNode child : node.getChilds()) {
			dfs(child, visitor, dfsList);
		}
	}
}
