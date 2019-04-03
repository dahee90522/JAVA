import java.util.Scanner;
class Book{
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author=author;
	}
}
public class BookArray {
	public static void main(String ar[]) {
		Book[] book=new Book[2];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<2;i++) {
			System.out.println("제목 > ");
			String title = scanner.nextLine();
			System.out.println("저자 > ");
			String author = scanner.nextLine();
			book[i]=new Book(title, author);
		}
		for(int i = 0;i<2;i++) {
			System.out.println(book[i].title + ","+book[i].author);
		}
	}
}
