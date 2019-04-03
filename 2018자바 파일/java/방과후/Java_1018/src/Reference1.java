class Circle{
	int redius;
	public Circle(int redius) {
		this.redius = redius;
	}
}
public class Reference1 {

	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		increase(pizza);
		
		System.out.println(pizza.redius);

	}
	static void increase(Circle m) {
		m.redius++;
	}
}
