class referance1 {
	public static void main(String args[]){
		 int total=0;int count = 0;
		int a[] = new int[899];
		for(int z = 0;z<a.length;z++){
			a[z] = z+100;
			if(a[z] % 6 == 0){
				total+=a[z];
				count++;
			}
		}
		
		System.out.println("6의 배수의 합 : "+total+" 갯수 : "+count);
	}
}
/* 1. 어떤 값이 짝수인지 홀수인지 판단
	2. 절대값 구하기
	3. 양수인지 음수인지 판단
	4. 두 수 사이의 합 구하기