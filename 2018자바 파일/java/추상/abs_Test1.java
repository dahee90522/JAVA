abstract class Person30{
	String name;
	int age;
	public void go(){
		System.out.println("����");
	}

	abstract public void walk();
	abstract public int count(int num);//�ο���
}
abstract class Child extends Person30{
	public void walk(){
		System.out.println("�ȴ�");
	}
}
class Child2 extends Child{
	public int count(int num){
		System.out.println("�ο��� : "+num);
		return num;
	}
}
class abs_Test1{
	public static void main(String ar[]){
		Child2 c = new Child2();
		c.go();
		c.walk();
		c.count(3);
	}
}