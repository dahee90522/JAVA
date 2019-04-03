import java.util.Scanner;

class Book{
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
public class Book_Array {
	public static void main(String ar[]) {
		Book[] book=new Book[2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<2; i++) {
			String title= sc.nextLine();
			String author=sc.nextLine();
			

			book[i] = new Book(title, author);
			
		}
		for(int i = 0;i<2;i++)
			System.out.println(book[i].title+"	"+book[i].author);
	}
}
