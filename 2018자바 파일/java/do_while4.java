import java.util.*;

class do_while4 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� ���� �Է� : ");
		System.out.print("�̸� >> ");
		String name = sc.next();
		System.out.print("���� >> ");
		int age = sc.nextInt();

		int a = 1;
			do{
			System.out.println("�̸� - " + name + " " + "���� - " + age + "��");
			a++;
		}while(a<=5);

	}
}