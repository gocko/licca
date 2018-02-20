package datastructures.detectionUnit;

import java.io.File;

import ecst.ECSTNode;

class DetectionUnitImpl extends DetectionUnit {
	private File sourceFile;
	private ECSTNode rootNode;
	private int numberOfStatements;

	private String name;

	DetectionUnitImpl(File sourceFile, ECSTNode rootNode, int numberOfStatements) {
		super();
		this.sourceFile = sourceFile;
		this.rootNode = rootNode;
		this.numberOfStatements = numberOfStatements;
		name = findName();
	}

	private String findName() {
		ECSTNode node = rootNode;
		while (node != null
				&& !(node.getToken().getText().equals("FUNCTION_DECL"))) {
			node = node.getParent();
		}
		if (node == null) {
			return "main block";
		}
		for (ECSTNode child : node.getChilds()) {
			if (child.getToken().getText().equals("NAME")) {
				return child.getChilds().getFirst().getToken().getText();
			}
		}
		return "";
	}

	public DetectionUnitImpl() {
		super();
	}

	@Override
	public File getSourceFile() {
		return sourceFile;
	}

	@Override
	public ECSTNode getRootNode() {
		return rootNode;
	}

	@Override
	public int getNumberOfStatements() {
		return numberOfStatements;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return fileNameWithoutECSTExtension() + "#" + getName();
	}

	private String fileNameWithoutECSTExtension() {
		int index = sourceFile.getName().indexOf("_eCST");
		return sourceFile.getName().substring(0, index);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof DetectionUnit))
			return false;
		DetectionUnit other = (DetectionUnit) obj;
		return this.getSourceFile().equals(other.getSourceFile())
				&& this.getName().equals(other.getName());
	}

	@Override
	public int hashCode() {
		int prime = 17;
		return getSourceFile().hashCode() * prime + getName().hashCode()
				* prime;
	}
}
