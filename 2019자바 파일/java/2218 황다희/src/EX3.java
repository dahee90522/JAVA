
public class EX3 {
	public static void main(String[] args) {
		//13
		/*Integer in1 = new Integer(100);
		Integer in2 = new Integer(100);
		Integer in3 = new Integer(200);
		System.out.println("in1.equals(in2)-->"+(in1.equals(in2)));
		System.out.println("in1.equals(in3)-->"+(in1.equals(in3)));*/
		//14
		/*Integer wrapi = new Integer(100);
		Double wrapd = new Double(55.7);
		int i = 100;
		double d = 55.7;
		double dl;
		dl = d+i;
		System.out.println(i+d);
		System.out.println(Integer.toString(i)+Double.toString(d));
		System.out.println(wrapi.toString()+wrapd.toString);*/
		//15
		/*String stri = "123456";
		String strd = "123.56";
		System.out.println(Integer.valueOf(stri));
		System.out.println(Double.valueOf(strd));
		System.out.println(Integer.valueOf(stri)+Double.valueOf(strd));*/
		//16
		String a = "10", b = "20";
		int sum = 0;
		float average = 0;
		System.out.println("input data : "+a+" "+b);
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		sum = c+d;
		average = sum/2;
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println("평균 = "+average);
		
	}
}
