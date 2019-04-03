class Box {
	//가로(weight), 세로(length), 높이(height)를 멤버변수로 갖는 클래스
	int width, length, height;
	
}


public class BoxTest {
	public static void main(String ar[]) {
		Box b = new Box();
		b.width = 20;
		b.length = 20;
		b.height = 20;
		System.out.println("가로길이 : "+b.width+ ", 세로길이 : " +b.length+", 높이 : "+b.height);
	}
}
