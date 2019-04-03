class  A{
	public A(){//기본생성자 실행
		System.out.println("생성자A");
	}
	A(int x){
		System.out.println("매개변수 생성자 A");
	}
}
class B extends A{
	B(){
		System.out.println("생성자 B");
	}
	public B(int x){//x=5
	//super();
	//만약 5-6-7이 실행하고 싶다면 super(x); 넣기ㅠ 
		System.out.println("매개변수 생성자 B");
	}
}
class C{
	public static void main(String ar[]){
		B b = new B(5);
	}
}//17-18-19-9-1-2-3-4-13-15-16