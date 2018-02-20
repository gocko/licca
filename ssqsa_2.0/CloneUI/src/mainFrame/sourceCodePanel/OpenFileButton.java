package mainFrame.sourceCodePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import pubSub.Message;
import pubSub.MessageBroker;
import pubSub.Publisher;

public class OpenFileButton extends JButton implements Publisher {

	private static final long serialVersionUID = 1L;

	private static final JFileChooser fileChooser;

	static {
		fileChooser = new JFileChooser(new File("..\\..\\test"));
		fileChooser.setDialogTitle("Select source file");
		fileChooser.setMultiSelectionEnabled(false);
	}

	public OpenFileButton() {
		super("Open file");
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					MessageBroker.instance().send(
							new Message(File.class, fileChooser
									.getSelectedFile(), OpenFileButton.this));
				}
			}
		});
	}

}
