import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import ecst.ECSTree;

public class Visualizer extends JFrame {
	
	private JFileChooser fileChooser;
	private final JPanel centerPanel;
	
	public Visualizer() {
		
		//init file chooser
		fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Select eCST");
		fileChooser.setMultiSelectionEnabled(false);
		fileChooser.setCurrentDirectory(new File("..\\..\\test"));
		centerPanel = new JPanel();
		initCenterPanel();
		getContentPane().add(centerPanel, BorderLayout.CENTER);
		
		setTitle("eCSTVisualizer");	
		
	}
	
	private void initCenterPanel() {
		// top panel with button to open ecst
		final JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton openFile  = new JButton("Open eCST");
		openFile.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (fileChooser.showOpenDialog(Visualizer.this) == JFileChooser.APPROVE_OPTION) {
					renderTree(fileChooser.getSelectedFile(), centerPanel);
					((JLabel)top.getComponent(1)).setText(fileChooser.getSelectedFile().getName());
				}
				
			}
		});
		top.add(openFile);
		top.add(new JLabel());
		centerPanel.add(top, BorderLayout.NORTH);
		
		// center scrollable panel for tree
		JScrollPane scroll = new JScrollPane();
		centerPanel.add(scroll, BorderLayout.CENTER);
	}
	
	private void renderTree(File file, JPanel container) {
		JTree jtree =  new JTree(ECSTTreeModelFactory.createModel(new ECSTree(file.toString())));
		for (int i = 0; i < jtree.getRowCount(); i++) {
			jtree.expandRow(i);
		}
		JScrollPane scroll = new JScrollPane(jtree);
		scroll.setSize(400, 720);
		container.remove(1);
		container.add(scroll, BorderLayout.CENTER);
		container.repaint();
		container.revalidate();
		
	}

	public static void main(String[] args) {
		Visualizer visualizer = new Visualizer();
		visualizer.setSize(450, 800);
		visualizer.setResizable(false);
		visualizer.setDefaultCloseOperation(EXIT_ON_CLOSE);
		visualizer.setVisible(true);
	}

}
