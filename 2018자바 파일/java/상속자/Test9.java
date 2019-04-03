class Test9
{
	int a;
	int b;
	Test9(int a, int b){
		this(a);
		this.b = 10;
	}
	Test9 (int an){
		this.a = an;
	}
	Test9(){
		this.b = 10;
	}
	//생성자 3개 만들어 this()로 호출
	public static void main(String ar[]){
		Test9 t = new Test9(3, 5);
		 System.out.println("this() 호출"+t.b+t.a);
	}
}