package matrixVisualizer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import datastructures.result.ResultMatrix;
import datastructures.result.ResultMatrixElement;

class ResultMatrixTableModel extends JPanel {

	private static final long serialVersionUID = 1L;

	private static final int MAX_WIDTH = 200;
	private static final int MAX_HEIGHT = 300;
	private static final int CELL_WIDTH = 40;
	private static final int CELL_HEIGHT = 25;

	private ResultMatrix model;

	ResultMatrixTableModel(ResultMatrix model) {
		super(new GridBagLayout());
		this.model = model;
		createZeroCell();
		createColumnHeaders();
		createRowHeaders();
		createMatrixElements();
	}

	private void createZeroCell() {
		add(createCell("", new Dimension(MAX_WIDTH, MAX_HEIGHT)),
				matrixPosition(0, 0));
	}

	Dimension getPrefferedSize() {
		int width = 2 * MAX_WIDTH + CELL_WIDTH * model.columnCount();
		int height = 2 * MAX_HEIGHT + CELL_HEIGHT * model.rowCount();
		return new Dimension(width, height);
	}

	private void createColumnHeaders() {
		for (int i = 0; i < model.columnCount(); i++) {
			add(createCell(createVerticalLabel(model.columnHeader(i)),
					new Dimension(CELL_WIDTH, MAX_HEIGHT)),
					matrixPosition(i + 1, 0));
		}
	}

	private void createRowHeaders() {
		for (int i = 0; i < model.rowCount(); i++) {
			add(createCell(model.rowHeader(i), new Dimension(MAX_WIDTH,
					CELL_HEIGHT)), matrixPosition(0, i + 1));
		}
	}

	private void createMatrixElements() {
		for (int i = 0; i < model.rowCount(); i++) {
			for (int j = 0; j < model.columnCount(); j++) {
				add(createCell(model.itemAt(i, j), new Dimension(CELL_WIDTH,
						CELL_HEIGHT)), matrixPosition(j + 1, i + 1));
			}
		}
	}

	private JLabel createCell(String content, Dimension d) {
		JLabel cell = new JLabel(content, JLabel.CENTER);
		cell.setPreferredSize(d);
		cell.setBorder(BorderFactory.createLineBorder(Color.black));
		return cell;
	}

	private GridBagConstraints matrixPosition(int x, int y) {
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = x;
		c.gridy = y;
		return c;
	}

	private JComponent createCell(ResultMatrixElement content, Dimension d) {
		JPanel panel = new JPanel(new BorderLayout());
		createBorder(panel, content);
		panel.add(new JLabel(trunkOnTwoDecimals(content.getValue()),
				JLabel.CENTER));
		panel.setPreferredSize(d);
		panel.addMouseListener(createMouseListenerIfExistsSubMatrix(content));
		return panel;
	}

	private void createBorder(JPanel panel, ResultMatrixElement content) {
		if (content.isMarkedAsClone()) {
			panel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
		} else {
			panel.setBorder(BorderFactory.createLineBorder(Color.black));
		}
	}

	private String trunkOnTwoDecimals(double value) {
		double trunked = (int) (value * 100) / 100.0;
		return String.valueOf(trunked);
	}

	private MouseListener createMouseListenerIfExistsSubMatrix(
			ResultMatrixElement matrixElement) {
		if (!matrixElement.hasSubMatrix()) {
			return null;
		}
		return createMouseListener(matrixElement);
	}

	private MouseAdapter createMouseListener(
			final ResultMatrixElement matrixElement) {
		return new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new MatrixVisualizer(matrixElement.getSubMatrix());
				} catch (NoSuchFieldException ex) {
					ex.printStackTrace();
				}
			}
		};
	}

	private String createVerticalLabel(String label) {
		String[] letters = label.split("");
		StringBuilder sb = new StringBuilder("<html>");
		for (String letter : letters) {
			sb.append(letter + "<br>");
		}
		sb.append("</html>");
		return sb.toString();
	}
}
