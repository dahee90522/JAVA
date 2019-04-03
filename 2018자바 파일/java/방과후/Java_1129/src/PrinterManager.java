
abstract public class Printer {
	public static int USB = 0;
	public static int PARALLEL = 1;
	private String modelName;
	private String manufacturer;
	private int type;
	protected int numberofPrinted;
	protected int numberofPaper;
	abstract public boolean print();
	Printer(String modelName, String manufacturer, int type, int numberofPrinted, int numberofPaper){
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.type = type;
		this.numberofPaper = numberofPaper;
		this.numberofPrinted = 0;
	}
	public String getModelName() {
		return modelName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getType() {
		return type;
	}
	public int getNumberofPrinted() {
		return numberofPrinted;
	}
	public int getNumberofPaper() {
		return numberofPaper;
	}
}
class LaserPrinter extends PrinterManager{
	static final int amountofTonerToPrint = 10;
	private int amountofToner;
	LaserPrinter(String modelName, String manufacturer, int type, int numberofPrinted, int numberofPaper, int amountofToner) {
		super(modelName, manufacturer, type, numberofPrinted, numberofPaper);
		this.amountofToner = amountofToner;
	}
	public int getAmountofToner() {
		return amountofToner;
	}
	public boolean print() {
		if(amountofToner <=0) {
			System.out.println("��ʰ� �����մϴ�.");
			return false;
		}
		if(numberofPaper <=0) {
			System.out.println("������ �����մϴ�.");
			return false;
		}
		System.out.println("������������ ���");
		amountofToner -= 10;
		numberofPaper--;
		numberofPrinted++;
		return true;
	}
}
/*class InkjetPrinter extends Printer{
	static final int amountofInkToPrint = 10;
	InkjetPrinter(String modelName, String manufacturer, int type, int numberofPrinted, int numberofPaper, int amountofInkToPrint) {
		super(modelName, manufacturer, type, numberofPrinted, numberofPaper);
		this.amountofInkToPrint = amountofInkToPrint ;
	}
	public int getAmountofInkToPrint() {
		return amountofInkToPrint;
	}
}*/
class PrinterManager{
	public static void main(String[] args) {
		LaserPrinter lp = new LaserPrinter("FSD", "�Ｚ����", 1, 432, 5, 10);
		//InkjetPrinter ip = new InkjetPrinter("GDH", "LG", printer, 52, 5, 5);
		for(int i = 0;i<5;i++) {
			lp.print();
			System.out.println("������������>>");
			System.out.println("�μ���� : "+lp.getNumberofPaper());
			System.out.println("��¸ż� : "+lp.numberofPrinted);
			System.out.println("�μ���� : "+lp.getAmountofToner());
			/*ip.print();
			System.out.println("��ũ��������>>");
			System.out.println("�μ���� : "+ip.getNumberofPaper());
			System.out.println("��¸ż� : "+ip.numberofPrinted);
			System.out.println("�μ���� : "+ip.getamountofIntToPrint());*/
		}
	}
}
























