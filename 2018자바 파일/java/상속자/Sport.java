public class Sports{
	String name;
	int player;
	public Sports(String name, int player){
		this.player = player;
		this.name = name;
	}
	public int getPlayer(){
		return Player;
	}
	public String getName(){
		return name;
	}
	public void rule(){
		System.out.println("��� ��Ģ�� �ش� Ŭ�������� �ۼ��Ѵ�.");
	}
}
class BaseBall extends Sports{
	
	public void rule(){
		System.out.println("3���� �ƿ��̸� ���� ����");
	}
}//�Ŀ��� 4���� ����