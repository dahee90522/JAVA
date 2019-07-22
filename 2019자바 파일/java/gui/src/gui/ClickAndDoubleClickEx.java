package gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ClickAndDoubleClickEx extends JFrame {
	public ClickAndDoubleClickEx() {
		setTitle("ClickAndDoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		setSize(500, 500);
		setVisible(true);
	}

	public class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				int r = (int) (Math.random() * 256); // red 성분
				int g = (int) (Math.random() * 256); // green 성분
				int b = (int) (Math.random() * 256); // blue 성분

				Component c = (Component) e.getSource();
				c.setBackground(new Color(r, g, b));
			}
		}
	}

	public static void main(String[] args) {
		new ClickAndDoubleClickEx();
	}
}
