package util;
import java.io.File;

public class DirStructure {
	public void createDirStructure(String inputPath){
		String path = FileFind.findFileLocation(inputPath);
		File f = new java.io.File(path + "\\XML");
	}
}
