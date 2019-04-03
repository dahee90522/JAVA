class param_Test1{
	public static void main(String ar[]){
	    //System.out.println(ar[0]);
		//System.out.println(ar[1]);
		//System.out.println(ar[2]);
		//문자열을 숫자로 변환
		//Int 변수 = Integer.parseInt(변환할 값);
		int a = Integer.parseInt(ar[0]);
		int b = Integer.parseInt(ar[1]);
		int c = Integer.parseInt(ar[2]);

		System.out.println(ar.length);
		System.out.println(ar[0]+ar[1]+ar[2]);
		System.out.println(a+b+c);
	}
}