class car_Text{
	public static void main(String ar[]){
		/*String brand;
	int price;
	int age;
	int hight;
	int km;*/
		car c1 = new car();
		c1.brand="BMW M760Li xDrive";
		c1.age=9;
		c1.price=222100000;
		c1.hight=1.9;
		c1.weight = 2000;

		System.out.println(" "+c1.brand + " "+ c1.age+" "+c1.price+" "+c1.height+" "+c1.weight);
	c1.straight();
	c1.stop();
	c1.left();
	c1.right();
	c1.back();
	}
}