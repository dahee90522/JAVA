import java.util.*;
/*class info{
	int id, pw;
	info(int id, int pw){
		this.id = id;
		this.pw = pw;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setPw(int pw){
		this.pw = pw;
	}
	public int getPw(){
		return  pw;
	}
}*/
class info2{
	Scanner sc = new Scanner(System.in);
	String id, pw;
	info2(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setPw(String pw){
		this.pw = pw;
	}
	public String getPw(){
		return  pw;
	}
	public void right(){
			int i = 5;
			System.out.println("--------------------------------------------------------------------------------------------------------");
		while(true){
				System.out.print("아이디 입력 : ");
				String idd = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pww = sc.next();
				/*System.out.print("아이디 입력 : ");
				int idd = sc.nextInt();
				System.out.print("비밀번호 입력 : ");
				int pww = sc.nextInt();*/
				if(idd.equals(getId())&&pww.equals(getPw())){
					System.out.println("로그인 되었습니다. \n");
					break;
				}
				else{
					if(i >0){
						System.out.println("비밀번호 또는 아이디가 다릅니다. 다시 입력해주세요.");
						System.out.println("기회는 "+i+"번 남았습니다.\n");
						i--;
					}
					else if(i==0){
						System.out.println("기회가 끝났습니다.");
						break;
					}
					System.out.println("--------------------------------------------------------------------------------------------------------");
				}
			}//while
		}//public
}//class
class four{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id1 = sc.next();
		System.out.print("비밀번호 : ");
		String pw1 = sc.next();
		info2 in = new info2(id1, pw1);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		in.right();
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
}