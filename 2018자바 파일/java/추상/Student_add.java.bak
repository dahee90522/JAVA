import java.util.*;
class Student{
	private String name, num, hab, add;
	private int age;
	public void setName(String name){
		this.name = name;
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
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setHab(String hab){
		this.hab = hab;
	}
	public String getHab(){
		return hab;
	}
	public void setAdd(String add){
		this.add = add;
	}
	public String getAdd(){
		return add;
	}
	public void pr(){
		System.out.println( "이름 >> "+getName()+"\n나이 >> "+getAge()+"\n전화번호 >> "+getNum()+"\n주특기 >> "+getHab()+"\n주소 >> "+getAdd());
	}
}

class Student_add{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("입력인원 :>> ");
		int c = sc.nextInt();
		System.out.println("==학생정보입력==");
		System.out.println("================");
		Student s[] = new Student[c];
		String name, num, hab, add;
	    int age;
		for(int i = 0;i<c;i++){
			s[i] = new Student();
			System.out.println("이름 >> ");
			s[i].setName(name=sc.next());
			System.out.println("나이 >> ");
			s[i].setAge(age=sc.nextInt());
			System.out.println("전화번호 >> ");
			s[i].setNum(num=sc.next());
			System.out.println("주특기 >> ");
			s[i].setHab(hab=sc.next());
			System.out.println("주소 >> ");
			s[i].setAdd(add=sc.next());
			System.out.println(s[i].pr());
		}
	}
}