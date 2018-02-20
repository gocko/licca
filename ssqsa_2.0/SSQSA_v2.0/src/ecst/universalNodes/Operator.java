package ecst.universalNodes;

import ecst.ECSTNode;
import ecst.ShortToken;
//svc.owlmetrics.east.universalNodes

public class Operator extends Lexeme {

	public Operator(ShortToken token) {
		super(token);
	}
	
	public Operator(ShortToken token, ECSTNode parent) {
		super(token, parent);
	}

}
