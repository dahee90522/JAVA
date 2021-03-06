import java.util.*;
class Book{
	private String number, title, author;
	Book(String number, String title, String author){
		this.number = number;
		this.title = title;
		this.author = author;
	}
	public void setNumbar(String number){
		this.number = number;
	}
	public String getNumber(){
		return number;
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

}
class Novel extends Book{
	private int fees = 0;
	 String number, title, author;
	Novel(String number, String title, String author){
		super(number, title, author);
	}
	public int getLateFees(int date){
		fees = date*300;
		return fees;
	}
	public String toString(){
		return "\n[번호] "+getNumber()+"\n[제목] "+getTitle()+"\n[저자] "+getAuthor()+"\n[연체일수] "+fees+"\n";
		//+"\n[연체일수] "+fees
	}
}
class Poet extends Book{
	private int fees = 0;int date;
	 String number, title, author;
	Poet(String number, String title, String author){
		super(number, title, author);
	}
	public int getLateFees(int date){
		fees = date*200;
		return fees;
	}
	public String toString(){
		return "[번호] "+getNumber()+"\n[제목] "+getTitle()+"\n[저자] "+getAuthor()+"\n[연체일수] "+fees+"\n";
		//+"\n[연체일수] "+fees
	}
}
class ScienceFiction extends Book{
	private int fees = 0;int date;
	 String number, title, author;
	ScienceFiction(String number, String title, String author){
		super(number, title, author);
	}
	public int getLateFees(int date){
		fees = date*600;
		return fees;
	}
	public String toString(){
		return "[번호] "+getNumber()+"\n[제목] "+getTitle()+"\n[저자] "+getAuthor()+"\n[연체일수] "+fees+"\n";
		//+"\n[연체일수] "+fees
	}
}
class five {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int date;
		while(true){
			System.out.print("빌린 책(소설, 시, 과학사전) : ");
			String book = sc.next();
			if(book.equals("소설")){
				System.out.print("관리번호 : ");
				String number = sc.next();
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("저자 : ");
				String author = sc.next();
				System.out.print("연채 일수 : ");
				date = sc.nextInt();
				Novel n = new Novel(number, title, author);
				n.getLateFees(date);
				System.out.println(n.toString());
			}
			else if(book.equals("시")){
				System.out.print("관리번호 : ");
				String number1 = sc.next();
				System.out.print("제목 : ");
				String title1 = sc.next();
				System.out.print("저자 : ");
				String author1 = sc.next();
				System.out.print("연채 일수 : ");
				date = sc.nextInt();
				Poet p = new Poet(number1, title1, author1);
				p.getLateFees(date);
				System.out.println(p.toString());
			}
			else if(book.equals("과학사전")){
				System.out.print("관리번호 : ");
				String number2 = sc.next();
				System.out.print("제목 : ");
				String title2 = sc.next();
				System.out.print("저자 : ");
				String author2 = sc.next();
				System.out.print("연채 일수 : ");
				date = sc.nextInt();
				ScienceFiction s = new ScienceFiction(number2, title2, author2);
				s.getLateFees(date);
				System.out.println(s.toString());
			}
			System.out.println("계속 - 1, 끝내기 - 그 외숫자");
			int a = sc.nextInt();
			if(a!=1)
				System.exit(0);
			else
				System.out.println("\n------------------------------------------");
		}
	}
}