package gui;
import javax.swing.*;
import java.awt.*;
public class GridLayoutEx2 extends JFrame{
	GridLayoutEx2(){
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4, 2);//4*2 격자의 GridLayout 배치관리자 생성
		grid.setVgap(5);
		//Container contentPane = getContentPane();
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JButton(" 이름 "));
		c.add(new JTextField(""));
		c.add(new JButton(" 학번 "));
		c.add(new JTextField(""));
		c.add(new JButton(" 학과 "));
		c.add(new JTextField(""));
		c.add(new JButton(" 과목 "));
		c.add(new JTextField(""));
		
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx2();
	}

}
