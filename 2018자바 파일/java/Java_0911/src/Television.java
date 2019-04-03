
public class Television {
	int channel;
	int volume;
	boolean onoff;
	void print() {
		System.out.println("채널을 "+channel+" 이고, 볼륨은 "+volume+" 입니다."+onoff);
	}
	
	public static void main(String ar[]) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volume=6;
		tv.onoff = true;
		
		tv.print();
		
		Television yourTV = new Television();
		yourTV.channel = 9;
		yourTV.volume = 12;
		yourTV.onoff=true;
		tv.print();
		
		Television tv1=new Television();
		Television tv2 = tv1;
		
		int x = 10, y = 20;
		y=x;
	}
}
