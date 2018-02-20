package treeCheckers; 

import java.io.PrintWriter;
import java.util.LinkedList;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public abstract class CompatibilityChecker {

	public boolean evaluate(CommonTree tree, String source, PrintWriter pw) {
		boolean ok = true;
		
		LinkedList<Tree> queue = new LinkedList<Tree>();
		queue.add((Tree) tree);
		
		while (queue.size() > 0) {
			Tree current = queue.removeFirst();
			if(current.getLine()<1){
				String token = current.getText();
				if (token != null) {
					boolean evalNode = evaluateNode(token, current, source, pw);
					if (!evalNode) {
						ok = false;
					}
				} 
			}
			int numChildrens = current.getChildCount();
			for (int i = 0; i < numChildrens; i++) {
				Tree child = current.getChild(i);
				queue.addLast(child);
			}
			
		}
		
		return ok;
	}
	
	public abstract boolean evaluateNode(String token, Tree subtree, String source, PrintWriter pw);
	
	private class TreeLevel {
		Tree t;
		int level;
		public TreeLevel(Tree t, int level) {
			this.t= t;
			this.level = level;
		}
	}
	
	protected String dfsWoRoot(Tree tree) {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		LinkedList<TreeLevel> queue = new LinkedList<TreeLevel>();
		int numChildrens = tree.getChildCount();
		for (int i = 0; i < numChildrens; i++) {
			Tree child = tree.getChild(i);
			queue.addLast(new TreeLevel(child, 0));
		}
		
		int currentLevel = 0;
		while (queue.size() > 0) {
			TreeLevel current = queue.removeFirst();
			if (current.level == currentLevel + 1) {
				++currentLevel;
				sb.append("\n");
				for (int i = 0; i < currentLevel * 4; i++)
					sb.append(" ");
			}
			
			sb.append(current.t.getText()).append(' ');
			
			numChildrens = current.t.getChildCount();
			for (int i = numChildrens - 1; i >= 0; i--) {
				Tree child = current.t.getChild(i);
				queue.addFirst(new TreeLevel(child, current.level + 1));
			}
		}

		sb.append("\n");
		return sb.toString();
	}
	
	protected String reversedPath(Tree subtree) {
		StringBuilder sb = new StringBuilder();
		sb.append("\n"); 
		
		Tree tmp = subtree;
		
		while (tmp != null) {
			sb.append(tmp.getText());
			if (tmp.getText().compareTo("FUNCTION_DECL") == 0 ||
				tmp.getText().compareTo("CONCRETE_UNIT_DECL") == 0 ||
				tmp.getText().compareTo("TYPE_DECL") == 0 ||
				tmp.getText().compareTo("ATTRIBUTE_DECL") == 0 ||
				tmp.getText().compareTo("VAR_DECL") == 0 ||
				tmp.getText().compareTo("FUNCTION_CALL") == 0 ||
				tmp.getText().compareTo("ARGUMENT") == 0 ||
				tmp.getText().compareTo("PARAMETER_DECL") == 0) 
			{
				String name = "";
				for (int i = 0; i < tmp.getChildCount(); i++) {
					if (tmp.getChild(i).getText().compareTo("NAME") == 0) {
						name = dfsWoRoot(tmp.getChild(i)).substring(1).trim();
					}
				}
				sb.append("[").append(name).append("]");
			}
			sb.append(" ");
			
			tmp = tmp.getParent();
		}
		
		sb.append(dfsWoRoot(subtree.getParent()));
		
		sb.append("\n");
		return sb.toString();
	}
	
	protected int countChild(String tok, Tree subtree) {
		int cnt = 0;
		for (int i = 0; i < subtree.getChildCount(); i++) {
			if (tok.compareTo(subtree.getChild(i).getText()) == 0)
				++cnt;
		}
		
		return cnt;
	}
	
}
