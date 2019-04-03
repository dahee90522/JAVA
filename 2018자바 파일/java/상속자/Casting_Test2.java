class Shape{
	public void draw(){
		System.out.println("도형그리기");
	}
	public void painting(){
		System.out.println("색칠하기\n");
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("원그리기");
	}
	public void painting(){
		System.out.println("색칠하기\n");
	}
}
class Casting_Test2{
	public static void main(String ar[]){
		Shape s = new Shape();
		s.draw();//도형그리기
		s.painting();//색칠하기

		Circle c = new Circle();
		c.draw();//원그리기   
		c.painting();//색칠하기

		Shape s2 = c;
		s2.draw();//원그리기, 업캐스팅
		s2.painting();//색칠하기
	}
}