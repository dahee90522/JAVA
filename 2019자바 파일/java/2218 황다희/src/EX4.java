import java.util.Scanner;
public class EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//17
		System.out.println(Math.abs(25));
		System.out.println(Math.abs(-25));
		System.out.println(Math.abs(25.5));
		System.out.println(Math.abs(-25.5));
		//18
		System.out.println(Math.round(25));
		System.out.println(Math.round(25.3));
		System.out.println(Math.round(25.5));
		System.out.println(Math.round(-25.4));
		System.out.println(Math.round(-25.5));
		System.out.println(Math.round(-25.6));
		//19
		System.out.println(Math.pow(3,  2));
		System.out.println(Math.pow(3.0f,  2.0f));
		System.out.println(Math.pow(5.0,  2));
		System.out.println(Math.pow(-5.0,  3.0));
		//20
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(9.0f));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.sqrt(-9.0));
		//21
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println((int)Math.random()*5);
		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*10));
		System.out.println((int)(Math.random()*100));
		
		
	}

}
