
//이름 학번 국어 영어 수학 총점 석차
//이름 =String name = sc.next[7]
import java.util.*;

class array_5kemta {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tot = 0; 
		float arg = 0;
		int a = 0; 
		int y = 0; 
		int ar[][];
		float g[][];
		ar=new int[5][4];
		g = new float[5][1];
		for (a = 0;a<ar.length;a++){
			System.out.print("사람 " + (a+1) +"번째 국어 영어 수학 점수 입력 : \n");

			for (y = 0; y < 3 ; y++){
				int kem = sc.nextInt();
				ar[a][y] = kem;
				
			}	
		}
		for ( a = 0;a<ar.length;a++){
			tot = ar[a][0] + ar[a][1] + ar[a][2];
			arg = (float)tot / 3;
			ar[a][3] = tot;
			g[a][0] = arg;
		}
		System.out.println("국어	영어	수학	총점	평균");
		System.out.println("==============================================");
		for (a = 0;a < ar.length;a++){
			for (y = 0; y < ar[a].length ; y++){
				System.out.print (ar[a][y]+"	 ");
				
			}
			System.out.print (g[a][0]+"	 ");
		System.out.println("\n");
		}	
	}
}
