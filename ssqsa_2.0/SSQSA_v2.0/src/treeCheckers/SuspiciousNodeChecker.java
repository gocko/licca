package treeCheckers;

import java.io.PrintWriter;
import java.util.LinkedList;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class SuspiciousNodeChecker {

	public boolean evaluate(CommonTree tree, String source, PrintWriter pw) {
		boolean ok = true;
		LinkedList<Tree> queue = new LinkedList<Tree>();
		queue.add((Tree) tree);
		
		while (queue.size() > 0) {
			Tree current = queue.removeFirst();
			String token = current.getText();
			if (token != null) {
				String nodeText = current.getText();
				if (nodeText.startsWith("<") && 
					nodeText.endsWith(">") &&
					nodeText.length() > 10) 
				{
					pw.println("SUSPICIOUS NODE: " + nodeText + ", " + source);
					ok = false;
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
}
