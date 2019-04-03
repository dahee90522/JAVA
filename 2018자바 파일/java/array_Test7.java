//숫자 5개를 넣어서 오름정렬
import java.util.*;

class array_Test7 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int max=0;
		for (int i = 0;i<=a.length-1 ;i++ )
		{
			int n=sc.nextInt();
			a[i] = n;
				if(max<a[i]){
					max=a[i];}
		}
				System.out.println("");
	}
}