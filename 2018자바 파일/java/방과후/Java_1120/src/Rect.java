class Rect1 {
	public int width, height;
	Rect1(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Rect1 p) {
		if(width*height==p.width*p.height) 
		return true;
		else return false;
	}
}

public class Rect {
	public static void main(String ar[]) {
		Rect1 a = new Rect1(2, 3);
		Rect1 b = new Rect1(3, 2);
		Rect1 c = new Rect1(3, 4);
		 if(a.equals(b))System.out.println("a is equals b");
		 if(a.equals(c))System.out.println("a is equals c");
		 if(b.equals(c))System.out.println("b is equals c");

	}
}






















