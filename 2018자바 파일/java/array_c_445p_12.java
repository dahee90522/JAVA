class array_c_445p_12{
	public static void main(String args[]){
	int ar[][] ={{78, 48, 78, 98}, {99, 92, 83, 29}, {29, 65, 83, 89}, {34, 78, 92, 56}};
	int t = 0;
	int w= 0; int h=0; int i; int j;
	for (i = 0; i < ar.length;i++){
		for (j = 0;j < ar[i].length;j++){
			w += ar[i][j];
			h += ar[j][i];
		}
		System.out.println("배열 가로 " +(i+1) + "번째 줄의 합 = " + w);
		System.out.println("배열 세로 " + (i+1) + "번째 줄의 합 = " + h);
		System.out.println("\n");
		t +=h;
		w=0;
	h=0;
	}
	
	System.out.println("전체 줄의 합 = " + t);
    }
}