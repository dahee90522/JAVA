import java.util.*;

class do_while4 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("이름과 나이 입력 : ");
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("나이 >> ");
		int age = sc.nextInt();

		int a = 1;
			do{
			System.out.println("이름 - " + name + " " + "나이 - " + age + "살");
			a++;
		}while(a<=5);

	}
}