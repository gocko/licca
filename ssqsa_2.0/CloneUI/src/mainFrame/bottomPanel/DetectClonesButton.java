package mainFrame.bottomPanel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;

import pubSub.Message;
import pubSub.MessageBroker;
import pubSub.Publisher;
import pubSub.Subscriber;
import cloneDetection.CloneDetective;
import cloneDetection.LCSCloneDetective;
import datastructures.result.Results;
import ecst.ECSTree;

public class DetectClonesButton extends JButton implements Publisher, Subscriber{

	private static final long serialVersionUID = -5609735952178744727L;
	
	private final CloneDetective cloneDetective = new LCSCloneDetective();
	
	private Map<Publisher, ECSTree> trees = new HashMap<Publisher, ECSTree>();
	
	public DetectClonesButton() {
		super("Detect clones");
		setEnabled(false);
		setSize(new Dimension(100, 80));
		MessageBroker.instance().register(this);
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				List<ECSTree> ecsTrees = new ArrayList<>();
				for (ECSTree tree : trees.values()) {
					ecsTrees.add(tree);
				}
				Results results = cloneDetective.detectClones(ecsTrees);
				MessageBroker.instance().send(new Message(Results.class, results, DetectClonesButton.this));
			}
		});
	}

	@Override
	public Class<?>[] messageTypes() {
		return new Class<?>[]{ECSTree.class};
	}

	@Override
	public void onMessageReceived(Message message) {
		setEnabled(true);
		trees.put(message.getSender(), (ECSTree) message.getData());
	}

}
