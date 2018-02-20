package matrixVisualizer;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import datastructures.result.ResultMatrix;

public class MatrixVisualizer extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public MatrixVisualizer(ResultMatrix matrix) {
		this(matrix, "Result matrix");
	}
	
	MatrixVisualizer(ResultMatrix matrix, String title) {
		ResultMatrixTableModel table = new ResultMatrixTableModel(matrix);
		JScrollPane scroll = new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		setTitle(title);	
		setSize(table.getPrefferedSize());
		setResizable(true);
		setVisible(true);
	}

}
