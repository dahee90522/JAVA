class Person2{
		private String name;
		private int age;
	public Person2(String name, int age){
		this. name = name;
		this. age = age;
		
	}
	public Person2(int age){
		this. age = age;
	}
	public Person2(String name){
		this. name = name;
	}
	public Person2(){};
	public String eat(String food){
		return food;
	}

	public static void main(String ar[]){
		Person2 p1 = new Person2("Mike", 20);
		Person2 p2 = new Person2("Alice", 25);
		Person2 p3 = new Person2(32);
		Person2 p4 = new Person2("Tom");
		Person2 p5 = new Person2();
		System.out.println(p3.age);
		System.out.println(p4.name+"이 "+p4.eat("과자")+"를 먹다");
	}
}