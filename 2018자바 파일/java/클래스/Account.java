import java.util.*;
class Account {
	Scanner sc=new Scanner(System.in);
		private String account_No;//���¹�ȣ
		private String password;//��й�ȣ
		private String owner;//������
		private int balance;//�ܰ�
		int total=0;
		public void set_account_No(){
			System.out.print("���¹�ȣ�� �����ϼ���. :");
			account_No=sc.next(); 
		}
		public void set_password(){
			System.out.print("��й�ȣ�� �����ϼ���. :");
			password=sc.next();
		}
		public void set_owner(){
			System.out.print("�����ָ� �����ϼ���. : ");
			owner=sc.next();
		}
		public void set_balance(){
			System.out.print("���忡 �ִ� ���� �����ϼ���. : ");
			balance=sc.nextInt();
		}
		public void deposit(){//�Ա�
			System.out.print("�Ա��� ���� �����ϼ���. :");
			int d=sc.nextInt();
			balance+=d;
			System.out.println("���� �� :" + balance);
		}
		public void widthDraw(){//���
			System.out.print("����� �ݾ��� �Է��ϼ���. :");
			int w=sc.nextInt();
			balance-=w;
			if(balance<0){
				System.out.println("�ܾ��� �����մϴ�.");
				return;}
			else if(balance==0)
				System.out.println("�ܾ��� 0���Դϴ�.");
			else
			System.out.println("���� �� : " + balance);		
		}
public static void main(String ar[]){//main()
	Scanner sc=new Scanner(System.in);
		
		System.out.print("�����Դϴ�. ���� �����Ͻðڽ��ϱ�? --> yes:1, no:0 ==> ");
		int aaaa=sc.nextInt();

while(aaaa==1){ 
		String pa, ow, ac, ba;
		String answer;//�Ա��ҷ�? ����ҷ�?
		Account A1=new Account();//��ü����
		A1.set_account_No();
		A1.set_password();
		A1.set_owner();
		A1.set_balance();
		System.out.println("==========================================");
		
		System.out.print("���¹�ȣ�� �Է��ϼ���. :"); 
		ac=sc.next();

		if(ac.equals(A1.account_No)){
			
		System.out.print("��й�ȣ�� �Է��ϼ���. :");
		while(true){//��й�ȣ �ݺ���
		ba=sc.next();
		if(ba.equals(A1.password)){
			break;
			}
		System.out.print("��й�ȣ�� �ٽ� �Է��ϼ���. :");
		}
		while (true){
		System.out.print("�Ա��ҷ� ����ҷ�? (���ϰ� ������ ���ҷ� ��� �Է��ϼ���)");
		answer=sc.next();
		if (answer.equals("�Ա�")){
		A1.deposit();}
		else if(answer.equals("���")){
		A1.widthDraw();}
		else{
			
			return;}
		}
		}//ac.equals(A1.account_No)--if�� ��ȣ
		else
			System.out.println("���¹�ȣ�� �ٸ��ϴ�. �ٽ� �Է��Ͻʽÿ�.");
				return;
				}
}}