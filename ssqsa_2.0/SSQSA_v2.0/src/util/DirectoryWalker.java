package util;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import util.FileFind;

/**
 * Forms the list of all files contained in a folder and subfolders
 * @author svc
 * @date jul 2012
 */
public class DirectoryWalker {

	private String[] extensionFilters;
	private LinkedList<String> cachedFiles;
		
	public DirectoryWalker(String rootPath, String[] extensionFilters) {
		this.extensionFilters = extensionFilters;
		cachedFiles = new LinkedList<String>();
		walk(rootPath);
	}
	
	public DirectoryWalker(String rootPath, LinkedList<String> extFiltersList) {
		this.extensionFilters = new String[extFiltersList.size()];
		for (int i = 0; i < extFiltersList.size(); i++) {
			this.extensionFilters[i] = extFiltersList.get(i);
		}
		cachedFiles = new LinkedList<String>();
		walk(rootPath);
	}
	
	private boolean checkFilter(String fileName) {
		for (int i = 0; i < extensionFilters.length; i++) {
			if (fileName.toLowerCase().endsWith(extensionFilters[i].toLowerCase()))
				return true;
		}
		
		return false;
	}

	
	private void walk(String path) {
		File dir = new File(path);
		String[] files = dir.list();
		
		for (int i = 0; i < files.length; i++) {
			String currentFileId = path + "/" + files[i];
			File f = new File(currentFileId);
			if (f.isDirectory()) {
				walk(currentFileId);
			}
			else if (checkFilter(files[i])) {
				String fullPath = f.getAbsolutePath();
				cachedFiles.add(fullPath);
			}
		}
	}
	
	public LinkedList<String> getFiles() {
		return cachedFiles;
	}
	
	public LinkedList<String> getFiles(String name) {
		if (!cachedFiles.isEmpty()){
			Iterator<String> i = cachedFiles.iterator();
			do{
				String filePath = i.toString();
				String fileName = FileFind.findFileName(filePath);
				if(fileName.compareToIgnoreCase(name) != 0 ){
					cachedFiles.remove(i);
				}
				i.next();
			}while(i.hasNext());
		
		}
		return cachedFiles;
	}
}