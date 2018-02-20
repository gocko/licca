package ecst.universalNodes; //svc.owlmetrics.east.universalNodes;

import ecst.ECSTNode;
import ecst.ShortToken;
//svc.owlmetrics.east.EastNode;

public class Expr extends ECSTNode {

	
	
	public Expr(ShortToken token, ECSTNode parent) {
		// mustHaveName = true
		// mustHaveType = true
		super(token, parent);
	}
	
	public Expr(ShortToken token) {
		super(token);
	}

}
