abstract interface Movable{
	public abstract void speedUp(int amount);
	public abstract void speedDown(int amount);
}
class Vehicle{
	int speed, rspeed;
	//set get 설정
	public void setSpeed(int speed){
		this.speed = speed;
		rspeed = speed;
	}
	public String getSpeed(){
		return "원래 속도 : "+rspeed;
	}
}
class car extends Vehicle implements Movable {//다중상속
//vehicle과 movable를 둘다 동시에 상속 받음
	String carNum;//차넘버
	//생성자
	car(String carNum){
		this.carNum = carNum;
	}
	//매서드 오버라이딩
	public void speedUp(int amount){
		System.out.println(amount+"만큼 속도가 올라갔습니다.");
		speed += amount;
	}
	public void speedDown(int amount){
			System.out.println(amount+"만큼 속도가 내려갔습니다.");
			speed -= amount;
	}
	public String toString(){
		return carNum + " 지금 속도 : "+ speed;
	}
}
class car3 extends Vehicle implements Movable {
	String yacht;//요트 등록번호
	//생성자
	car3(String yacht){
		this.yacht = yacht;
	}
	//매서드 오버라이딩
	public void speedUp(int amount){
		System.out.println(amount+"만큼 속도가 올라갔습니다.");
		speed = speed+ amount;
	}
	public void speedDown(int amount){
			System.out.println(amount+"만큼 속도가 내려갔습니다.");
			speed = speed- amount;
	}
		public String toString(){
		return yacht + " 지금 속도 : "+ speed;

	}
}
class Movable_Test{
	public static void main(String ar[]){
		car c = new car("다희");
		car3 c3 = new car3("주영");
		
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