import java.util.*;
class Account {
	Scanner sc=new Scanner(System.in);
		private String account_No;//계좌번호
		private String password;//비밀번호
		private String owner;//예금주
		private int balance;//잔고
		int total=0;
		public void set_account_No(){
			System.out.print("계좌번호를 설정하세요. :");
			account_No=sc.next(); 
		}
		public void set_password(){
			System.out.print("비밀번호를 설정하세요. :");
			password=sc.next();
		}
		public void set_owner(){
			System.out.print("예금주를 설정하세요. : ");
			owner=sc.next();
		}
		public void set_balance(){
			System.out.print("통장에 있는 돈을 설정하세요. : ");
			balance=sc.nextInt();
		}
		public void deposit(){//입금
			System.out.print("입금할 돈을 설정하세요. :");
			int d=sc.nextInt();
			balance+=d;
			System.out.println("최종 돈 :" + balance);
		}
		public void widthDraw(){//출금
			System.out.print("출금할 금액을 입력하세요. :");
			int w=sc.nextInt();
			balance-=w;
			if(balance<0){
				System.out.println("잔액이 부족합니다.");
				return;}
			else if(balance==0)
				System.out.println("잔액이 0원입니다.");
			else
			System.out.println("최종 돈 : " + balance);		
		}
public static void main(String ar[]){//main()
	Scanner sc=new Scanner(System.in);
		
		System.out.print("은행입니다. 일을 수행하시겠습니까? --> yes:1, no:0 ==> ");
		int aaaa=sc.nextInt();

while(aaaa==1){ 
		String pa, ow, ac, ba;
		String answer;//입금할래? 출금할래?
		Account A1=new Account();//객체생성
		A1.set_account_No();
		A1.set_password();
		A1.set_owner();
		A1.set_balance();
		System.out.println("==========================================");
		
		System.out.print("계좌번호를 입력하세용. :"); 
		ac=sc.next();

		if(ac.equals(A1.account_No)){
			
		System.out.print("비밀번호를 입력하세용. :");
		while(true){//비밀번호 반복문
		ba=sc.next();
		if(ba.equals(A1.password)){
			break;
			}
		System.out.print("비밀번호를 다시 입력하세용. :");
		}
		while (true){
		System.out.print("입금할래 출금할래? (안하고 싶으면 안할래 라고 입력하세요)");
		answer=sc.next();
		if (answer.equals("입금")){
		A1.deposit();}
		else if(answer.equals("출금")){
		A1.widthDraw();}
		else{
			
			return;}
		}
		}//ac.equals(A1.account_No)--if의 괄호
		else
			System.out.println("계좌번호가 다릅니다. 다시 입력하십시오.");
				return;
				}
}}