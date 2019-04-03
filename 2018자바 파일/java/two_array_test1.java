import java.util.*;

class two_array_test1 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int a[ ][ ];
		a = new int [2][3];
		for (int i=0; i<a.length ; i++ )
		{
			for (int c=0; c<a[i].length ; c++ )
			{
				int b=sc.nextInt();
				a[i][c]=b;
			}				
		}
					System.out.println(a[i][c]);
	}
}