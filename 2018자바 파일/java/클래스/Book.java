class Book {
//title, author, publish(���ǻ�), price
	String title, author, publish;
	int price;
//������
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
//sell(), buy() 4�� ������� 
	public String sell(String sell){
		return sell;
	}
	public String buy(String buy){
		return buy;
	}
//setAuhor()
	public void setAuthor(String author){
		System.out.println("�۰� �̸� : "+author);
	}

//setTitle()
	public void setTitle(String title){
		System.out.println("å �̸� : "+title);
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

   b4.setAuthor("Ȳ����");
   b4.setTitle("��ä���� ���� �Ѵ�");
   b4.getAuthor();
   b4.getTitle();
   }
   }
