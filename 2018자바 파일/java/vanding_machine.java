import java.util.*;

class vanding_machine {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------------------------------------------------------");
		System.out.println("1. 콜라(600) 2. 커피 (300) 3. 물(500) 4. 보리차(700)");
		System.out.println("-----------------------------------------------------------------");
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.print("음료를 선택하세요 : ");
		String drink = sc.next();
		System.out.println("-----------------------------------------------------------------");
	}
}