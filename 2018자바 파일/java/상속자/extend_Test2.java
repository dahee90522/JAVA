class Animal8{
	int leg;
	String color;
	String owner;

	public String run(){
		return "�ٴ�.";
	}
}
class rabbit extends Animal8{
	rabbit(int leg, String color, String owner){
		this.leg=leg;
		this.color = color;
		this.owner = owner;
	}
	public String run(){
		return "���ѱ��Ѷٴ�.";
	}
}
class tiger extends Animal8{
	tiger(int leg, String color, String owner){
		this.leg=leg;
		this.color = color;
		this.owner = owner;
	}
	public String run(){
		return "��ŭ��ŭ �ٴ�.";
	}
	public String eat(String what){
		return what+"�� �Դ�.";
	}
}
class extend_Test2{
	public static void main(String ar[]){
		rabbit ra = new rabbit(4, "white", "����");
		System.out.println("leg - "+ra.leg+"\tcolor - "+ra.color+"\towner - "+ra.owner);
		System.out.println(ra.run());
		System.out.println("-----------------------------------------------------------------------");
		tiger ti = new tiger(4, "orange", "Ȳ����");
		System.out.println("leg - "+ti.leg+"\tcolor - "+ti.color+"\nowner - "+ti.owner);
		System.out.println(ti.run()+"\n"+ti.eat("����"));
	}
}
