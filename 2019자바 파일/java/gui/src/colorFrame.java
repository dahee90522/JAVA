import javax.swing.*;
import java.awt.*;
public class colorFrame extends JFrame{
	colorFrame(){
		setTitle("ContentPane과 JFrame 예제");//프ㄹ임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();//컨텐트팬 알아내기
		c.setBackground(Color.gray);//회색 배경설정
		c.setLayout(new FlowLayout());//컨텐트팬에 FlowLayout
		
		c.add(new JButton("OK"));//버튼 달기
		c.add(new JButton("Cancel"));//버튼 달기
		c.add(new JButton("Ignore"));//버튼 달기
		
		setSize(500, 300);//프레임 크기 300X150 설정
		setVisible(true);//화면에 프레임 출력
	}
	public static void main(String[] args) {
		new colorFrame();
	}

}
