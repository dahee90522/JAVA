
public class TelevisionTest {
	public static void main(String ar[]) {
		Television1 tv = new Television1();
		tv.channel = 7;
		tv.volume=6;
		tv.onoff = true;
		tv.print();
		int ch = tv.getChannel();
		System.out.println("현재 채널을 "+ch+"입니다");
	}
}
