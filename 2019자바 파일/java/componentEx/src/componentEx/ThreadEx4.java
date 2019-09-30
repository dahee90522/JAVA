package componentEx;

public class ThreadEx4 {
	public static void main(String ar[]) {
		long startTime = System.currentTimeMillis();
		for(int i = 0;i<300;i++){
			System.out.println("-");}
		System.out.println("소요시간1 : "+(System.currentTimeMillis()-startTime));
		for(int i = 0;i<300;i++) {
			System.out.println("|");
		}
		System.out.println("소요시간2 : "+(System.currentTimeMillis()-startTime));
	}
}
