//5. 5개의 매개변수 입력받아 최대값, 최소값출력
class Param_Test8{
	public static void main(String ar[]){
		int a[];
		a = new int[5];
		for(int i = 0; i < a.length; i++)
			a[i] = Integer.parseInt(ar[i]);

		int min = a[0], max = 0;
		for(int i = 0; i < a.length; i++){
			if(min > a[i])
				min = a[i];
			else if(max < a[i])
				max = a[i];
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}