class param_Test4{
	public static void main(String ar[]){
		int i;
		int total = 0;
		int n = Integer.parseInt(ar[0]);
		int m = Integer.parseInt(ar[1]);
		for ( i = n ; i <=m ; i++ )
		{
			total = total+i;
		}
		System.out.println("수의 사이의 합 : "+ total);

	}
}