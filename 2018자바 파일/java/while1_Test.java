//정수를 입력받아 짝수의 합과 홀수의 합
import java.util.*;

class while1_Test {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 n 입력 : ");
		int n = sc.nextInt();
		int i = 0;
		int sum1 = 0;
		int sum2 = 0;

		while(i<=n){
			if(i%2==0){
				sum1 = sum1 + i;
			}
			else{
				sum2 = sum2 + i;
			}
			i++;
		}
		System.out.println("1부터 n까지 짝수의 합 : " + sum1);
		System.out.println("1부터 n까지 홀수의 합 : " + sum2);
	}
}

