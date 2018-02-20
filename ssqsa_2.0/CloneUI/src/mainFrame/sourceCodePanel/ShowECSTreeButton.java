package mainFrame.sourceCodePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ecst.ECSTree;
import ecstVisualizer.ECSTVisualizer;

public class ShowECSTreeButton extends JButton {


	private static final long serialVersionUID = 3493691199206147286L;
	
	private ECSTree tree;
	
	public ShowECSTreeButton() {
		super("Show eCST");
		setEnabled(false);
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ECSTVisualizer(tree);
			}
		});
	}

	void setECSTree(ECSTree ecsTree) {
		tree = ecsTree;
	}

}
