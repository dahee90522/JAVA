import java.util.*;
class explain{
	public int explain1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("~~짝 맞추기 게임~~");
		System.out.println("안녕하십니까~~");
		System.out.println("간단한 룰 설명입니다~~");
		System.out.println("숫자 두개를 (숫자 space bar 숫자) 또는 (숫자 Enter 숫자)로 입력해 주세요~~");
		System.out.println("기회는 20번 입니다~~");
		System.out.println("게임이 끝난 후 다시 시작하고 싶다면 0이 아닌 다른 숫자를 눌러주세요~~");
		System.out.println("1. 과일 \t2. 동물 두가지 중 골라주세여(숫자 입력) >>  ");
		int choose = sc.nextInt();
		return choose;
	}
}
class im{
	public void cls() {
		for (int i = 0; i < 80; i++)
			System.out.println("");// cls
	}
	
}
class game1{
	
}
public class testpunc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		explain ex = new explain();
		ex.explain1();
		if()
	}
	
}
