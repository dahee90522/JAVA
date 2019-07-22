
import java.io.*;
import java.util.*;

public class testan {
	public static void main(String ar[]) {
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		try {
			fw = new FileWriter("Phhoone.txt");
			System.out.println("전화번호 입력프로그램입니다.");
			while(true) { // 문자 하나 읽고
				String line = sc.nextLine();
				if(line.equals("그만"))
					break;
				fw.write(line + "\r\n");
			}
			sc.close();
			fw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
