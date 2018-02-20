package ecstVisualizer;
import java.awt.BorderLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import ecst.ECSTree;

public class ECSTVisualizer extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public ECSTVisualizer(ECSTree ecsTree) {
		JScrollPane scroll = new JScrollPane(renderTree(ecsTree));
		scroll.setSize(400, 720);
		add(scroll, BorderLayout.CENTER);
		setTitle(ecsTree.toString().substring(ecsTree.toString().lastIndexOf(File.separator) + 1));	
		setSize(450, 800);
		setResizable(true);
		setVisible(true);
		
	}
	
	private JTree renderTree(ECSTree ecsTree) {
		JTree jtree =  new JTree(ECSTTreeModelFactory.createModel(ecsTree));
		DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer)jtree.getCellRenderer(); 
		renderer.setOpenIcon(renderer.getDefaultLeafIcon());
		renderer.setClosedIcon(renderer.getDefaultLeafIcon());
		
		for (int i = 0; i < jtree.getRowCount(); i++) {
			jtree.expandRow(i);
		}
				
		return jtree;
	}

}
