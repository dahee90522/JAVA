import java.util.*;

class two_for {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);

System.out.print("������ �Է��Ͻÿ� : ");
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