abstract interface Movable{
	public abstract void speedUp(int amount);
	public abstract void speedDown(int amount);
}
class Vehicle{
	int speed, rspeed;
	//set get ����
	public void setSpeed(int speed){
		this.speed = speed;
		rspeed = speed;
	}
	public String getSpeed(){
		return "���� �ӵ� : "+rspeed;
	}
}
class car extends Vehicle implements Movable {//���߻��
//vehicle�� movable�� �Ѵ� ���ÿ� ��� ����
	String carNum;//���ѹ�
	//������
	car(String carNum){
		this.carNum = carNum;
	}
	//�ż��� �������̵�
	public void speedUp(int amount){
		System.out.println(amount+"��ŭ �ӵ��� �ö󰬽��ϴ�.");
		speed += amount;
	}
	public void speedDown(int amount){
			System.out.println(amount+"��ŭ �ӵ��� ���������ϴ�.");
			speed -= amount;
	}
	public String toString(){
		return carNum + " ���� �ӵ� : "+ speed;
	}
}
class car3 extends Vehicle implements Movable {
	String yacht;//��Ʈ ��Ϲ�ȣ
	//������
	car3(String yacht){
		this.yacht = yacht;
	}
	//�ż��� �������̵�
	public void speedUp(int amount){
		System.out.println(amount+"��ŭ �ӵ��� �ö󰬽��ϴ�.");
		speed = speed+ amount;
	}
	public void speedDown(int amount){
			System.out.println(amount+"��ŭ �ӵ��� ���������ϴ�.");
			speed = speed- amount;
	}
		public String toString(){
		return yacht + " ���� �ӵ� : "+ speed;

	}
}
class Movable_Test{
	public static void main(String ar[]){
		car c = new car("����");
		car3 c3 = new car3("�ֿ�");
		
		c.setSpeed(254);
		c.speedUp(20);
		System.out.println(c.getSpeed());
		System.out.println(c.toString()+"\n");
		c3.setSpeed(589);
		c3.speedUp(100);
			System.out.println(c3.getSpeed());
		System.out.println(c3.toString());
	}
}