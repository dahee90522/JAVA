j//369���� �����ϱ���
class three_six_nine{
	public static void main(String ar[]){
		int ten;
		int one;
		for(int a = 1;a<=100;a++){
			ten = (int)a /10;
			one = a-ten*10;
			if(ten%3==0&&one%3==0)
				System.out.println(a + " = ¦¦");
			else if(ten%3==0||one%3==0)
				System.out.println(a + " = ¦");
		}
	}
}