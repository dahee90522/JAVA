class Phone{
	public String manu, type, price;
	Phone(String manu, String price, String type){
		this.manu = manu;
		this.price = price;
		this.type = type;
	}
	public void setManu(String manu){
		this.manu = manu;
	}
	public String getManu(){
		return manu;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String getPrice(){
		return price;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
	
	public String toString(){
		return "제조사 : "+manu+"\n가격 : "+price+"\n통신타입(2g또는3g) : "+type;
	}
}
class SmartPhone extends Phone{
	String OStype, OsVersion, memory, camera, bluetooth;
	SmartPhone(String manu, String price, String type, String OStype, String OsVersion, String memory, String camera, String bluetooth){
		super(manu, price, type);
		this.OStype = OStype;
		this.OsVersion = OsVersion;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}
		public void setOstype(String OStype){
		this.OStype = OStype;
	}
	public String getOstype(){
		return OStype;
	}
	public void setOSVersion(String OsVersion){
		this.OsVersion = OsVersion;
	}
	public String getOSVersion(){
		return OsVersion;
	}
	public void setMemory(String memory){
		this.memory = memory;
	}
	public String getMemory(){
		return memory;
	}
	public void setCamera(String camera){
		this.camera = camera;
	}
	public String getCamera(){
		return camera;
	}
	public void setBluetooth(String bluetooth){
		this.bluetooth = bluetooth;
	}
	public String getBluetooth(){
		return bluetooth;
	}
	public String toString(){
		return super.toString()+"\n운영체제 타입 : "+OStype+"\n운영체제 버전 : "+OsVersion+"\n메모리 : "+memory+"\n카메라 여부 : "+camera+"\n블루투스 여부"+bluetooth;
	}

}
class Phone_Test{
	public static void main(String ar[]){
		//String manu, String price, String type, String OStype, String OsVersion, String memory, String camera, String bluetooth
		SmartPhone s = new  SmartPhone("LG", "20,000", "3g", "최신", "최신", "64GB", "O", "O");
		System.out.println(s.toString());
	}
}