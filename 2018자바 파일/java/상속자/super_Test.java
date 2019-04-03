class Person10 {
	private String name, addr, tel;
	Person10(String name, String addr, String tel){
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public String getTel(){
		return tel;
	}
	public String toString(){
		return "�̸� : "+name+"\n�ּ� : "+addr+"\n��ȭ��ȣ : "+tel;
	}
}
class Customer extends Person10{
	String number, mileage;
	Customer(String name, String addr, String tel, String number, String mileage){
		super(name, addr, tel);
		this.number = number;
		this.mileage =mileage;
	}
	public String toString(){
		return super.toString()+"\n����ȣ : "+number+"\n���ϸ��� : "+mileage;
	}
}
class super_Test{
	public static void main(String ar[]){
		Customer c = new Customer("�ֿ�", "���Ǳ�", "010-8299-8834",  "011", "1201");
		System.out.println(c.toString());
	}
}
