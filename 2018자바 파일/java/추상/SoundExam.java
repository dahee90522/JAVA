interface Sound{
	public void SoundUp(int level);
	public void SoundDown(int level);
}
class Tv implements Sound{
	private int SndLevel;
	Tv{
		this
	//추상메서드 몸통 구현(level만큼 올라가고 내려가고)
	//볼륨이 0보다 작으면 0으로 세팅

}
class Radio implements Sound{
	private int SndLevel;
	//생성자
	//추상메서드 몸통 구현(level만큼 올라가고 내려가고)
	//볼륨이 0보다 작으면 0으로 세팅

}
class SoudExam{
	public static void main(String ar[]){
		Sound radio = new Radio();
		Sound tv = new Tv();
		radio.SoundUp(5);
		tv.SoundUp(5);
	}
}