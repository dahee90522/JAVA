import java.util.*;
class Product{
	private String name;
	private int count, price;
	Product(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void setCount(int count){
		this.count = count;
	}
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price*count;
	}
	/*public int getCount(){
		return count;
	}*/
	public String pr(){
		return "이름 : "+getName()+", 가격 : "+getPrice();
	}
}
class DiscountProduct extends Product{
	private String name;
	private int count, price, discount;
	DiscountProduct(String name, int price, int count, int discount){
		super(name, price, count);
		this.discount = discount;
	}
	public void setDiscount(int discount){
		this.discount = discount;
	}
	public int getDiscount(){
		return getPrice()*discount/100;
	}
	public String pr(){
		return "이름 : "+getName()+", 가격 : "+getDiscount();
	}
}
class j1220{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		String name;
		int count, price, discount;
		System.out.print("입력 : "); 
		Product p = new Product(name = sc.next(), price = sc.nextInt(), count = sc.nextInt() );
		DiscountProduct dp = new DiscountProduct(name = sc.next(), price = sc.nextInt(), count = sc.nextInt(), discount = sc.nextInt() );
		System.out.println(p.pr());
		System.out.println(dp.pr());
	}
}