//3. 사용자의 입력을 5개 받아서 최대값 출력
import java.util.*;

class array_Test6 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int max=0;
		int min=1000000000;
		for (int i = 0;i<=a.length-1 ;i++ )
		{
			int n=sc.nextInt();
			a[i] = n;
				if(max<a[i]){
					max=a[i];}
					if(min>a[i]){
					min = a[i];}
		}
				System.out.println("최대값 : " + max + ", 최솟값 : " + min);
	}
}