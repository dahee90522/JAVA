class Person7{
	String name;
	int age;
	int height;
	
	Person7(int x){
		this();
		//n�� �踸���
		this.name = "Tom";
	}
	Person7(String n, int h){
		this(h);//Ű
		//name�� �� �ֱ�
	}
	Person7(String name, int age, int height){
		this.name = name;
		//this.age = age;
		this.height = height;

		this(age);
	}
	//�ʿ��� �������� �����
	public static void main(String ar[]){
		Person7 p = new Person("Mike", 30, 180);
	}
}