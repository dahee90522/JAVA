class Exercise6_4{
	public static void main(String ar[]){
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("�̸� : "+s.name);
		System.out.println("���� : "+s.getTotal());
		System.out.printf("��� : %.1f\n",s.getAverage());
	}
}
class Student{
	String name;
	int ban, no, kor, eng, math;
	public int getTotal(){
		int total=kor+eng+math;
		return total ;
	}
	public float getAverage(){
		float average = (float)(kor+eng+math)/3;
		return average;
	}
}