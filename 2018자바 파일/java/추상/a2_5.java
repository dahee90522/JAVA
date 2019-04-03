import java.util.*;
abstract class ShapeExam{
	public abstract double getArea();//둘레
	public abstract double getCirsum();//면적
}
class Shape extends ShapeExam{
	double a, b;
	public void setArea(int a){
		this.a = a;
	}
	public double getArea(){
		return a*a*3.14;
	}
	public void setCirsum(int b){
		this.b = b;
	}
	public double getCirsum(){
		return b*2*3.14;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ci =sc. nextInt();
		Shape s = new Shape();
		s.setArea(ci);
		System.out.println("원의 면적 : "+s.getArea());
		s.setCirsum(ci);
		System.out.println("원의 둘래 : "+s.getCirsum());
}
}