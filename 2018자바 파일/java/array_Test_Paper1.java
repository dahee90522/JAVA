import java.util.*;

class array_Test_Paper1 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
/*1.		int z, x = 0;
		int a = 0;
		System.out.print("세자리 변수의 값 입력(일십백) : ");
		int n = sc.nextInt();
		z = n/100;
		x = (n-z*100)/10;
		x = x* 10;
		z = z* 100;
		a = z+x+1;
		System.out.println("결과 : "+ a);
		*/
		System.out.print("화씨 온도 입력 : ");
		int tem = sc.nextInt();
		float sub = 0;
		sub = (float)(tem - 32) * 18 / 10;
		System.out.println(tem + "의 섭씨 온도 : "+sub);

	}
}
