package treeCheckers;

import java.io.PrintWriter;
import org.antlr.runtime.tree.Tree;

public class HalsteadCompatibilityChecker extends CompatibilityChecker {

	public boolean evaluateNode(String token, Tree subtree, String source, PrintWriter pw) {
		if (token.compareTo("H_KEYWORD")   == 0 ||
			token.compareTo("H_OPERATOR")  == 0 ||
			token.compareTo("H_SEPARATOR") == 0 ||
			token.compareTo("H_TYPE")      == 0 ||
			token.compareTo("H_DIRECTIVE") == 0 ||
			token.compareTo("H_CONST")     == 0)
		{
			int childCnt = subtree.getChildCount();
			if (childCnt == 0) {
				pw.println(token + ", empty subtree, " + source + ", " + reversedPath(subtree));
				return false;
			}
			else
			if (childCnt > 1) {
				pw.println(token + ", complex subtree, " + source + ", " + reversedPath(subtree));
				return false;
			}
		}
		
		return true;
	}
	
}
