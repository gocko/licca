package treeCheckers;

import java.io.PrintWriter;
import java.util.LinkedList;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class EmptyNodeChecker {

	public boolean evaluate(CommonTree tree, String source, PrintWriter pw) {
		boolean ok = true;
		int numEmpty = 0, numNull = 0;
		
		LinkedList<Tree> queue = new LinkedList<Tree>();
		queue.add((Tree) tree);
		
		while (queue.size() > 0) {
			Tree current = queue.removeFirst();
			String token = current.getText();
			if (token != null) {
				String nodeText = current.getText();
				if (nodeText.length() == 0) {
					ok = false;
					++numEmpty;
				}
			} else {
				ok = false;
				++numNull;
			}
			
			int numChildrens = current.getChildCount();
			for (int i = 0; i < numChildrens; i++) {
				Tree child = current.getChild(i);
				queue.addLast(child);
			}
		}
		
		if (!ok) {
			pw.println("EMPTY/NULL nodes, " + source + ", numEmpty = "
					   + numEmpty + " numNull = " + numNull);		
		}
		
		return ok;
	}
}
