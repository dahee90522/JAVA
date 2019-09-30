package componentEx;

public class ThreadEx5 {

	static long startTime = 0;
	public static void main(String ar[]) {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		startTime = System.currentTimeMillis();
		for(int i = 0;i<300;i++){
			System.out.println("-");}
		System.out.println("소요시간1 : "+(System.currentTimeMillis()-ThreadEx5.startTime));

	}

}
class ThreadEx5_1 extends Thread{
	public void run() {
		for(int i = 0;i<300;i++) {System.out.println("-");}
		System.out.println("소요시간1 : "+(System.currentTimeMillis()-ThreadEx5.startTime));
		
	}
}
