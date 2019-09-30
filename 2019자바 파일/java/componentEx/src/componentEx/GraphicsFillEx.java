package componentEx;
import javax.swing.*;
import java.awt.*;

public class GraphicsFillEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsFillEx() {
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(100, 900);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10,10,50,50);
			g.setColor(Color.BLUE);
			g.fillOval(10,70,50,50);
			g.setColor(Color.GREEN);
			g.fillRoundRect(10,130,50,50,20,20);
			g.setColor(Color.GREEN);
			g.fillArc(10,190,50,50,0,360);
			g.setColor(Color.BLUE);
			g.fillArc(10,190,50,50,0,240);
			g.setColor(Color.RED);
			g.fillArc(10,190,50,50,0,120);
			g.setColor(Color.magenta);
			g.fillArc(10,250,50,50,0,360);
			g.setColor(Color.yellow);
			g.fillArc(10,250,50,50,0,300);
			g.setColor(Color.green);
			g.fillArc(10,250,50,50,0,240);
			g.setColor(Color.gray);
			g.fillArc(10,250,50,50,0,180);
			g.setColor(Color.orange);
			g.fillArc(10,250,50,50,0,120);
			g.setColor(Color.pink);
			g.fillArc(10,250,50,50,0,60); 
			g.setColor(Color.ORANGE);
			int [] x ={30,10,30,60};
			int [] y ={310,335,360,335};
			g.fillPolygon(x, y, 4); 
		}
	}	
	public static void main(String [] args) {
		new GraphicsFillEx();
	}
}