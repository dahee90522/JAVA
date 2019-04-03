class animal{
	private String name, owner;
	private int leg;
	public animal(String name, String owner, int leg){
		this.name = name;
		this.owner = owner;
		this.leg = leg;
	}
	public animal(String name, String owner){
		this.name = name;
		this.owner = owner;
	}
	public animal(String owner, int leg){
		this.owner = owner;
		this.leg = leg;
	}
	public void setName(String name){
		System.out.println(name);
	}
	public String getName(){
		return name;
	}
	public void setOwner(String owner){
		System.out.println(owner);
	}
	public String getOwner(){
		return owner;
	}
 //setOwner(), getOwner()

	public static void main(String ar[]){
   animal a1=new animal("cat","mike",4);
   animal a2=new animal("dog","alice");
   animal a3=new animal("tom",3);
/*a3의 setNam()  "sheep"
   a2의 setOwner()  "tomas"

   a3의 getName()
   a2의 getOwner()*/
   a3.setName("sheep");
   a2.setOwner("tomas");
   a3.getName();
   a2.getOwner();
	}
}