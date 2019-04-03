class A{
	public A(){
		System.out.println("持失切 A");
	}
}
class B extends A{
	public B() {
		System.out.println("持失切 B");
	}
}
class C extends B{
	public C(){
		System.out.println("持失切 C");
	}
}
public class ConEx1 {
	public static void main(String[] args) {
		C c = new C();
		
	}
}
