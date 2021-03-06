abstract class Ship11
{
	public abstract int maxspeed();//최대 속도
	public abstract int passenger();//탑승 인원
}
//-------------------------------------------------------------------------
class yacht extends Ship11
{
	public int maxspeed(){
		return 24;
	}
	public int passenger(){
		return 30;
	}
}
//-------------------------------------------------------------------------
class boat extends Ship11
{
	public int maxspeed(){
		return 120;
	}

	public int passenger(){
		return 15;
	}
}

class Ship11_Test{
	public static void main(String ar[]){
		yacht y = new yacht();
		boat b = new boat();

		System.out.println("요트의 최대 속도 : " + y.maxspeed()+ " km/h");
		System.out.println("요트의 탑승 인원 : " + y.passenger()+ "명");
		System.out.println();
		System.out.println("보트의 최대 속도 : " + b.maxspeed()+ " km/h");
		System.out.println("보트의 탑승 인원 : " + b.passenger()+ "명");

	}
}