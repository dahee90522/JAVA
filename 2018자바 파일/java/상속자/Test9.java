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
	//������ 3�� ����� this()�� ȣ��
	public static void main(String ar[]){
		Test9 t = new Test9(3, 5);
		 System.out.println("this() ȣ��"+t.b+t.a);
	}
}