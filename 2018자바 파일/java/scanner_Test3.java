import java.util.*;

class scanner_Test3 {
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 n을 입력하시오 : ");
		int a=sc.nextInt();
		for (int b = 1; b<=a ; b++)
		{
			for (int c = 1; c<=b ; c++ )
			{
				System.out.print(c);
			}
			System.out.println("");
		}
	}
}