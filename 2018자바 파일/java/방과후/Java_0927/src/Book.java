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
		System.out.println("������ ȣ��");
	}
	public Book(String title) {
		this(title, "�۰��̻�");
	}
	public static void main(String args[]) {
		Book littlePrince = new Book("� ����", "������");
		Book lovestory = new Book("������");
		
		littlePrince.show();
		lovestory.show();
		//emptyBook.show();
		Book emptyBook=new Book();
	}
}
