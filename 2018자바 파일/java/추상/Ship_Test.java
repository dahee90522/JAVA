abstract class Ship
{
	public abstract int Passengers();//�°�
	public abstract int Luggage();//��
}

class Ship1
{
	public int Passengers(){
		return 10;
	}
	public int Luggage(){
		return 10;
	}
}
//-------------------------------------------------------------
class Ship_Test
{
	public static void main(String ar[]){
		Ship1 s = new Ship1();

		System.out.println("�ִ� ž�� �ο� : " + s.Passengers()+"��");
		System.out.println("�ִ� ���緮 : " + s.Luggage() + "kg");
	}
}