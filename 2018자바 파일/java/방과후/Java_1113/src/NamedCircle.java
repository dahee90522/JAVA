class Circle{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
}
class NamedCircle extends Circle{
	int radius; String cir;
	NamedCircle(int radius, String cir){
		super(radius);
		this.cir = cir;
	}
	public void show() {
		System.out.println(cir+", ������ = "+getRadius());
	}
	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}
}
