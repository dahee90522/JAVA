class tv_test{
	public static void main(String ar[]){
		/*String brand;
	int inch;
	int price;
	int weight;*/
		tv t1 = new tv();
		t1.brand = "lg";
		t1.inch=50;
		t1.price=4000000;
		t1.weight = 6;
		System.out.println(t1.brand+" "+t1.inch+" "+t1.price+" "+t1.weight);
		t1.start();
		t1.off();
		t1.on();
	}
}