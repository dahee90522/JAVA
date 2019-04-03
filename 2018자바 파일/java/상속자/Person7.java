class Person7{
	String name;
	int age;
	int height;
	
	Person7(int x){
		this();
		//n에 톰만들기
		this.name = "Tom";
	}
	Person7(String n, int h){
		this(h);//키
		//name에 값 넣기
	}
	Person7(String name, int age, int height){
		this.name = name;
		//this.age = age;
		this.height = height;

		this(age);
	}
	//필요한 생성ㅇ자 만들기
	public static void main(String ar[]){
		Person7 p = new Person("Mike", 30, 180);
	}
}