package componentEx;

import javax.swing.*;
import java.awt.*;

public class lion extends JFrame {
	private MyPanel panel = new MyPanel();
	public lion() {
		setTitle("그래픽으로 라이언 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(1000, 1000);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Color yellowcolor = new Color(0xD79624);
			Color littlewhite = new Color(248, 248, 248);
			//왼쪽 귀
			g.setColor(Color.black);
			g.fillOval(253,238,154,154);
			g.setColor(yellowcolor);
			g.fillOval(260,245,140,140);
			//오른쪽 귀
			g.setColor(Color.black);
			g.fillOval(583,238,154,154);
			g.setColor(yellowcolor);
			g.fillOval(590,245,140,140);
			//얼굴
			g.setColor(Color.black);
			g.fillOval(243,243,514,514);
			g.setColor(yellowcolor);
			g.fillOval(250,250,500,500);
			//코
			g.setColor(Color.black);
			g.fillOval(429,527,80,80);
			g.setColor(Color.black);
			g.fillOval(492,527,80,80);
			g.setColor(littlewhite);
			g.fillOval(433,532,70,70);
			g.setColor(littlewhite);
			g.fillOval(497,532,70,70);
			g.setColor(Color.black);
			g.fillOval(475,517,50,50);
			//눈
			g.setColor(Color.black);
			g.fillRoundRect(320,430,130,10,5,5);
			g.fillRoundRect(550,430,130,10,5,5);
			g.fillOval(385,455,30,30);
			g.fillOval(585,455,30,30);
		}
	}	
	public static void main(String [] args) {
		new lion();
	}
}