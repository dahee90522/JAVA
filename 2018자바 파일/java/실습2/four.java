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
				System.out.print("���̵� �Է� : ");
				String idd = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pww = sc.next();
				/*System.out.print("���̵� �Է� : ");
				int idd = sc.nextInt();
				System.out.print("��й�ȣ �Է� : ");
				int pww = sc.nextInt();*/
				if(idd.equals(getId())&&pww.equals(getPw())){
					System.out.println("�α��� �Ǿ����ϴ�. \n");
					break;
				}
				else{
					if(i >0){
						System.out.println("��й�ȣ �Ǵ� ���̵� �ٸ��ϴ�. �ٽ� �Է����ּ���.");
						System.out.println("��ȸ�� "+i+"�� ���ҽ��ϴ�.\n");
						i--;
					}
					else if(i==0){
						System.out.println("��ȸ�� �������ϴ�.");
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
		System.out.print("���̵� : ");
		String id1 = sc.next();
		System.out.print("��й�ȣ : ");
		String pw1 = sc.next();
		info2 in = new info2(id1, pw1);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		in.right();
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
}