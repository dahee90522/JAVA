class Car10 {
  String carname;
  String color;
  int velocity; //속도

  public void speedUp(){
  System.out.println("5씩 증가");}// : 5씩 증가
  public void speeddown(){
  System.out.println("5씩 감소");}//: 5씩 감소
  }
 class Car10_1 extends Car10
 {
	Car10_1(String name, String color){
		this.carname = name;
		this.color = color;
	}
	int ton = 3;
 }
class Car{
	public static void main(String ar[]){
		Car10_1 c = new Car10_1("트럭", "검정색");
		System.out.println("나의 "+c.carname+"은 "+c.color+"이다.");
		System.out.println("프론티어는 "+c.ton+"톤을 실을 수 있다\n\n");
	}
}

