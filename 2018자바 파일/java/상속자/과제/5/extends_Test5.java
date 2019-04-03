//	회사에 근무하는 직원들을 나타내는 클래스들을 상속을 이용하여 작성	*/

class Employee
{
	 String name;
	 String num; 
	 double total;
	Employee(String name, String num){
		this.name = name;
		this.num = num;
	}
	 public void setName(String _name) {
		 this.name = _name;
	 }
	public String getName()	{
		return name;
	}
	 public void setNum(String _num) {
		 this.num = _num;
	 }
	 public String getNum()	{
		 return num;
	 }
	public void computeSalary(){
		//  100*12개월
		total = 100*12;
		System.out.println("돈 : "+total);
	}
}

class SalariedEmployee extends Employee
{
	 double salary;
	//생성자
	SalariedEmployee(String name, String num){
		super(name, num);
	}
	public void setSalary(double _salary){
		this.salary=_salary;
	}
	public double getSalary()	{
		return salary;
	}
	public void computeSalary(){
	total = salary*12;
		System.out.println("돈 : "+total);
	}
}


public class extends_Test5 {
	public static void main(String[] args) {
		Employee e01 = new Employee("Sam", "01");
		SalariedEmployee e02 = new SalariedEmployee("Bob", "02");
		//멤버변수 출력
		System.out.println("e01의 이름 : "+e01.name);
		System.out.println("e01의 번호 : "+e01.num);
		e01.computeSalary();
		System.out.println("\n");
		e02.setSalary(55);
		System.out.println("e02의 이름 : "+e02.name);
		System.out.println("e02의 번호 : "+e02.num);
		e02.computeSalary();
			//메서드 호출
	}
}
