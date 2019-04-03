class param_Test5{
	public static void main(String ar[]){
		int a = Integer.parseInt(ar[0]);
		int b= Integer.parseInt(ar[1]);
		if (a<=100 || b<=100)
		{
			if (a<b)
			{
				for (int i = a;i<=b ; i++)
				{
					System.out.println(i);
				}
			}
			else{
				for (int i = b;i<=a ;i++ )
				{
					System.out.println(i);
				}
			}
		}
		else
			System.out.println("오류입니다.");
	}
}