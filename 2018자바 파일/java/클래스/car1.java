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
		//c3�� ��������� ���
		System.out.println("�� �̸��� "+ c3.owner+"�̰� "+c3.price+"���� ¥�� ���� Ÿ�� �ٴմϴ�.");
		//c4�� �޼��� ȣ��
		System.out.println("�� �̸��� "+c4.owner+"�Դϴ�. \n|���ַ� "+c4.start("8:00")+"���� "+c4.stop("21:00")+"���� Ÿ�� �ٴմϴ�");

	}
}