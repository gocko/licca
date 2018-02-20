package mainFrame.menu;

import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import pubSub.Message;
import pubSub.MessageBroker;
import pubSub.Subscriber;
import datastructures.result.Result;
import datastructures.result.Results;

public class ResultMenu extends JMenuBar implements Subscriber{
	
	private static final long serialVersionUID = -8254351213357677699L;

	public ResultMenu() {
		MessageBroker.instance().register(this);
		add(buildMenu(null));
	}

	@Override
	public Class<?>[] messageTypes() {
		return new Class<?>[]{Results.class};
	}
	
	@Override
	public void onMessageReceived(Message message) {
		removeAll();
		add(buildMenu(((Results)message.getData()).getResults()));
		revalidate();
		repaint();
	}
	
	private JMenu buildMenu(List<Result> model) {
		JMenu menu = new JMenu("Visualize");
		menu.setMnemonic(KeyEvent.VK_V);
		if (model != null && !model.isEmpty()) {
			menu.setEnabled(true);
			addMenuItems(menu, model);
			menu.getItem(0).doClick();
		} else {
			menu.setEnabled(false);
		}
		return menu;
	}

	private void addMenuItems(JMenu menu, List<Result> results) {
		ButtonGroup group = new ButtonGroup();
		for (Result result : results) {
			ResultMenuItem menuItem = new ResultMenuItem(result);
			group.add(menuItem);
			menu.add(menuItem);
		}
	}

}
