class Student2{
	private String name;
	private int grade, ban, telephone;

	public Student2(String name){
		this. name=name;
	}
	public Student2(String name, int grade, int bam, int telephone){
		this. name=name;
		this. grade=grade;
		this. ban=ban;
		this. telephone=telephone;
	}
	public Student2(String name, int ban, int telephone){
		this. name=name;
		this. ban=ban;
		this. telephone=telephone;
	}
	public Student2(int grade, int bam, int telephone){
		this. grade=grade;
		this. ban=ban;
		this. telephone=telephone;
	}

	public String study(String sub){
		return sub;
	}

	public static void main(String ar[]){
		Student2 s1 = new Student2("장민재");
		Student2 s2 = new Student2("김현우");
		Student2 s3 = new Student2("Tomas", 1, 1, 111);
		Student2 s4 = new Student2("John", 6, 222);
		Student2 s5 = new Student2(2, 5, 333);
		System.out.println(s3.name+"는 "+s3.grade+"반 이고 전화번호는 "+s3.telephone+"입니다");
		System.out.println(s5.study("자바")+"를 공부합니다");
	}
}