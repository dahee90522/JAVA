import java.util.*;

class scanner_Test2 {
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
	/*1.	int i = sc.nextInt();
		System.out.println("-"+i%7);*/

 /* 2.      System.out.println("점수 : ");
		int i2 = sc.nextInt();
		  if (i2>60) {
   System.out.println("합격");
}
else {
 System.out.println("불합격");
}*/

/*3.    System.out.println("국어점수 : ");
        int kor = sc.nextInt();
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수 : ");
		int math = sc.nextInt();

		System.out.println("총점수"+kor+eng+math);
		System.out.println("평균"+(kor+eng+math)/3);
		*/
		
/*4.	System.out.println("10이하의 자연수 n : ");
			int n = sc.nextInt();
			if(n<=10);
			for( int i3=1 ; i3 <= n ; i3++) {
				System.out.println("Freeze");
			}*/

/*5.     System.out.println("100이하의 정수 a");
			int a = sc.nextInt();
				System.out.println("100이하의 정수 b");
			int b = sc.nextInt();
			if (a < b){
			for( int c=0 ; c <= b ; c++) {
				System.out.println(c);} }
	       else if(a>b) {
			for( int c=0 ; c <=a ; c++) {
				System.out.println(c);} }*/

/*6.	System.out.println("정수");
				int t = 0;
				int i5 = sc.nextInt();
			
		
				for( int ii =1 ;ii <= i5 ; ii++) {
					if( ii%5==0 ){
						t=t+ii;
				} }
				System.out.println(t);*/

/*7. 				System.out.println("게임을 계속하시겠습니까???? 1-종료 / 0-계속");
				int game = sc.nextInt();
				if (game==0)
				{
					System.out.println("계속합니다"); 
					}
					else  {
						System.out.println("종료합니다");
				}*/

/*8             System.out.println("100이하의 자연수 n : ");
					int n = sc.nextInt();
					int t=0;
					for( int c =1 ; c <= n ; c++) {
						t=t+c;}
						System.out.println("평균 - " + t/n);  */

/*9					for(int z=4 ; z <= 100 ; z += 4)  {
						System.out.println(z); }  */

/*10                       int t = 0;
					  int p = 0;
						for (int a = 100 ; a <=999 ; a+=7){
                        t = t + 1;
							p=p+a;
						}
						System.out.println("7의 배수의 개수 : " + t);
						System.out.println("7의 배수의 합 : " + p);  */

/*11				int t = 0;
					int p = 0;
					for ( int a = 100 ; a <= 999 ; a++ )
					{t = t + 1;
					 p = p + a;
					}
			 		for (int b = 100 ; b <=999 ; b+=4){
                        t = t - 1;
							p = p - b; }
							System.out.println("4의 배수가 아닌 수의 개수 : "+t);
							System.out.println("4의 배수가 아닌 수의 합 : "+p);  */

                           
/*12							for (int a = 0 ; a <=100 ; a +=15 )
							{
							System.out.println("3과 5의 공배수 : " + a);
							}   */
                           
/*13                             for (int a = 1 ; a <= 100 ; a++ )
						   {
							   if (( a % 7 == 0) || (a%11==0) );
							   {
								   System.out.println(a);
							   }
							  
						   } */
						   
/*14                           for (int a = 65; a<=90 ; a++ )
                           {
							     System.out.println((char) a);
                           }    */

/*15						   for (int a = 97;a<=122 ; a++ )
						   {
							     System.out.println((char) a);
						   }    */
                       
/*16					      int t = 0;
						   for (int a = 65; a<=90 ; a++ )
		                   { 
                                t = a+32;
							     System.out.println((char) t);
                           }  */

						   	
                          	
/*17                    		for (int i = 2 ; i <= 9 ; i++ )
                     		{
                 			for (int j = 1 ; j <= 9 ; j++ )
	                		{
	             			System.out.println(i + "*" + j + "=" + i*j);
	                  		}
                			System.out.println("-----------------------------------------------------------------------------------------------------------");
	                     	}   */


/*18							//a+b=14
							int b = 0;
							for (int a = 1; a<=9 ;  a++)
							{
								b=14-a;
								if (b<10)
								{
									System.out.println(a + "+" + b + "= 14" );
								}
							}   */
                           


/*19					   for (int a = 1 ; a <= 100 ; a++ )
						   {
							   if ( a % 3 == 0 && a % 5 != 0 && a % 9 != 0 );
							   {
								   System.out.println(a);
							   }
						   }*/

/*20						          System.out.println("정수 : ");
		int n = sc.nextInt();
		for (int i = n ; i >= 1 ; i-- )
		{
           for (int j = i ; j >= 1 ; j --)
           {
			   System.out.print('*');
           }
		   System.out.println("");
		}*/


/*21           System.out.println("100이하의 자연수 n : ");
					int n = sc.nextInt();
					int t=0;
					for( int c =1 ; c <= n ; c++) {
						t=t+c;}
						System.out.println("평균 - " + t/n);  */

/*22							System.out.println("10개의 정수 : ");
					
				int t1 = 0;
					int t2 = 0; 
						for (int i = 1 ; i <= 10 ; i++)
						{
                          	int a = sc.nextInt();
							if (a % 2 == 0)
							{
								t1 = t1 + 1;
							}
							else {
								t2 = t2 + 1;
						}
						}
						System.out.println("짝수의 개수 : " + t1 + "홀수의 개수 : " + t2 ); */

/*23                   System.out.println("정수 2개 입력 : ");
                        int a = sc.nextInt();
						int b = sc.nextInt();
						int t = 0;
						int p = 0;

                        if (a<b) {
							for (int i = a ; i <= b ; i++)
							{
								if ( i % 3 == 0 || i % 5 == 0 ){
									t = t + i;
									p++;
								}
							}
								System.out.println("합 : " + t + "평균 : " + (float)t / p);
						}
						else if (a>b) {
							for (int i = a ; i >= b ; i--)
							{
								if ( i % 3 == 0 || i % 5 == 0 ){
									t = t + i;
									p++;
								}
							}
								System.out.println("합 : " + t + "평균 : " + (float)t / p);
						}
						

/*24						int t = 0;
						System.out.print("한개의 자연수 : ");
						int a = sc.nextInt();

						for (int i = 1 ; i <= 10 ; i++ )
						{
							t=t+a;
							System.out.println(t);
						} */

							
}
}