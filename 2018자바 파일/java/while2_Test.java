import java.util.*;

class while2_Test {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int n2 = sc.nextInt();
		 int i = 0;

		 while (n<=n2)
		 {
			 if(n%5==0) {
				 i++; }
				 n++;
		 }
		 System.out.println("5의 배수의 개수 : " +i);
	}
}