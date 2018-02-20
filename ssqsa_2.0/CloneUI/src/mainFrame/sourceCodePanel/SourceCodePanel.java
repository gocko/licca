package mainFrame.sourceCodePanel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;

import javax.swing.JPanel;

import pubSub.Message;
import pubSub.MessageBroker;
import pubSub.Subscriber;
import datastructures.result.Result;
import ecst.ECSTree;

public class SourceCodePanel extends JPanel implements Subscriber {

	private static final long serialVersionUID = 1L;

	private OpenFileButton openFileButton;
	private ShowECSTreeButton showECSTreeButton;
	private FileNameLabel fileNameLabel;
	private TextPanel textPanel;

	public SourceCodePanel() {
		openFileButton = new OpenFileButton();
		fileNameLabel = new FileNameLabel();
		showECSTreeButton = new ShowECSTreeButton();
		textPanel = new TextPanel();
		init();
		MessageBroker.instance().register(this);
		setPreferredSize(new Dimension(250, 400));
	}

	private void init() {
		setLayout(new BorderLayout());
		JPanel north = new JPanel();
		north.setLayout(new FlowLayout(FlowLayout.CENTER));
		north.add(openFileButton);
		north.add(showECSTreeButton);
		north.add(fileNameLabel);
		add(north, BorderLayout.NORTH);
		add(textPanel);
	}

	@Override
	public Class<?>[] messageTypes() {
		return new Class<?>[] { File.class, Result.class, ECSTree.class };
	}

	@Override
	public void onMessageReceived(Message message) {
		if (messageIsOfType(message, File.class)
				&& senderIsMyComponent(message, openFileButton)) {
			onFileMessage((File) message.getData());
			return;
		}
		if (messageIsOfType(message, Result.class)) {
			onResultMessage((Result) message.getData());
			return;
		}
		if (messageIsOfType(message, ECSTree.class) && senderIsMyComponent(message, textPanel.getStyledTextPane())) {
			onECSTreeMessage((ECSTree)message.getData());
		}
	}

	private boolean messageIsOfType(Message message, Class<?> type) {
		return message.getType().equals(type);
	}

	private boolean senderIsMyComponent(Message message, Component component) {
		return message.getSender().equals(component);
	}

	private void onFileMessage(File file) {
		fileNameLabel.update(file);
		showECSTreeButton.setEnabled(true);
		textPanel.getStyledTextPane().render(file);
	}

	private void onResultMessage(Result result) {
		textPanel.getStyledTextPane().render(result);
	}

	private void onECSTreeMessage(ECSTree ecsTree) {
		showECSTreeButton.setECSTree(ecsTree);
	}
}
