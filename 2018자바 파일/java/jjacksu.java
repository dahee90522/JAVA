import java.util.*;

class jjacksu {
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in); 

		System.out.print("���� n : ");
		int n = sc.nextInt();

		int d = 0;
		int t = 0;
	
		while (d <= n)	{
        if (d%2==0)  {
				t=t+d;
        }
			d++;
		}
		System.out.println(t);
	}
}
