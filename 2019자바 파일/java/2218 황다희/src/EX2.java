
public class EX2 {

	public static void main(String[] args) {
		//8
		/*String mirim = "mirim";
		String mirimex = "i";
		int c = 0;
		for(int  i = 0;i<mirim.length();i++) {
			if((mirim.charAt(i)).equals(mirimex)) {
				c++;
			}
		}
		System.out.println(c+"개");*/
		//9
		StringBuffer sb1 = new StringBuffer(" java programming");
		StringBuffer sb2 = new StringBuffer(" project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		str1 = sb1.append(" project");
		str2 = sb1.append(sb2);
		System.out.println("sb1 = "+sb1);
		System.out.println("sb2 = "+sb2);
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		System.out.println();
		//10
		StringBuffer sb11 = new StringBuffer("java programming");
		StringBuffer sb22 = null;
		sb2 = sb1.replace(0,  4,  "JAVA");
		System.out.println("sb2 = "+ sb22);
		//11
		StringBuffer sb111 = new StringBuffer("java programming");
		StringBuffer sb333 = null;
		sb333 = sb111.reverse();
		System.out.println("sb333 = "+sb333);
		//12
		StringBuffer sb1111 = new StringBuffer("java programming");
		String str = null;
		str = sb1111.toString();
		System.out.println("str.toUpperCase() = "+str.toUpperCase());
	}

}
