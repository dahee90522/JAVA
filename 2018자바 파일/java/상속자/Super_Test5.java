class Greeting {
	String name = "Mike";
	public void sayHello(){
		System.out.println("�ȳ�");
	}
}
class EngHello extends Greeting{
	String name = "Moon";
	public void sayHello(){
		System.out.println("Nice To Meet You");
	}
	public void test(){
		System.out.println(super.name);//Mike
	 super.sayHello();//�ȳ�
	}
}
class Super_Test5{
	public static void main(String ar[]){
	EngHello e = new EngHello();
	e.test();//mike, �ȳ�
	e.sayHello();//Nice to meet you
	}
}