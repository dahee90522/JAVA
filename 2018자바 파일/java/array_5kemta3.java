///이름 학번 국어 영어 수학 총점 석차
//이름 =String name = sc.next[7]
import java.util.*;

class array_5kemta3 {
	public static void main(String p[]){ Scanner sc = new Scanner(System.in);
		int tot, a, y, b = 0; 
		float arg = 0;
	    String name1[] = new String[5];//이름
		int ar[][]=new int[5][5];//점수+총점
		String name2[] = new String[5];
		int num1[]= new int[5];//학번
		int num2[]= new int[5];//
		float g[] = new float[5];//평균
		float g1[] = new float[5];//
		int suk[][] = new int[5][5];

		for (a = 0;a<ar.length;a++){
			System.out.println("");
			System.out.println("사람 " + (a+1) +"번째");

			System.out.print("학번 : ");
			int num = sc.nextInt();
			num1[a] = num;

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
			g[a]= arg;
		}
		for (int i = 0;i<ar.length ;i++ ){
			for(int j = 0;j<5;j++){
				if(g[i]<g[j]){
					ar[i][4]++;}
			}}

		for(int i = 0;i<5;i++){	for(int j = 0;j<5;j++){	if(ar[i][4] <=ar[j][4]){	for(int x = 0;x<suk.length;x++){
						suk[i][x] = ar[j][x];
						g1[i] = g[j];	
						num2[i]=num1[j];
						name2[i] = name1[j];
					}}}}
		System.out.println("학번	이름	국어	영어	수학	총점	평균	     석차");
		System.out.println("==================================================================");
		for (a = 0, b = 4;a < suk.length;a++, b--){
			System.out.print (num2[b]+"	 "+name2[b]+" 	 ");//학번, 이름
     	for (y = 0; y < 4; y++){
				System.out.print (suk[a][y]+"	 ");//국영수총점
			}
			System.out.print (g1[a]+"		");//평균
			System.out.println (suk[a][4]+1);//이게 석차
					System.out.println("-----------------------------------------------------------------");
		}}}