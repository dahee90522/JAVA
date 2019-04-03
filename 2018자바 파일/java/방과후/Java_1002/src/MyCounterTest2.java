
public class MyCounterTest2 {

	public static void main(String[] args) {
		MyCounter1 obj= new MyCounter1();
		System.out.println("obj.value = "+obj.value);
		obj.inc(obj);
		System.out.println("obj.value = "+obj.value);
	}

}
