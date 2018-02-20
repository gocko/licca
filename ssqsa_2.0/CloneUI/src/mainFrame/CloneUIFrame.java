package mainFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import mainFrame.bottomPanel.BottomPanel;
import mainFrame.menu.ResultMenu;
import mainFrame.sourceCodePanel.SourceCodePanel;

public class CloneUIFrame extends JFrame {

	private static final long serialVersionUID = 2230862311005138706L;

	public CloneUIFrame() {
		setTitle("CloneUI");
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(new BottomPanel(), BorderLayout.SOUTH);
		setJMenuBar(new ResultMenu());
		JPanel center = new JPanel(new GridLayout(1,2));
		center.add(new SourceCodePanel());
		center.add(new SourceCodePanel());
		getContentPane().add(center);
		setSize(900,630);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new CloneUIFrame();
	}

	

}
