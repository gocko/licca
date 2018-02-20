import ecst.ECSTNode;
import ecst.ECSTree;


public class ECSTTreeModelFactory {

	public static ECSTTreeNode createModel(ECSTree ecstTree) {
		ECSTTreeNode top = new ECSTTreeNode(ecstTree.getRoot());
		addChildren(top);
		return top;
	}

	
	private static void addChildren(ECSTTreeNode node) {
		for (ECSTNode child : node.getNode().getChilds()) {
			ECSTTreeNode childTreeNode = new ECSTTreeNode(child);
			node.add(childTreeNode);
			addChildren(childTreeNode);
		}
	}
}
