import java.util.Scanner;

public class EX4_III_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//22
		int n = (int)(Math.random()*99);
		int d = 0;
		int c = 1;
		System.out.println(n);
		while(d==n||c<=5) {
			System.out.print("숫자입력(0~99) : ");
			d = sc.nextInt();
			if(d>n)
				System.out.println(">>>너무큽니다 ("+c+"회)");
			else if(d<n)
				System.out.println(">>>너무 작습니다 ("+c+"회)");
			else if(d==n) {
				System.out.println("*****축하합니다*****");
				//System.out.println("("+c+"회)");
				break;
			}
			c++;
			if(c==6)
				System.out.println("실패");
		}

	}

}
