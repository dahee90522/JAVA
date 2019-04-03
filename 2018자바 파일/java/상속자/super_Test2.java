class  Employee{
	private String name, num;
	Employee(String name, String num){
		this.name = name;
		this.num = num;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setNum(String num){
		this.num = num;
	}
	public String getNum(){
		return num;
	}
	public String toString(){
		return "이름 : "+name+"\n번호 : "+num;
	}
	
}
class SalariedEmployee extends Employee{
	double salary;
	SalariedEmployee(String name, String num, double salary){
		super(name, num);
		this.salary = salary;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	public double computeSalary(){
		return salary*12;
	}
	public String toString(){
		return super.toString()+"\n월급 : "+salary+"\n 연금 : "+computeSalary();
	}
}
class super_Test2{
	public static void main(String ar[]){
		Employee e1 = new Employee("Sam", "1");
		SalariedEmployee e2 = new SalariedEmployee("Tem", "2", 230);
				System.out.println(e1.toString());
				System.out.println("\n");
						System.out.println(e2.toString());
	}
}
