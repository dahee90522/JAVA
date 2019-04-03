abstract class Person30{
	String name;
	int age;
	public void go(){
		System.out.println("가다");
	}

	abstract public void walk();
	abstract public int count(int num);//인원수
}
abstract class Child extends Person30{
	public void walk(){
		System.out.println("걷다");
	}
}
class Child2 extends Child{
	public int count(int num){
		System.out.println("인원수 : "+num);
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