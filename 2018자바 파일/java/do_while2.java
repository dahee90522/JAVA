import java.util.*;

class do_while2 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int m = 1;
		do{
			if (m % 3 == 0 && m % 5 == 0)
			{
				System.out.println(m);
			}
			m++;
		} while (m <= i);
	}
}