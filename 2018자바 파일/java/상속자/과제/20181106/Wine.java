class Wine{
	private String manufacturer, name, country, region, kind;
	private int year, grade;
	Wine(String manufacturer, String name, String country, String region, String kind, int year, int grade) {
		this.manufacturer = manufacturer;
		this.name = name;
		this.country = country;
		this.region = region;
		this.kind = kind;
		this.year = year;
		this.grade = grade;
	}
	Wine(String manufacturer, String name){
		this.manufacturer = manufacturer;
		this.name = name;
	}
	public static void main(String ar[]){
		Wine w = new Wine("미림", "황다희");
		System.out.println("제조사 : "+w.manufacturer+"\n이름 : "+w.name);
	}
}
