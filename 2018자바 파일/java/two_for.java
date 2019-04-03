import java.util.*;

class two_for {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);

System.out.print("정수를 입력하시오 : ");
		int n = sc.nextInt();
		for (int i = n;i >=1 ;i-- )
		{
			for (int j = n;j >= i ;j-- )
			{
			     System.out.print(j);
			}
			System.out.println("");
		}
	}
}