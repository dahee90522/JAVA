import java.util.*;
abstract class Vehicle{
	String name;
	int price;

	public abstract String start(String name, int x);
	public abstract String stop(String x, int y);
	public abstract String take(String name, int price);
}
class bus extends Vehicle{
	int y;
	public String start(String name, int x){
		return name+"님~ "+x+"시에 타셨습니당~!";
	}
	public String stop(String x,int y){
		return x+"에서 "+y+"분 뒤에 멈추겠습니당~!";
	}
	public String take(String name, int price){
		//int price
		price = 100*price;
		return name+"님의 요금은 "+price+"원 입니당~!\n";
	}
}
class train extends Vehicle{
	public String start(String name, int x){
		return name+"님~"+x+"시에 타셨습니당~!";
	}
	public String stop(String x, int y){
		return x+"역에서 "+y+"분 뒤에  멈추겠습니당~!";
	}
	public String take(String name, int price){
		//int price
		price = 200*price;
		return name+"님의 요금은 "+price+"원 입니당~!\n";
	}
	
}
class Vehicle_Test{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		//start, stop, take, infor
		bus p1 = new bus();
		train p2 = new train();
		int x;String y;int m;String n;
		String bt;
		System.out.println("버스탈지 지하철탈지 입력(그 외 끝남)");
		bt = sc.next();
		if(bt.equals("버스")){
		System.out.println("-----------------------------------------------------------------");
		System.out.println("지금부터 추가요금이 붙기 시작합니다~~\n1분당 100원입니당~~!");
		System.out.println("-----------------------------------------------------------------\n\n");
		
		System.out.println("이름 입력");
		n=sc.next();
		System.out.println("버스를 탄 시간 입력");
		x = sc.nextInt();
	
		System.out.println("멈추는 위치와 몇분뒤 멈추는지 입력");
		y = sc.next(); m = sc.nextInt();
		System.out.println("\n");
		System.out.println("-----------------------------------------------------------------\n");
		System.out.println(p1.start(n, x));
		System.out.println(p1.stop(y , m));
		System.out.println(p1.take(n, m));
		
		System.out.println("-----------------------------------------------------------------\n");
		}
		else if(bt.equals("지하철")){
		System.out.println("-----------------------------------------------------------------");
		System.out.println("지금부터 추가요금이 붙기 시작합니다~~\n1분당 200원입니당~~!");
		System.out.println("-----------------------------------------------------------------\n\n");
		
		System.out.println("이름 입력");
		n=sc.next();
		System.out.println("지하철을 탄 시간 입력");
		x = sc.nextInt();
	
		System.out.println("멈추는 위치와 몇분뒤 멈추는지 입력");
		y = sc.next(); m = sc.nextInt();
		System.out.println("\n");
		System.out.println("-----------------------------------------------------------------\n");
		System.out.println(p2.start(n, x));
		System.out.println(p2.stop(y , m));
		System.out.println(p2.take(n, m));
		
		System.out.println("-----------------------------------------------------------------\n");
		}
	}
}