import java.util.*;

class java_Test {
	public static void main(String p[]){ 
		Scanner sc = new Scanner(System.in);
		int t = 0;
		float avg = 0;
		int max=0;int min = 10000;
		String sub1[] = new String[5];
		int pyo[];
		pyo = new int[5];
		System.out.println("5개의 과목명을 입력하세요>>: ");
		for (int i = 0;i<sub1.length ;i++ )//과목명 입력
		{
			String sub = sc.next();
			sub1[i] = sub;
		}
		System.out.println("====================================");
		System.out.println("5개의 점수를 입력하세요>>: ");
		for (int j = 0;j<pyo.length ;j++ )//점수 입력
		{
			int score = sc.nextInt();
			pyo[j] = score;
			t = t + pyo[j];
		}
		for (int j = 0;j<pyo.length ;j++ ){
			for(int i = j;i<pyo.length;i++){//최고 최저 점수 비교
				if(max<=pyo[i]){
					max = pyo[i];
				}
				min = pyo[j];
				if(min >= pyo[i]){
					min = pyo[i];
						}
			}
		}
		System.out.println("====================================");
		avg =(float) t/5;	//평균
		System.out.println("과목 총점 >>"+t);
		System.out.println("과목 평균 >>"+avg);
		System.out.println("최고 점수 >>"+max);
		System.out.println("최저 점수 >>"+min);
		System.out.println("====================================");
			System.out.print("검색할 과목명을 입력하세요 : ");
		String sub = sc.next();
		if(sub.equals(sub1[0])){
			System.out.println(sub+"의 점수 : "+ pyo[0]);
			} 
			else if(sub.equals(sub1[1])){
			System.out.println(sub+"의 점수 : "+ pyo[1]);
			} 
			else if(sub.equals(sub1[2])){
			System.out.println(sub+"의 점수 : "+ pyo[2]);
			} 
			else if(sub.equals(sub1[3])){
			System.out.println(sub+"의 점수 : "+ pyo[3]);
			} 
			else if(sub.equals(sub1[4])){
			System.out.println(sub+"의 점수 : "+ pyo[4]);
			} 
		
	}
}