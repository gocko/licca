import javax.swing.tree.DefaultMutableTreeNode;

import ecst.ECSTNode;

@SuppressWarnings("serial")
public class ECSTTreeNode extends DefaultMutableTreeNode {

	private ECSTNode node;
	private int status;
	
	public ECSTTreeNode(ECSTNode node) {
		this.node =node;
		status = 0;
	}
	
	public ECSTNode getNode() {
		return node;
	}


	public void setNode(ECSTNode node) {
		this.node = node;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		String color = status == 0 ? "Black" : "Green";
        return "<html><span color='"+color+"'>"+
                node.getToken().getText() + "</span></html>";
	}
	
}
