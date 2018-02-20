package ecst.postprocessor.completitition.entity;

import java.util.LinkedList;


import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;



public class EntityAdaptor {
	CommonTree ecst; 
	String compilationUnitName;
	
	public EntityAdaptor(CommonTree ecst, String compilationUnitName){
		this.ecst = ecst;
		this.compilationUnitName = compilationUnitName;
	}
	
	public void fillUnitName() {
		LinkedList<CommonTree> queue = new LinkedList<CommonTree>();
		queue.add(ecst);
		
		CommonTree cud = null;
		while (cud == null && queue.size() > 0) {
			CommonTree current = queue.removeFirst();
			
			if (current.getText().compareTo("CONCRETE_UNIT_DECL") == 0) {
				cud = current;
			}
			
			if (cud == null) {
				for (int i = 0; i < current.getChildCount(); i++) {
					queue.addLast((CommonTree) current.getChild(i));
				}
			}
		}
		
		if (cud != null) {
			int i = 0;
			CommonTree nameTree = null;
			while (i < cud.getChildCount()) {
				CommonTree c = (CommonTree) cud.getChild(i);
				if (c.getText().compareTo("NAME") == 0) {
					nameTree = c;
					break;
				}
			}
			if ((nameTree.getChildCount()>0) && (nameTree.getChild(0).getText().compareToIgnoreCase("EMPTY")==0)){
				nameTree.deleteChild(0);
				nameTree.addChild(new CommonTree(new CommonToken(1, compilationUnitName)));
			}
		}
	}


}
