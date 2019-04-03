class Shape {
  int x; int y; double total;
  public void setArea(int x, int y){
	this.x = x;
	this.y = y;
  }
  public double getArea(){
	return total;
  }
 }
  class Circle extends Shape{
	  public void setArea(int x, int y){
		total = x*y*3.14;
	  }
	  public double getArea(){
		  return total;
	  }
  }
  class Rect extends Shape{
	    public void setArea(int x, int y){
		total = x*y/2;
	  }
	  public double getArea(){
		  return total;
	  }
  }
  class Diamond extends Shape{
	    public void setArea(int x, int y){
		total = x*y;
	  }
	  public double getArea(){
		  return total;
	  }
  }




