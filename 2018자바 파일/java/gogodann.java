import java.util.*;

class gogodann {
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in); 

		System.out.print("���� n : ");
		int n = sc.nextInt();
		System.out.println(n + "���Դϴ�.");
		int d = 1;
	
		while (d <=9)
		{
         System.out.println(n+"*"+d+"=" + n*d);
		 d++;
		}
	}
}

