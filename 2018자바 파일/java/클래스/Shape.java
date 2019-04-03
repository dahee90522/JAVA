class Shape {
  //width, height
	int width; int height;
//생성자 만들기
	public Shape(int width, int height){
		this.width = width;
		this.height = height;
	}
  //setWidth()
	public void setWidth(int width){
		System.out.println(width);
	}
  //setHeight()
  public void setHeight(int height){
		System.out.println(height);
	}
  //getArea() 만들기
  public int getArea(int x, int y){
	return x*y/2;
  }
  public double getArea(double x, double y){
	return x*y;
  }
  public static void main(String ar[]) {
   Shape s1=new Shape(3,5);
   Shape s2=new Shape(6,2);

   s1.setWidth( 9);
   s2.setHeight(10);

   System.out.println(s1.getArea(5,10)) ;
   System.out.println(s2.getArea(6.3,6.9));
   }
   }
    