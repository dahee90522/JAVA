class Employee {
//private으로 name, salary월급, hiredate(입사년도)
	private String name, hiredate;
	private int salary;
//생성자 만들기
	public Employee(String name, int salary, String hiredate){
		this.name = name;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	public Employee(String name, String hiredate){
		this.name = name;
		this.hiredate = hiredate;
	}
	public Employee(int salary, String hiredate){
		this.salary = salary;
		this.hiredate = hiredate;
	}
	public Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
//setHiredate(), getSalary() 만들기
	public void setHiredate(String hiredate){
		System.out.println("입사년도 : "+hiredate);
	}
	public int getSalary(){
		return salary;
	}
	public static void main(String ar[]) {
		Employee e1=new Employee("Mike",100,"2018-03-01");
		Employee e2=new Employee("Alice","2017-03-02");
		Employee e3=new Employee(300,"2016-05-03");
		Employee e4=new Employee("Tomas",500);

		e2.setHiredate("2015-05-03");
		System.out.println(e4.getSalary());
	}
}
