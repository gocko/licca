package util;
public class FileFind {

	public static String findExtension(String fileName){
		String[] strings = fileName.split("\\.");
		String extension = strings[strings.length-1];
		return extension;
	}
	
	public static String findFileName(String filePath){
		String[] strings = filePath.split("\\\\");
		String fileName = strings[strings.length-1];
		return fileName;
		
	}
	
	public static String findFileLocation(String filePath){
		String[] strings = filePath.split("\\\\");
		String fileLocation = "";
		for(int i=0; i<(strings.length-1); i++){
			fileLocation += strings[i]+"\\" ;
		}
		System.out.println(fileLocation);
		return fileLocation;
		
	}
	
	


}
