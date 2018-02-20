package mainFrame.bottomPanel;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class BottomPanel extends JPanel {
	
	private static final long serialVersionUID = -8049191723693146929L;
	
	public BottomPanel() {
		setLayout(new GridLayout(1, 2));
		initButtons();
		initTextPane();
		setPreferredSize(new Dimension(900, 130));
	}
	
	private void initButtons() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createVerticalGlue());
		JButton button = new DetectClonesButton();
		button.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		panel.add(button);
		button = new ShowResultMatrix();
		button.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		panel.add(button);
		panel.add(Box.createVerticalGlue());
		add(panel);
	}
	
	private void initTextPane() {
		JScrollPane panel = new JScrollPane(new SimilarityTextPane());
		add(panel);
	}
}
