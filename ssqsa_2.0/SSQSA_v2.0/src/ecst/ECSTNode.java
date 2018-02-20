/*
 * Copyright (C) 2012-2013 by Milos Savic 
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import util.treeTraversal.TreeTraversal;
import util.treeTraversal.Visitor;

import ecst.universalNodes.NameIgnore;


/**
 * Class encapsulating node in an ecst tree
 * 29 jul 2012, svc@dmi.uns.ac.rs
 */
//Goca: moramo cuvati ceo token jer ne mozemo samo na osnovu texta znati da li je univerzalni cvor
//primer Konstanta TYPE
public class ECSTNode {
	
	private static int idCounter = 0;
	private int id;
		
	// parent node 
	protected ECSTNode parent;
	
	// childrens
	protected LinkedList<ECSTNode> childs = 
		new LinkedList<ECSTNode>();
	
	// token contained in this node
	protected ShortToken token;
	
	public ECSTNode(ShortToken token, ECSTNode parent) {
		this.token = token;
		this.parent = parent;
		this.id = ++idCounter;
	}
	
	public ECSTNode(ShortToken token) {
		this.token = token;
	}
	
	public ECSTNode(String text, ECSTNode parent) {
		this.token = new ShortToken(text);
		this.parent = parent;
	}

	
	// TODO: loading from configuration file
	private String[][] normalizerMap = {
			{"DOT", "."}	
	};
	
	private String tokenNormalizer(String token) {
		for (int i = 0; i < normalizerMap.length; i++) {
			if (token.compareTo(normalizerMap[i][0]) == 0) {
				return normalizerMap[i][1];
			}
		}
		
		return token;
	}
	
	public ECSTNode getParent() {
		return parent;
	}
	
	public void addChildren(ECSTNode n) {
		childs.add(n);
	}
	
	public LinkedList<ECSTNode> getChilds() {
		return childs;
	}
	
	public ShortToken getToken() {
		return token;
	}
	
	public void rewriteToken(ShortToken newToken) {
		this.token = newToken;
	}
	
	public void disposeChilds() {
		childs = null;
		childs = new LinkedList<ECSTNode>();
	}
	
	public String toString() {
		return token.getText();
	}
	
	public static boolean tokensMatch(ECSTNode node1, ECSTNode node2) {
		return node1.getToken().getText().equals(node2.getToken().getText());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) 
			return false;
		if (!obj.getClass().equals(this.getClass()))
			return false;
		ShortToken token = ((ECSTNode)obj).getToken();
		return token.getText().equals(getToken().getText()) &&
				token.getLine().equals(getToken().getLine()) &&
				token.getColumn().equals(getToken().getColumn());
	}
	
	public String toRootFingerPrint() {
		StringBuilder sb = new StringBuilder();
		
		ECSTNode tmp = parent;
		while (tmp != null) {
			sb.append(tmp.toString()).append(" <-- ");
			tmp = tmp.getParent();
		}
		
		return sb.toString();
	}
	
	public ECSTNode findFirstAtFirstLevel(ShortToken token) {
		for (int i = 0; i < childs.size(); i++) {
			if (childs.get(i).getToken().getText().compareTo(token.getText()) == 0)
				return childs.get(i);
		}
		
		return null;
	}
	
	public LinkedList<ECSTNode> findAllAtFirstLevel(ShortToken token) {
		LinkedList<ECSTNode> retList = new LinkedList<ECSTNode>();
		for (int i = 0; i < childs.size(); i++) {
			if (childs.get(i).getToken().getText().compareTo(token.getText()) == 0) {
				retList.addLast(childs.get(i));
			}
		}
		
		return retList;
	}
	
	public String printDfsSubtree(boolean excludeUniversalNodes) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < childs.size(); i++) {
			sb.append(dfsFingerPrint(childs.get(i), excludeUniversalNodes));
		}
		
		return sb.toString();
	}
	
	public List<ECSTNode> dfsSubtree(final boolean excludeUniversalNodes) {
		final List<ECSTNode> children = new ArrayList<>();
		for (ECSTNode ecstNode : childs) {
			TreeTraversal.dfs(ecstNode, new Visitor() {
				
				@Override
				public void doJob(ECSTNode node) {
					boolean isUniversal = ECSTNodeFactory.universalNode(node.getToken());
					if ((excludeUniversalNodes && !isUniversal) || !excludeUniversalNodes) {
						children.add(node);
					}
				}
			});
		}	
		return children;
	}
	
	private String dfsFingerPrint(ECSTNode node, boolean excludeUniversalNodes) {
		
		if (node instanceof NameIgnore)
			return "";
		
		StringBuilder sb = new StringBuilder();
		LinkedList<ECSTNode> queue = new LinkedList<ECSTNode>();
		queue.addFirst(node);
		
		while (queue.size() > 0) {
			ECSTNode current = queue.removeFirst();
			
			if (current instanceof NameIgnore)
				continue;
			
			if (excludeUniversalNodes) {
				if (!ECSTNodeFactory.universalNode(current.getToken())) {
					sb.append(current.getToken().getText());
				}
			}
			else {
				sb.append(current.getToken().getText());
			}
			
			LinkedList<ECSTNode> childs = current.getChilds();
			if (childs != null) {
				for (int i = childs.size() - 1; i >= 0; i--) {
					queue.addFirst(childs.get(i));
				}
			}
		}
		
		return sb.toString();
	}
	
	
	public boolean emptySubtree() {
		return childs.size() > 0;
	}
	
	public int getId() {
		return id;
	}
	
	public void replaceChild(ECSTNode target, ECSTNode newNode) {
		for (int i = 0; i < childs.size(); i++) {
			if (childs.get(i) == target) {
				childs.set(i, newNode);
				break;
			}
		}
	}
}

