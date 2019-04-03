interface AdderInterface{
	public int add(int x, int y);
	public int add(int n);
}
public class myAdder implements AdderInterface{
	int x, y, t = 0;
	public int add(int x, int y) {
		return x+y;
	}
	public int add(int n) {
		for(int i = 1;i<=n;i++) {
			t+=i;
		}
		return t;
	}
	public static void main(String[] args) {
		myAdder adder = new myAdder();
		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
	}
}
