class Person10
{
	  String name;
	 String addr;
	 String tel;
	Person10(String name, String addr, String tel){
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		}
	public void setName(String _name){
		this.name = _name;
	}
	public void setAddr(String _addr)	{
		this.addr = _addr;
	}
	public void setTel(String _tel)	{
		this.tel = _tel;
	}
	public String getName()	{
		return name;}
	public String getAddr(){
		return addr;
	}
	public String getTel(){	
		return tel;
}
	
}

class Customer extends Person10
{
	 String customNum;//고객번호
	 int mileage;//마일리지
	public Customer(String _name, String _addr, String _tel, String _customNum, int _mileage) {
		super(_name, _addr, _tel);
		customNum = _customNum;
		mileage = _mileage;
	}
	
}
public class extend_Test2
{
	public static void main(String[] args) {
		Customer c1 = new Customer("Tom", "101-412", "#82-622-8909", "10249304", 100);
		
		}
}