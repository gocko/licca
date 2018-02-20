package mainFrame.bottomPanel;

import java.awt.Dimension;
import java.io.File;

import javax.swing.JTextPane;

import pubSub.Message;
import pubSub.MessageBroker;
import pubSub.Subscriber;
import datastructures.detectionUnit.DetectionUnit;
import datastructures.result.Result;

public class SimilarityTextPane extends JTextPane implements Subscriber {

	private static final long serialVersionUID = 1L;

	public SimilarityTextPane() {
		MessageBroker.instance().register(this);
		setPreferredSize(new Dimension(100, 50));
		setEditable(false);
		setText("*** CLONE DETECTION OUTPUT LOG ***");
	}

	@Override
	public Class<?>[] messageTypes() {
		return new Class<?>[] { Result.class };
	}

	@Override
	public void onMessageReceived(Message message) {
		Result result = (Result) message.getData();
		similarity(result);
		setText(similarity(result)
				+ statementsMatched(result, result.getDetectionUnit1())
				+ statementsMatched(result, result.getDetectionUnit2()));
	}

	private String similarity(Result result) {
		return "Similarity = " + (int) (result.getSimilarity() * 100) + "%\n";
	}

	private String statementsMatched(Result result, DetectionUnit detectionUnit) {
		return fileLabel(detectionUnit)
				+ ": "
				+ coverage(result.getNumberOfStatementsMatched(),
						detectionUnit.getNumberOfStatements()) + "% coverage "
				+ "(" + result.getNumberOfStatementsMatched() + "/"
				+ detectionUnit.getNumberOfStatements() + " statements)" + "\n";
	}

	private int coverage(int statementsMatched, int totalNumberOfStatements) {
		double coverage = (double) statementsMatched / totalNumberOfStatements;
		return (int) (coverage * 100);
	}

	private String fileLabel(DetectionUnit detectionUnit) {
		String absolutePath = detectionUnit.getSourceFile().getAbsolutePath();
		String label = absolutePath.substring(absolutePath
				.lastIndexOf(File.separator) + 1);
		return label.substring(0, label.indexOf("_"));
	}

}
