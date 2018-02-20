package ecst.universalNodes;
//svc.owlmetrics.east.universalNodes

import ecst.ECSTNode;
import ecst.ShortToken;
//svc.owlmetrics.east.EastNode

public class Lexeme extends ECSTNode {

	public Lexeme(ShortToken token) {
		super(token);
	}
	
	public Lexeme(ShortToken token, ECSTNode parent) {
		super(token, parent);
	}

}
