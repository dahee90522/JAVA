class Food{
	int kcal, price, gram;

	Food(int kcal, int price, int gram){
		this.kcal = kcal;
		this.price = price;
		this.gram = gram;
	}
	public void setKcal(int kcal){
		this.kcal = kcal;
	}
	public int getKcal(){
		return kcal;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setGram(int gram){
		this.gram = gram;
	}
	public int getGram(){
		return gram;
	}
	public String toString(){
		return "칼로리 : "+kcal+"kcal \n가격 : "+price+"원 \n중량 : "+gram+"g";
	}

}
class Melon extends Food{
	String infor;//경작농원정보
	Melon(int kcal, int price, int gram, String infor){
		super(kcal, price, gram);
		this.infor = infor;
	}
	public void setInfor(String infor){
		this.infor = infor;
	}
	public String getInfor(){
		return infor;
	}
	public String toString(){
		return super.toString()+"\n경작농원정보 : "+infor;
	}

}
class Food_Test{
	public static void main(String ar[]){
		Melon m = new Melon(50, 10000, 60, "북아시아");
		System.out.println(m.toString());
	}
}