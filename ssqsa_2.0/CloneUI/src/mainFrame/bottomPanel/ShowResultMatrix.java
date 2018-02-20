package mainFrame.bottomPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import matrixVisualizer.MatrixVisualizer;

import datastructures.result.Result;
import datastructures.result.ResultMatrix;

import pubSub.Message;
import pubSub.MessageBroker;
import pubSub.Subscriber;

public class ShowResultMatrix extends JButton implements Subscriber {

	private static final long serialVersionUID = 1L;
	
	private ResultMatrix resultMatrix;

	public ShowResultMatrix() {
		super("Show result matrix");
		MessageBroker.instance().register(this);
		setEnabled(false);
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new MatrixVisualizer(resultMatrix);
			}
		});
	}

	@Override
	public Class<?>[] messageTypes() {
		return new Class<?>[]{Result.class};
	}

	@Override
	public void onMessageReceived(Message message) {
		resultMatrix = ((Result)message.getData()).getResultMatrix();
		setEnabled(true);
	}
}
