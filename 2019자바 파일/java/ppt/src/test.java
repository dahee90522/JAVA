import java.io.*;
import java.util.*;

public class test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		File src = new File("c:\\windows\\system.ini"); // 원본 파일 경로명
		File dest = new File("Phone.txt"); // 복사 파일 경로명
		String num;
		int c;
		try {
			//FileReader fr = new FileReader(src); // 파일 입력 문자 스트림 생성
			
			while(true) { // 문자 하나 읽고
				FileWriter fw = new FileWriter(dest); // 파일 출력 문자 스트림 생성
				//fw.write((char)c); // 문자 하나 쓰고
				System.out.print("name Phone >> ");
				num = sc.next();
				if(num.equals("그만"))
					break;
				fw.close();
			}
			//fr.close();
			
			System.out.println(dest.getPath()+ "에 저장되었습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}