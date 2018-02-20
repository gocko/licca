package mainFrame.sourceCodePanel;

import java.io.File;

import javax.swing.JLabel;

public class FileNameLabel extends JLabel {

	private static final long serialVersionUID = 1835010475214609777L;

	void update(File file) {
		setText(file.getName());
	}

}
