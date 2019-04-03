public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title+" "+author);
	}
	public Book(String title, String author) {
		this.title = title;
		this.author=author;
	}
	public Book() {
		this("","");
		System.out.println("생성자 호출");
	}
	public Book(String title) {
		this(title, "작가미상");
	}
	public static void main(String args[]) {
		Book littlePrince = new Book("어린 왕자", "생택쥐");
		Book lovestory = new Book("춘향전");
		
		littlePrince.show();
		lovestory.show();
		//emptyBook.show();
		Book emptyBook=new Book();
	}
}
