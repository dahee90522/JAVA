/*import java.util.*;

class switch_Test6{
	public static void main(String ar[]) {
		int month=Calendar. getInstance(). get(Calendar. MONTH)+1;
		String season="";
		switch(month) {
			case (3) :
				case (4) :
				case (5) : System.out.println("봄"); break;
			case (6) :
				case (7) :
				case (8) : System.out.println("여름"); break;
			case (9) :
				case (10) :
				case (11) : System.out.println("가을"); break;
			default : System.out.println("겨울");
		}
	}
                
}*/

import java.util.*;

class switch_Test6{
	public static void main(String ar[]) {
		int month=Calendar. getInstance(). get(Calendar. MONTH)+1;
		String season="";
		switch(month) {
			case 3 :
		    	case 4 :
		         	case 5 : season="봄"; break;
			case 6 :
			    case 7 :
	        		case 8 :  season="여름"; break;
	    	case 9 :
			case 10 :
			case 11 : season="가을"; break;
			default : season="겨울";
		}
			System.out.println(season);
		
	}
                
}