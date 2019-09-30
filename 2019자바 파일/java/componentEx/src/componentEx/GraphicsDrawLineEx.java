package componentEx;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsDrawLineEx() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 500);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.GRAY); // 빨간색 선택
			g.drawLine(20, 20, 20, 200); // 선그리기
			g.setColor(Color.PINK); // 빨간색 선택
			g.drawLine(20, 200, 200, 200); // 선그리기
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawLineEx();
	}
}