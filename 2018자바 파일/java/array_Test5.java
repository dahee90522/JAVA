//2. 키보드로 부터 10개의 정수를 입력받아 배열에 저장하고 이중에서 3의 배수인 수만 골라 출력

import java.util.*;

class array_Test5 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int a;
		int three;
		int b[]=new int[10];
		for (int i=0 ; i<b.length ; i++)
		{
			System.out.println("변수 입력 : ");
			a = sc.nextInt();
			b[i]=a;
			if(b[i]%3==0){
			three = b[i];
			System.out.println(three);
			}

		}
			
	}
}