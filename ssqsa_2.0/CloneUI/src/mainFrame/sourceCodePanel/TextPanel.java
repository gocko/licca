package mainFrame.sourceCodePanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TextPanel extends JPanel {

	private static final long serialVersionUID = -6399294286810841313L;

	private StyledTextPane styledTextPane;

	public TextPanel() {
		styledTextPane = new StyledTextPane();
		add(new JScrollPane(styledTextPane));
	}

	StyledTextPane getStyledTextPane() {
		return styledTextPane;
	}

}
