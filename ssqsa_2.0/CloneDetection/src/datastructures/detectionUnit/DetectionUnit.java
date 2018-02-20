package datastructures.detectionUnit;

import java.io.File;

import ecst.ECSTNode;

public abstract class DetectionUnit {

	public abstract File getSourceFile();

	public abstract ECSTNode getRootNode();
	
	public abstract String getName();

	public abstract int getNumberOfStatements();
	
	public static DetectionUnit newInstance(File sourceFile, ECSTNode rootNode, int numberOfStatements) {
		return new DetectionUnitImpl(sourceFile, rootNode, numberOfStatements);
	}
	
	public static DetectionUnit newInstance(File sourceFile, ECSTNode rootNode) {
		return newInstance(sourceFile, rootNode, 0);
	}

}