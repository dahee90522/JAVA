
public class EX1 {

	public static void main(String[] args) {
		//1
		String strData1 = "I LOVE MIRIM MEISTER";
		System.out.println("strData1.length() = "+strData1.length());
		//2
		String str = "I LOVE MIRIM MEISTER";
		for(int i = 0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		//3
		String R1 = new String("JAVA");
		String R2 = new String("JAVA");
		String R3 = new String("java");
		System.out.println("R1 == R2 -->" + (R1==R2));
		System.out.println("R1.equals(R2) --> "+(R1.contentEquals(R2)));
		System.out.println("R1 == R3 -->" + (R1==R3));
		System.out.println("R1.equals(R3) --> "+(R1.contentEquals(R3)));
		//4
		char ch = 'A';
		String strData11 = "A";
		String strData2;
		strData2 = String.valueOf(ch);
		if(strData11.contentEquals(strData2)) {
			System.out.println("같음");
		}
		else
			System.out.println("다름");
		//5
		String strData111 = "I LOVE MIRIM MEISTER";
		String strData22;
		strData22 = strData111.trim();
		System.out.println("strData2.trim() -> "+strData22);
		if(strData111.contentEquals(strData22))
			System.out.println("같음");
		else
			System.out.println("다름");
		//6
		String strData1111= "I LOVE MIRIM MEISTER";
		String strData3;
		strData3 = strData1.substring(7, 12);
		System.out.println("strData3.substring(7)->"+strData3);
		
		//7
		String strData11111= "I LOVE MIRIM MEISTER";
		String strData4;
		strData4 = strData11111.substring(2, 5);
		System.out.println("strData4.substring(7)->"+strData4);
		
	}

}
