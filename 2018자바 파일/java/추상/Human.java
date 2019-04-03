class Human{
	private String birth, foot, lang, addr;
	Human(String birth, String foot, String lang, String addr){
		this.birth = birth;
		this.foot = foot;
		this.lang = lang;
		this.addr = addr;
	}
	public String use(String lang){
		System.out.println(lang+"를 사용하고");
		return lang;
	}
	public String live(String addr){
		System.out.println(addr+"에 산다");
		return addr;
	}
	public void setBirth(String birth){
		this.birth = birth;
	}
	public void setFoot(String foot){
		this.foot = foot;
	}
	public void setLang(String lang){
		this.lang = lang;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getBirth(){
		return birth;
	}
	public String getFoot(){
		return foot;
	}
	public String getLang(){
		return lang;
	}
	public String getaddr(){
		return addr;
	}
	public String toString(){
		return "발사이즈 : "+getFood()+"\n생일 : "+getBirth()+""+use()+""+live();
	}
}