
    //ī�� ���߱� 4*4
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
		/*System.out.println("�ȳ��Ͻʴϱ�~~");
		System.out.println("������ �� �����Դϴ�~~");
		System.out.println("���� �ΰ��� (���� space bar ����) �Ǵ� (���� Enter ����)�� �Է��� �ּ���");
		System.out.println("��ȸ�� 10�� �Դϴ�");
		System.out.println("������ ���� �� �ٽ� �����ϰ� �ʹٸ� 0�� �ƴ� �ٸ� ���ڸ� �����ּ���");
		System.out.println("---------------------------------------------------------------------------");*/
        Scanner sc = new Scanner(System.in);
		 Random rand1 = new Random(); 
		 System.out.println("�ȳ��Ͻʴϱ�~~");
		System.out.println("������ �� �����Դϴ�~~");
		System.out.println("���� �ΰ��� (���� space bar ����) �Ǵ� (���� Enter ����)�� �Է��� �ּ���");
		System.out.println("��ȸ�� 10�� �Դϴ�");
		System.out.println("������ ���� �� �ٽ� �����ϰ� �ʹٸ� 0�� �ƴ� �ٸ� ���ڸ� �����ּ���");
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
			System.out.println("-------------------------------------------------\n");//���� Ȯ��*/
			String[] fruit = {"���", "��", "��", "������", "����", "�ٳ���", "�丶��", "���ξ���", "���", "��", "��", "������", "����", "�ٳ���", "�丶��", "���ξ���"};//����
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
			}//�� �����
			System.out.println("-------------------------------------------------\n");
			
			int qwer = 1;
			while(qwer<=10){
						int check[] = new int[2];
				System.out.print("���� 2�� �����ϱ� : ");
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
			System.out.println("�����մϴ�///\n���� : "+checkit+ " �� �Դϴ�!! \n�����÷��� 0+Enter�� �����ּ���");
			finish = sc.nextInt();
		}//�ݺ� while
	}
}
