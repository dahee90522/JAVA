import java.util.*;

class array_Test1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

//1. ���� 5���� �Է� �޾Ƽ� ¦��, Ȧ���� �հ� ���.
//���� ��)   ���� 5��? 1 2 3 4 5           ¦���� �� = 6, Ȧ���� �� = 9
/*		
		int hol = 0; int jjak=0;
		int ar[];
		ar = new int[5];
			System.out.print("���� 5�� ? ");
		for(int a = 0;a<ar.length;a++){
			int n = sc.nextInt();
			ar[a] = n;
			if(ar[a]%2 ==0)
				jjak += ar[a];
			else
				hol+=ar[a];
		}
		System.out.println("¦���� �� = "+jjak+ " Ȧ���� �� = "+hol);
		*/
//2. 1���� 100������ ���� �߿��� 4�� ����� ����ϵ�, �� �ٿ� 8������ ���.
		int ar[][]=new int[5][8];
		for(int a = 1;a<=100;a++){
				if(a%4 ==0)
					ar[0][a-1] = a; 
				System.out.print();
			}
		}

//3. 100~999 ���̿� 7�� ����� ������ ���� ���ϼ���.
	/*	int ar[][];
		ar = new int[1][2];
		for(int a = 100;a<=999;a++){
			if(a%7==0){
				ar[0][0]+=a;
				ar[0][1] ++;}}
				System.out.println("7�� ���� = "+ar[0][1]+"\n 7�� �� = "+ar[0][0]);
*/
//4.100~999 ���̿� 4�� ����� �ƴѼ����� ������ ���� ���ϼ���.
/*				int ar[][];
		ar = new int[1][2];
		for(int a = 100;a<=999;a++){
			if(a%4!=0){
				ar[0][0]+=a;
				ar[0][1] ++;}}
				System.out.println("4�� ����� �ƴ� ������ ���� = "+ar[0][1]+"\n4�� ����� �ƴ� ������ �� = "+ar[0][0]);
*/

//5.1���� 30���� ¦���� Ȧ���� ���� ���� ���ϼ���.
/*			int ar[][];
		ar = new int[1][2];
		for(int a = 1;a<=30;a++){
			if(a%2==0)
				ar[0][0]+=a;
			else
				ar[0][1] +=a;
				}
				System.out.println("Ȧ���� �� = "+ar[0][1]+"\n¦���� �� = "+ar[0][0]);
*/
//6. 10 ������ �ڿ��� n�� �Է¹޾� "Daniel"�� n�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.print("10 ������ �ڿ��� n �� �Է� :");
			int n = sc.nextInt();
			int ar[][] = new int[n][1];
			for(int a = 0;a<ar.length;a++){
				System.out.println("Daniel");
			}
	}
}