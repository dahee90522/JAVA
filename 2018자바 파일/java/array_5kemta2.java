///이름 학번 국어 영어 수학 총점 석차
//이름 =String name = sc.next[7]
import java.util.*;

class array_5kemta2 {
	public static void main(String p[]){ Scanner sc = new Scanner(System.in);
		int tot, a, y = 0; 
		float arg = 0;
	    String name1[] = new String[5];//이름
		int ar[][]=new int[5][5];//점수+총점
		int num1[][] = new int[5][1];//학번
		float g[][] = new float[5][1];//평균
		

		for (a = 0;a<ar.length;a++){
			System.out.println("");
			System.out.println("사람 " + (a+1) +"번째");

			System.out.print("학번 : ");
			int num = sc.nextInt();
			num1[a][0] = num;

			System.out.print("이름 : "); 
			String name = sc.next();
			name1[a] = name;

			System.out.print("국어점수 입력 : ");
				int kor = sc.nextInt();
				ar[a][0] = kor;	
				
				System.out.print("영어점수 입력 : ");
				int eng= sc.nextInt();
				ar[a][1] = eng;
				
				System.out.print("수학점수 입력 : ");
				int mat= sc.nextInt();
				ar[a][2] = mat;		

			tot = ar[a][0] + ar[a][1] + ar[a][2];
			arg = (float)tot / 3;
			ar[a][3] = tot;
			g[a][0] = arg;
		}
		for (int i = 0;i<ar.length ;i++ ){
			for(int j = 0;j<5;j++){
				if(g[i][0]<g[j][0]){
					ar[i][4]++;}
			}}
		System.out.println("학번	이름					국어	영어	수학	총점	평균	     석차");
		System.out.println("==================================================================");
		for (a = 0;a < ar.length;a++){
			System.out.print (+num1[a][0]+"	 "+name1[a]+" 	 ");//학번, 이름
     	for (y = 0; y < 4; y++){
				System.out.print (ar[a][y]+"	 ");//국영수총점
			}
			System.out.print (g[a][0]+"		");//평균
			System.out.println (ar[a][4]+1);
					System.out.println("-----------------------------------------------------------------");
		}}}