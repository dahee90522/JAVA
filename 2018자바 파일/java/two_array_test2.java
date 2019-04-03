class two_array_test2{
	public static void main(String ar[]){
		int a[][];
		a=new int[2][3];

		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				a[i][j]=10;
				System.out.print(a[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}
}