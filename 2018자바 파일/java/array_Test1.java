import java.util.*;

class array_Test1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

//1. 정수 5개를 입력 받아서 짝수, 홀수별 합계 출력.
//실행 예)   숫자 5개? 1 2 3 4 5           짝수의 합 = 6, 홀수의 합 = 9
/*		
		int hol = 0; int jjak=0;
		int ar[];
		ar = new int[5];
			System.out.print("숫자 5개 ? ");
		for(int a = 0;a<ar.length;a++){
			int n = sc.nextInt();
			ar[a] = n;
			if(ar[a]%2 ==0)
				jjak += ar[a];
			else
				hol+=ar[a];
		}
		System.out.println("짝수의 합 = "+jjak+ " 홀수의 합 = "+hol);
		*/
//2. 1부터 100까지의 정수 중에서 4의 배수만 출력하되, 한 줄에 8개씩만 출력.
		int ar[][]=new int[5][8];
		for(int a = 1;a<=100;a++){
				if(a%4 ==0)
					ar[0][a-1] = a; 
				System.out.print();
			}
		}

//3. 100~999 사이에 7의 배수의 갯수와 합을 구하세요.
	/*	int ar[][];
		ar = new int[1][2];
		for(int a = 100;a<=999;a++){
			if(a%7==0){
				ar[0][0]+=a;
				ar[0][1] ++;}}
				System.out.println("7의 갯수 = "+ar[0][1]+"\n 7의 합 = "+ar[0][0]);
*/
//4.100~999 사이에 4의 배수가 아닌수들의 갯수와 합을 구하세요.
/*				int ar[][];
		ar = new int[1][2];
		for(int a = 100;a<=999;a++){
			if(a%4!=0){
				ar[0][0]+=a;
				ar[0][1] ++;}}
				System.out.println("4의 배수가 아닌 수들의 갯수 = "+ar[0][1]+"\n4의 배수가 아닌 수들의 합 = "+ar[0][0]);
*/

//5.1부터 30까지 짝수와 홀수의 합을 각각 구하세요.
/*			int ar[][];
		ar = new int[1][2];
		for(int a = 1;a<=30;a++){
			if(a%2==0)
				ar[0][0]+=a;
			else
				ar[0][1] +=a;
				}
				System.out.println("홀수의 합 = "+ar[0][1]+"\n짝수의 합 = "+ar[0][0]);
*/
//6. 10 이하의 자연수 n을 입력받아 "Daniel"을 n번 출력하는 프로그램을 작성하시오.
		System.out.print("10 이하의 자연수 n 을 입력 :");
			int n = sc.nextInt();
			int ar[][] = new int[n][1];
			for(int a = 0;a<ar.length;a++){
				System.out.println("Daniel");
			}
	}
}