class Student3{
	private String name;
	private int grade;
	public void setName(String s){
		name = s;
	}
	public String getName(){
		return name;
	}
	public void setGrade(int g){
		grade = g;
	}
	public int getGrade(){
		return grade;
	}
}
class Student3_test{
	public static void main(String ar[]){
		Student3 s1 = new Student3();
		s1.setName("Tom");
		System.out.println(s1.getName());
		s1.setGrade(1);
		System.out.println(s1.getGrade());
	}
}
