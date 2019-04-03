
class Phone{
		String model;//멤버변수
		int value;
		void print() {
			System.out.println(value+"만원짜리"+model+"스마트폰");
		}
	}

	
	public class PhoneDemo{
		public static void main(String args[]) {
			Phone myPhone = new Phone();
			myPhone.model = "갤럭시 S9";
			myPhone.value = 100;
			myPhone.print();
		}
	
}
