class Book {
//title, author, publish(출판사), price
	String title, author, publish;
	int price;
//생성자
	public Book(String title, String author, String publish, int price){
		this.title = title;
		this.author = author;
		this.publish = publish;
		this.price = price;
	}
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	public Book(){}
//sell(), buy() 4번 방법으로 
	public String sell(String sell){
		return sell;
	}
	public String buy(String buy){
		return buy;
	}
//setAuhor()
	public void setAuthor(String author){
		System.out.println("작가 이름 : "+author);
	}

//setTitle()
	public void setTitle(String title){
		System.out.println("책 이름 : "+title);
	}
//getAuthor()
	public String getAuthor(){
		return author;
	}
//getTitle()
	public String getTitle(){
		return title;
	}
public static void main(String ar[]) {
   Book b1=new Book("A","a","aa",100);
   Book b2=new Book("B","bb",200);
   Book b3=new Book("C",300);
   Book b4=new Book();

   b4.setAuthor("황다희");
   b4.setTitle("유채린은 똥을 싼다");
   b4.getAuthor();
   b4.getTitle();
   }
   }
