class person1{
	String name;
	int age;

	public void eat(){
		System.out.println("먹다");
	}

	public void go(){
		System.out.println("가다");
	}
}
class person1_test
{
	public static void main(String ar[]){ //무조건 여기서부터 실행!!!!!!!!!!!!!
		person1 p1=new person1();
		p1.name="MIKE";
		p1.age=30;
		System.out.println(p1.name + "\n" + p1.age);
		p1.go();
		p1.eat();
		person1 p2=new person1();
		p2.name = "Tom";
		p2.age = 25;
		System.out.println("\n" + p2.name + "\n" + p2.age);
		p2.eat();
		p2.go();
	}
	}