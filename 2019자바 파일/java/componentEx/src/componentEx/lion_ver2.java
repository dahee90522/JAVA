package componentEx;

import javax.swing.*;
import java.awt.*;

public class lion_ver2 extends JFrame {
	private MyPanel panel = new MyPanel();
	public lion_ver2() {
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
			g.fillOval(273,238,144,144);
			g.setColor(yellowcolor);
			g.fillOval(284,249,122,122);
			//오른쪽 귀
			g.setColor(Color.black);
			g.fillOval(552,238,144,144);
			g.setColor(yellowcolor);
			g.fillOval(563,249,122,122);
			//얼굴
			g.setColor(Color.black);
			g.fillOval(220,237,514,514);
			g.setColor(yellowcolor);
			g.fillOval(232,250,490,490);
			//코
			g.setColor(Color.black);
			g.fillOval(331,449,82,82);
			g.setColor(Color.black);
			g.fillOval(389,449,82,82);
			g.setColor(littlewhite);
			g.fillOval(341,460,60,60);
			g.setColor(littlewhite);
			g.fillOval(400,460,60,60);
			g.setColor(Color.black);
			g.fillOval(377,443,45,45);
			//눈
			g.setColor(Color.black);
			g.fillRoundRect(265,350,90,20,20,20);
			g.fillRoundRect(478,350,115,20,20,20);
			g.fillOval(285,390,35,35);
			g.fillOval(512,390,35,35);
		}
	}	
	public static void main(String [] args) {
		new lion_ver2();
	}
}