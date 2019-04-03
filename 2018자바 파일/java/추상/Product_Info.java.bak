import java.util.*;
class Product{
	private String id, info, maker, price;
	Product(String id, String info, String maker, String price){
		this.id = id;
		this.info = info;
		this.maker = maker;
		this.price = price;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setInfo(String info){
		this.info = info;
	}
	public String getInfo(){
		return info;
	}
	public void setMaker(String maker){
		this.maker = maker;
	}
	public String getMaker(){
		return maker;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String getPrice(){
		return price;
	}
	public void show(){
		System.out.print( "id >> "+getId()+"\n정보 >> "+getInfo()+"\n생성자 >> "+getMaker()+"\n가격 >> "+getPrice()+"\n");
	}
}
class Book extends Product{
	private String id, info, maker, price, title, author, isbn;
	Book(String id, String info, String maker, String price, String title, String author, String isbn){
		super(id, info, maker, price);
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
		public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(){
		return author;
	}
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	public String getIsbn(){
		return isbn;
	}
	public void show(){
		System.out.println("책 정보\n");
		super.show();
		System.out.println( "제목 >> "+getTitle()+"\n저자 >> "+getAuthor()+"\n번호 >> "+getIsbn());
	}
}
class Music extends Product{
	private String id, info, maker, price, titlesong, singer;
	Music(String id, String info, String maker, String price, String titlesong, String singer){
		super(id, info, maker, price);
		this.titlesong = titlesong;
		this.singer = singer;
	}
	public void setTitlesong(String titlesong){
		this.titlesong = titlesong;
	}
	public String getTitlesong(){
		return titlesong;
	}
	public void setSinger(String singer){
		this.singer = singer;
	}
	public String getSinger(){
		return singer;
	}
	public void show(){
		System.out.println("음악 정보\n");
		super.show();
		System.out.println("제목 >> "+getTitlesong()+"\n가수 >> "+getSinger());
	}
}
class Conversation extends Product{
		private String id, info, maker, price, topic, level;
	Conversation(String id, String info, String maker, String price, String topic, String level){
		super(id, info, maker, price);
		this.topic = topic;
		this.level = level;
	}
	public void setTopic(String topic){
		this.topic = topic;
	}
	public String getTopic(){
		return topic;
	}
	public void setLevel(String level){
		this.level = level;
	}
	public String getLevel(){
		return level;
	}
	public void show(){
		System.out.println("회화 정보\n");
		super.show();
		System.out.println("주제 >> "+getTopic()+"\n단계 >> "+getLevel());
	}
}
class Product_Info{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String id, info, maker, price, title, author, isbn, titlesong, singer, topic, level;
		Product p[] = new Product[10];

		while(true){
			System.out.print("== 상품추가<1>, 상품 조회<2>, 끝내기<3> == >> ");
			int type = sc.nextInt();
			if(type ==1){
				System.out.print("\n== 상품 종류 책<1>, 음악 CD<2>, 회화책<3> == >>");
				int type1 = sc.nextInt();
				switch(type1){
					case 1 : System.out.print("상품 ID : ");
								 id = sc.next();
								 System.out.print("상품 설명 : ");
								info= sc.next();
								 System.out.print("생산자 : ");
								 maker= sc.next();
								 System.out.print("가격 : ");
								 price =  sc.next();
								 System.out.print("제목 : ");
								  title= sc.next();
								 System.out.print("저자 : ");
								  author= sc.next();
								 System.out.print("ISBN : ");
								 isbn= sc.next();
								 p[count]=new Book(id, info, maker, price, title, author, isbn);
								 count ++; 
								 break;

					case 2 : System.out.print("상품 ID : ");
								  id = sc.next();
								 System.out.print("상품 설명 : ");
								 info= sc.next();
								 System.out.print("생산자 : ");
								  maker= sc.next();
								 System.out.print("가격 : ");
								 price =  sc.next();
								 System.out.print("노래 제목 : ");
								  titlesong= sc.next();
								 System.out.print("가수 : ");
								 singer= sc.next();
								 p[count]=new Music(id, info, maker, price, titlesong, singer);
								 count ++;
								 break;
					case 3 :System.out.print("상품 ID : ");
								  id = sc.next();
								 System.out.print("상품 설명 : ");
								 info= sc.next();
								 System.out.print("생산자 : ");
								  maker= sc.next();
								 System.out.print("가격 : ");
								 price =  sc.next();
								 System.out.print("주제 : ");
								  topic= sc.next();
								 System.out.print("단계 : ");
								 level= sc.next();
								 p[count]=new Conversation(id, info, maker, price, topic, level);
								 count ++;
								 break;
				}//switch					
			}//if
			else if (type==2){
						for(int i = 0;i<count;i++) {
							System.out.print("["+(i+1)+"번 째]");
							p[i].show();
							System.out.println("\n");
						}
			}
			else if(type==3){
				System.exit(0);
			}
		}
	}
}