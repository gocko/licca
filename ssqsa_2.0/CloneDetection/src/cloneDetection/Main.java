package cloneDetection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

import datastructures.result.Results;
import datastructures.result.export.ResultExporter;
import datastructures.result.export.ResultExporterImpl;

import ecst.ECSTree;
import util.DirectoryWalker;

public class Main {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("CloneDetective <ecstDir> <output>");
			return;
		}

		List<ECSTree> compilationUnits = collectCompilationUnits(args);
		Results results = new LCSCloneDetective()
				.detectClones(compilationUnits);
		exportResults(args[1], results);
	}

	private static List<ECSTree> collectCompilationUnits(String[] args) {
		String dir = args[0];
		DirectoryWalker dw = new DirectoryWalker(dir, new String[] { "xml" });
		List<ECSTree> compilationUnits = new LinkedList<>();
		for (String file : dw.getFiles()) {
			compilationUnits.add(new ECSTree(file));
		}
		return compilationUnits;
	}

	private static void exportResults(String outputFilePath, Results results) {
		ResultExporter exporter = new ResultExporterImpl();
		PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream(outputFilePath));
			//exporter.exportAsTable(results, out);
			exporter.toARFF(results, out);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Writing results to standard out...");
			exporter.exportAsTable(results);
		} finally {
			if (out != null)
				out.close();
		}
	}

}
