class  A{
	public A(){//�⺻������ ����
		System.out.println("������A");
	}
	A(int x){
		System.out.println("�Ű����� ������ A");
	}
}
class B extends A{
	B(){
		System.out.println("������ B");
	}
	public B(int x){//x=5
	//super();
	//���� 5-6-7�� �����ϰ� �ʹٸ� super(x); �ֱ�� 
		System.out.println("�Ű����� ������ B");
	}
}
class C{
	public static void main(String ar[]){
		B b = new B(5);
	}
}//17-18-19-9-1-2-3-4-13-15-16