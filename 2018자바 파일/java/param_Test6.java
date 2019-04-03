class param_Test6{
	public static void main(String ar[]){
		int a = 0;
		int total = 0;
		float avg;
		int n = Integer.parseInt(ar[0]);
		int m = Integer.parseInt(ar[1]);
		for (int i = n;i<=m ;i++ )
		{
			total+=i;
			a++;
		}
		avg = (float)total/a;
		System.out.println("ЦђБе : " + avg);
	}
}
