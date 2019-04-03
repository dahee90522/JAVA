class car1{
	private String brand, owner, company;
	private int price;
	public car1(String brand, String owner, String company, int price){
		this.brand = brand;
		this.owner=owner;
		this.company = company;
		this.price = price;
	}
	public car1(String owner, String company, int price){
		this.owner=owner;
		this.company = company;
		this.price = price;
	}
	public car1(String owner, int price){
		this.owner=owner;
		this.price = price;
	}
	public String start(String time){
		return time;
	}
	public String stop(String time){
		return time;
	}
	public static void main(String ar[]){
		car1 c1 = new car1("Sonata", "Mike", "hyundae", 210);
		car1 c2 = new car1("Alice", "kia", 300);
		car1 c3 = new car1("Tom", 350);
		car1 c4 = new car1("Benz", "tomas", "mk", 500);
		//c3의 멤버변수들 출력
		System.out.println("제 이름은 "+ c3.owner+"이고 "+c3.price+"만원 짜리 차를 타고 다닙니다.");
		//c4의 메서드 호출
		System.out.println("제 이름은 "+c4.owner+"입니다. \n|→주로 "+c4.start("8:00")+"부터 "+c4.stop("21:00")+"까지 타고 다닙니다");

	}
}