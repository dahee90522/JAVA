class Rectangle{
	int x = 0;
	int y = 0;
	int x1, y1, x2, y2;

	public Rectangle(){}
	public Rectangle(int x1, int y1, int x2, int y2){
		this.x = x2-x1;
		this.y = y2-y1;
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	public int square(){
		return x*y;
	}

	public void set(int x1, int y1, int x2, int y2){
		x = x2-x1;
		y = y2-y1;
		this.x1=x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2=y2;
		
	}
		public void show(){
		System.out.println("(x1, y1) = ("+x1+","+y1+") 이고 (x2, y2) = ("+x2+","+y2+") 이다.");
		System.out.println("사각형의 넓이는 -> "+square()+"\n");
	}
	
	boolean equals(Rectangle r){
		if(this==r)
			return true;
		else
			return false;
	}

	public static void main(String ar[]){
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1, 1, 2, 3);
		r.show();
		System.out.println("r의 넓이 = "+r.square()+"\n");
		s.show();
		System.out.println("s의 넓이 = "+s.square()+"\n");
		r.set(-2, 2, -1, 4);
		r.show();
		System.out.println("r의 넓이 = "+r.square()+"\n");

		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.\n");
		/*else
			System.out.println("두 사각형은 다릅니다.\n");*/
	}
}