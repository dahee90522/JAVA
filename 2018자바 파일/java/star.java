import java.util.*;

class star {
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);

        System.out.println("���� : ");
		int n = sc.nextInt();
		for (int i = 1 ; i <= n ; i++ )
		{
           for (int j = 1 ; j <= i ; j ++)
           {
			   System.out.print('*');
           }
		   System.out.println("");
		}
	}
}