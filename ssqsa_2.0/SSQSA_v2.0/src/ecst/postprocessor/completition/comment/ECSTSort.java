package ecst.postprocessor.completition.comment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class ECSTSort {

	private static CommonTree minTree = null;
	private static CommonTree maxTree = null;
	
	public static void Sort(CommonTree tree, List<CommonTree> subtrees){		
		
		for (CommonTree subtree : subtrees){
			CommonTree comment = (CommonTree)subtree.getChild(0);
			Token commentToken = comment.getToken();
			findSurroundingChildren(tree, commentToken);
			
			CommonTree lca = findLowestCommonAncestor(tree, findPathToRoot(minTree), findPathToRoot(maxTree));
			insertSubtree(lca, subtree, calculateInsertPosition(lca, maxTree));
			
			minTree = null;
			maxTree = null;			
		}
		//return tree;
	}
	
	
	
	// DEPTH FIRST algoritam za nalazenje tokena koji su neposredno pre i posle tokena komentara
	private static void findSurroundingChildren(CommonTree tree, Token token){
		if( tree.getToken().getLine() < token.getLine() ){
			if (minTree == null){
				minTree = tree;
			} else {
				if(tree.getToken().getLine() > minTree.getToken().getLine()){
					minTree = tree;
				}
			}
			
		}
		
		if( tree.getToken().getLine() > token.getLine() ){
			if (maxTree == null){
				maxTree = tree;
			} else {
				if(tree.getToken().getLine() < maxTree.getToken().getLine()){
					maxTree = tree;
				}
			}
			
		} 
		
		if(tree.getChildCount() > 0){
			for(CommonTree child : (List<CommonTree>)tree.getChildren()){
				findSurroundingChildren(child, token);
			}
		}
	}
	
	// Pronalazi najnizeg zajednickog pretka (LCA)
	private static CommonTree findLowestCommonAncestor(CommonTree root, Stack<CommonTree> path1, Stack<CommonTree> path2){
		CommonTree lowestCommonAncestor = root;
		if (path1 != null && path2 != null){
			if(path1.size() <= path2.size()){
				while(!path1.isEmpty()){
					if(path1.peek().equals(path2.peek())){
						lowestCommonAncestor = path1.pop();
						path2.pop();
					} else {
						return lowestCommonAncestor;
					}
				}
			} else {
				while(!path2.isEmpty()){
					if(path2.peek().equals(path1.peek())){
						lowestCommonAncestor = path2.pop();
						path1.pop();
					} else {
						return lowestCommonAncestor;
					}
				}
			}			
		}

		return lowestCommonAncestor;
	}
	
	// Vraca putanju od deteta do korena, zajedno sa krajnjim tackama
	private static Stack<CommonTree> findPathToRoot(CommonTree child){
		Stack<CommonTree> path = new Stack<CommonTree>();
		CommonTree nextParent = child; 
		if(nextParent.getParent() == null){
			return null;
		}
		while(nextParent != null){
			path.push(nextParent);
			nextParent = (CommonTree)nextParent.getParent();
		}
		
		return path;
	}
	
	// Ubacuje podstablo u podstablo na tacno odredjenu poziciju
	private static void insertSubtree(CommonTree tree, CommonTree subtree, int position){
		ArrayList<CommonTree> children = new ArrayList<CommonTree>();
		for(int i = 0; i< position; i++){
			children.add((CommonTree)tree.deleteChild(0));
		}
		children.add(subtree);
		while(tree.getChildCount() != 0){
			children.add((CommonTree)tree.deleteChild(0));
		}
		tree.addChildren(children);
	}

	// Pronalazi pogodan indeks za ubacivanje podstabla
	private static int calculateInsertPosition(CommonTree finishnode, CommonTree startNode){
		CommonTree nextParent = startNode;
		int position = 0;
		while(!nextParent.equals(finishnode)){
			position = nextParent.getChildIndex();
			nextParent = (CommonTree)nextParent.getParent();
		}
		
		return position;
	}	
	
}
