class Book{
	String title, count, author;
	Book(String title, String count, String author){
		this.title = title;
		this.count = count;
		this.author = author;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setCount(String count){
		this.count = count;
	}
	public String getCount(){
		return count;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(){
		return author;
	}
	public String toString(){
		return "���� : "+title+"\n������ �� : "+count+"\n�۰� : "+author;
	}
}
class Magazine extends Book{
	String date;
	Magazine(String title, String count, String author, String date){
		super(title, count, author);
		this.date = date;
	}
	public void setDate(String date){
		this.date = date;
	}
	public String getDate(){
		return date;
	}
	public String toString(){
		return super.toString()+"\n�߸��� : "+date;
	}
}
class Book_Test{
	public static void main(String ar[]){
		Magazine m = new Magazine("���̾� ��ȭ���� ����", "456", " �����ó� ���̰�", "2012.12.19");
		System.out.println(m.toString());
	}
}