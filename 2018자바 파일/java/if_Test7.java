class if_Test7 {
	public static void main (String ar[]){
		int a = 10, b = 20, c = '*';
		if (c == '+') {
			System.out.println(a+b);
		}
		else if (c == '-') { //문자이기 때문에 ' 필수!!!!!
			System.out.println(a-b);
		}
		else if (c == '*') {
			System.out.println(a*b);
		}
		else if (c == '/')
		{
			System.out.println(a/b);
		}
		else if (c=='%')
		{
			System.out.println(a%b);
		}
}
}