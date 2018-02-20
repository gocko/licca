package ecst.universalNodes;

import ecst.ECSTNode;
import ecst.ShortToken;

//svc.owlmetrics.east.universalNodes

public class Keyword extends Lexeme {

	public Keyword(ShortToken token) {
		super(token);
	}
	
	public Keyword(ShortToken token, ECSTNode parent) {
		super(token, parent);
	}

}
