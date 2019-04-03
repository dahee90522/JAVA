import java.util.*;

class two_dan_Test {
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);

        System.out.println("n 단을 입력하시오 : ");
		int n = sc.nextInt();
		for ( int d = 1 ; d <=9  ; d++ )
		{
         System.out.println(n+"*"+d+"=" + n*d);
		}
	}
}