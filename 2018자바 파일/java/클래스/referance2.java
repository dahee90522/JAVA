class referance2{
	public static void main(String ar[]){
	int a[] = new int[100];
	int total = 0;
	for (int i = 1;i<=100 ;i++ ){
		a[i-1]=i;
		if(a[i-1]%2==0){
		total+=a[i-1];
		}
	}
	System.out.println("1~100까지의 짝수의 합 : "+total);
	}
}