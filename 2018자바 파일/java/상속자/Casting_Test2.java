class Shape{
	public void draw(){
		System.out.println("�����׸���");
	}
	public void painting(){
		System.out.println("��ĥ�ϱ�\n");
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("���׸���");
	}
	public void painting(){
		System.out.println("��ĥ�ϱ�\n");
	}
}
class Casting_Test2{
	public static void main(String ar[]){
		Shape s = new Shape();
		s.draw();//�����׸���
		s.painting();//��ĥ�ϱ�

		Circle c = new Circle();
		c.draw();//���׸���   
		c.painting();//��ĥ�ϱ�

		Shape s2 = c;
		s2.draw();//���׸���, ��ĳ����
		s2.painting();//��ĥ�ϱ�
	}
}