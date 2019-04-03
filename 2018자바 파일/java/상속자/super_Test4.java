class  father{
	int i = 100;
	public String method2(){
		return "상위메서드";
	}
}
class child2 extends father{
	int i = 20;
	public int method1(){
		return super.i;
	}
}
class super_Test4{
	public static void main(String ar[]){
		child2 c2 = new child2();
		System.out.println(c2.method1());
		System.out.println(c2.method2());
	}
}