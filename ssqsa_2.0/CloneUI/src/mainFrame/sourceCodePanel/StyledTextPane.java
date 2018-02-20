package mainFrame.sourceCodePanel;

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

import pubSub.Message;
import pubSub.MessageBroker;
import pubSub.Publisher;

import datastructures.result.Result;
import eCSTGenerator.ParsingConvertor;
import ecst.ECSTNode;
import ecst.ECSTree;
import ecst.ShortToken;

class StyledTextPane extends JTextPane implements Publisher {

	private static final long serialVersionUID = -549264347271390661L;

	private static final File tmpDir = new File(".\\tmp");

	static {
		try {
			tmpDir.mkdir();
			for (File f : tmpDir.listFiles()) {
				f.delete();
			}
		} catch (SecurityException ex) {
			System.exit(ERROR);
		}
	}

	private ECSTree tree;
	private String fileContent;
	
	private Styles styles;

	public StyledTextPane() {
		setPreferredSize(new Dimension(250, 400));
		setEditable(false);
		styles = new Styles();
	}

	void render(File file) {
		fileContent = parseFile(file);
		tree = new ECSTree(ecstPath(file));
		reset();
		printContent(fileContent, styles.REGULAR);
		MessageBroker.instance().send(new Message(ECSTree.class, tree, this));
	}

	private void reset() {
		try {
			getStyledDocument().remove(0, getStyledDocument().getLength());
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	private String parseFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line.replaceAll("\t", "  ") + "\r\n");
			}
			fileContent = sb.toString();
		} catch (IOException e) {
			fileContent = "";
			e.printStackTrace();
		}
		return sb.toString();
	}

	private String ecstPath(File file) {
		return new ParsingConvertor().parseFile(file.getAbsolutePath(),
				new File(file.getAbsolutePath()), tmpDir.getAbsolutePath());
	}

	void render(Result result) {
		reset();
		List<ECSTNode> matchedNodes = matchedNodes(result.getMatchedNodesIds());
		String[] lines = fileContent.split("\r\n");
		int positionInList = 0;
		for (int i = 0; i < lines.length; i++) {
			int offset = 0;
			while (positionInList < matchedNodes.size()
					&& nodeBelongsToLine(matchedNodes.get(positionInList), i)) {
				ShortToken token = matchedNodes.get(positionInList).getToken();
				int indexOfCloneInLine = indexOfCloneInLine(lines[i], token, offset);
				printContent(lines[i].substring(offset, indexOfCloneInLine),
						styles.REGULAR);
				printContent(token.getText(), styles.CLONE);
				offset = indexOfCloneInLine + token.getText().length();
				positionInList++;
			}
			printContent(lines[i].substring(offset) + "\r\n",
					styles.REGULAR);
		}
	}

	private int indexOfCloneInLine(String line, ShortToken token, int startAt) {
		int index = line.indexOf(token.getText(), startAt);
		while (index < Integer.parseInt(token.getColumn())) {
			index = line.indexOf(token.getText(), index + 1);
		}
		return index;
	}

	private List<ECSTNode> matchedNodes(Set<Integer> matchedNodesIds) {
		List<ECSTNode> concreteNodes = tree.getRoot().dfsSubtree(true);
		for (Iterator<ECSTNode> iterator = concreteNodes.iterator(); iterator
				.hasNext();) {
			ECSTNode ecstNode = (ECSTNode) iterator.next();
			if (!matchedNodesIds.contains(ecstNode.getId())) {
				iterator.remove();
			}
		}
		sortByLineAndColumn(concreteNodes);
		return concreteNodes;
	}

	private boolean nodeBelongsToLine(ECSTNode node, int line) {
		return line == Integer.parseInt(node.getToken().getLine()) - 1;
	}

	private void sortByLineAndColumn(List<ECSTNode> list) {
		Collections.sort(list, new Comparator<ECSTNode>() {

			@Override
			public int compare(ECSTNode o1, ECSTNode o2) {
				int line1 = Integer.parseInt(o1.getToken().getLine());
				int line2 = Integer.parseInt(o2.getToken().getLine());
				int col1 = Integer.parseInt(o1.getToken().getColumn());
				int col2 = Integer.parseInt(o2.getToken().getColumn());
				if (line1 == line2) {
					return col1 - col2;
				}
				return line1 - line2;
			}
		});
	}

	private void printContent(String text, Style style) {
		try {
			getStyledDocument().insertString(getStyledDocument().getLength(),
					text, style);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	private class Styles {
		
		final Style CLONE = createStyle("clone", Color.red);
		final Style REGULAR = createStyle("regular", Color.black);

		private Style createStyle(String name, Color... colors) {
			Style style = StyledTextPane.this.addStyle(name, null);
			addColors(style, colors);
			return style;
		}

		private void addColors(Style style, Color... colors) {
			for (Color color: colors) {
				StyleConstants.setForeground(style, color);
			}
		}
	}
}
