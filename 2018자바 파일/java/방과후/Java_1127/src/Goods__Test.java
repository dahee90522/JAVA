import java.util.*;
class Goods{
	int price, nam, pal;
	
	public void coke(int price, int nam, int pal){
		System.out.print("콜라 : ");
		this.price = price;
		this.nam = nam;
		this.pal = pal;
	
	}
	public void cider(int price, int nam, int pal){
		System.out.print("사이다 : ");
		this.price = price;
		this.nam = nam;
		this.pal = pal;
	
	}
	public void beer(int price, int nam, int pal){
		System.out.print("맥주 : ");
		this.price = price;
		this.nam = nam;
		this.pal = pal;
	
	}
}
public class Goods__Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int p, n, p2;
		Goods imfo[] = new Goods[3];
		for(int i = 0;i<3;i++) {
			imfo[i] = new Goods();
		}
		imfo.coke(p=sc.nextInt(), n=sc.nextInt(), p2 = sc.nextInt());
	}
}
