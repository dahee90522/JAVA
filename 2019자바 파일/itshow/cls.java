
    //카드 맞추기 4*4
import java.util.*;
import java.util.Random;
import java.io.IOException;

public class cls {
    public static void main(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
class itshow{
    public static void main(String ar[]) {
		cls c = new cls();
		/*System.out.println("안녕하십니까~~");
		System.out.println("간단한 룰 설명입니다~~");
		System.out.println("숫자 두개를 (숫자 space bar 숫자) 또는 (숫자 Enter 숫자)로 입력해 주세요");
		System.out.println("기회는 10번 입니다");
		System.out.println("게임이 끝난 후 다시 시작하고 싶다면 0이 아닌 다른 숫자를 눌러주세요");
		System.out.println("---------------------------------------------------------------------------");*/
        Scanner sc = new Scanner(System.in);
		 Random rand1 = new Random(); 
		 System.out.println("안녕하십니까~~");
		System.out.println("간단한 룰 설명입니다~~");
		System.out.println("숫자 두개를 (숫자 space bar 숫자) 또는 (숫자 Enter 숫자)로 입력해 주세요");
		System.out.println("기회는 10번 입니다");
		System.out.println("게임이 끝난 후 다시 시작하고 싶다면 0이 아닌 다른 숫자를 눌러주세요");
		System.out.println("\n---------------------------------------------------------------------------\n");
		 float checkit = 0;
		 int finish = 1;
		while(finish!=0){
			int fruita[] = new int[16];//fruit table
			for(int i = 0;i<16;i++){
				fruita[i] = rand1.nextInt(16)+1;
				for(int q = 0;q<i;q++){
					if(fruita[i]==fruita[q]){
						i--;
					}
				}
			}
			/*int cntf = 0;
			for(int a = 0;a<4;a++){
				for(int b = 0;b<4;b++){
					System.out.print(fruita[cntf]+"\t");
					cntf++;
				}
				System.out.println("\n");
			}
			System.out.println("-------------------------------------------------\n");//랜덤 확인*/
			String[] fruit = {"사과", "배", "귤", "오렌지", "수박", "바나나", "토마토", "파인애플", "사과", "배", "귤", "오렌지", "수박", "바나나", "토마토", "파인애플"};//과일
			int fruitcheck[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

			/*String fruitpra[] = new String[17];
			int s = 0;
			for(int g = 0;g<16;g++){
				s = fruita[g];
				fruitpra[g]=fruit[s];
			}
			int p = 0;
			for(int a = 0;a<4;a++){
				for(int b = 0;b<4;b++){
					System.out.print(fruitpra[p]+"\t");
					p++;
				}
				System.out.println("\n");
			}*/
			int fruitcnt[] = new int[16];
			for(int i = 0;i<16;i++){
				fruitcnt[i]=i+1;
			}
			int cnt = 1;
			for(int a = 0;a<4;a++){
				for(int b = 0;b<4;b++){
					System.out.print(fruitcnt[cnt-1]+"\t");
					cnt++;
				}
				System.out.println("\n");
			}//판 만들기
			System.out.println("-------------------------------------------------\n");
			
			int qwer = 1;
			while(qwer<=10){
						int check[] = new int[2];
				System.out.print("숫자 2개 선택하기 : ");
				int g1 = sc.nextInt();
				int g2 = sc.nextInt();

				 for (int i = 0; i < 80; i++)
				 System.out.println("");
				c();
				int check1 = 0;
				cnt=1;
				for(int a = 0;a<4;a++){
					for(int b = 0;b<4;b++){
						if(fruitcnt[cnt-1]==g1||fruitcnt[cnt-1]==g2){
							System.out.print(fruit[cnt-1]+"  \t ");
							check[check1] = cnt-1;
							check1++;
						}
						else if(fruitcheck[cnt-1] != 0){
							System.out.print(fruit[cnt-1]+"  \t ");
						}
						else{
							System.out.print(fruitcnt[cnt-1]+"  \t ");
						}
						cnt++;
					}
					System.out.println("\n");
				}
				if(check[0]+8==check[1]){
					fruitcheck[check[0]] = 1;
					fruitcheck[check[1]] = 1;
					checkit+=12.5;
				}
				qwer++;
			}//while
			System.out.println("축하합니다///\n점수 : "+checkit+ " 점 입니다!! \n끝내시려면 0+Enter을 눌러주세요");
			finish = sc.nextInt();
		}//반복 while
	}
}
