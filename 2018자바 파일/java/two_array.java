2import java.util.*;

class two_array {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);

	int ji=0;
	int x;
	int a[] = new int [5];
	for (int z = 0; z <a.length ;z++)
	{
	 x = sc.nextInt();
    a[z] = x;
	}

	for(int i=0; i< a.length; i++){          	                  

		for(int j=i+1; j< a.length; j++){
			
			 if (a[i] > a[j]){           
                 ji = a[i];
	             a[i] = a[j];
	             a[j] = ji;
	                }
	            }
	           System.out.print(a[i]);
            if (i < a.length - 1) {
	                System.out.print(" < ");
	            }
	        }
			
				System.out.print("\n");
}	    }
