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
		System.out.println("경기 규칙은 해당 클래스에서 작성한다.");
	}
}
class BaseBall extends Sports{
	
	public void rule(){
		System.out.println("3명이 아웃이면 공수 교대");
	}
}//파울이 4개면 퇴장