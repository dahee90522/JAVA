class Box {
	//����(weight), ����(length), ����(height)�� ��������� ���� Ŭ����
	int width, length, height;
	
}


public class BoxTest {
	public static void main(String ar[]) {
		Box b = new Box();
		b.width = 20;
		b.length = 20;
		b.height = 20;
		System.out.println("���α��� : "+b.width+ ", ���α��� : " +b.length+", ���� : "+b.height);
	}
}
