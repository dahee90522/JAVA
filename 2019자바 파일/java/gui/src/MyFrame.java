import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("첫번째 프레임");

		setSize(500, 300); 

		setVisible(true); 
	}

	public static void main(String [] args) {
		MyFrame mf = new MyFrame();
	}
}