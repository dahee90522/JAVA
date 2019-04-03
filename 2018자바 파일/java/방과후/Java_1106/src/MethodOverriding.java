class shape{
	public shape next;
	public shape() {
		next = null;
	}
	public void draw() {
		System.out.println("shape");
	}
}
class Line extends shape{
	public void draw() {
		System.out.println("Line");
	}
	
}
class Rect extends shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Rect());
		paint(new Circle());
		paint(new shape());
	
	
	public static void paint(shape p) {
		p.draw();
	}
	}
}
