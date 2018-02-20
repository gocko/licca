package ecst.util;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;



import ecst.ECSTNode;
import ecst.ECSTree;
import util.DirectoryWalker;
import util.LOG;

public class ECSTStructure {

	private static LinkedList<String> compilationUnits; 
	private static ECSTree tree;
	
	public static LinkedList<String> getFilesFromFolder(String workingDir){
		
		File f = new File(workingDir);
		if (!f.exists() && !f.isDirectory()) {
			LOG.info("Sneipl error: directory " + workingDir + " does not exists");
			return null;
		} 
			
		DirectoryWalker dw = new DirectoryWalker(workingDir, new String[]{"xml"});
		compilationUnits = dw.getFiles();
		
		return compilationUnits;
		
	}
	
	
	public static LinkedList<ECSTNode> convertTreeToList(String treeName){
		
		
		 tree = new ECSTree(treeName);
		
		 ECSTNode root = tree.getRoot();
		 LinkedList<ECSTNode> queue = new LinkedList<ECSTNode>();
		 
		 
		 //root element is the first member of the list
		 queue.add(root);
		 while (queue.size() > 0) {
			 ECSTNode currentNode = queue.removeFirst();
			 
		     System.out.println(currentNode.toString());

		     //children on the same level are added to list
			 LinkedList<ECSTNode> childs = currentNode.getChilds();
		   	 for (int i = 0; i < childs.size(); i++) {
				queue.addLast(childs.get(i));
			 }
			
		}
		
		return queue;
	}
	
	public static LinkedList<ECSTNode> convertTreeToList(ECSTree tree){
		
		
		 //tree = new ECSTree(treeName);
		
		 ECSTNode root = tree.getRoot();
		 LinkedList<ECSTNode> queue = new LinkedList<ECSTNode>();
		 
		 
		 //root element is the first member of the list
		 queue.add(root);
		 while (queue.size() > 0) {
			 ECSTNode currentNode = queue.removeFirst();
			 
		     System.out.println(currentNode.toString());

		     //children on the same level are added to list
			 LinkedList<ECSTNode> childs = currentNode.getChilds();
		   	 for (int i = 0; i < childs.size(); i++) {
				queue.addLast(childs.get(i));
			 }
			
		}
		
		return queue;
	}
	
	
	
	public static void main(String[] args) 
			throws IOException
		{
			
			LinkedList<String> lista = getFilesFromFolder(args[0]);
			
			
			System.out.println(lista.toString());
			
			for(String fajl:lista){
				convertTreeToList(fajl);
			}
			
		}
	
	
}
