class Movie{
	String title, dir, manu;//제목, 감독, 제조사
	public void Movie1(String title, String dir, String manu){
		System.out.println(title+"의 감독은 "+dir+"이고, 제작사는 "+manu+"이다");
	}
	public void Movie1(){
	}
}
class Movie_Test{
	public static void main(String ar[]){
		Movie m1 = new Movie();
		m1.Movie1("클루리스", "에이미 헥커링", "Paramount");
		Movie m2 = new Movie();
		m2.Movie1();
	}
}