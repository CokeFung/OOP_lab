package labOOP_4;

public class MyMain {

	public static void main(String[] args) {
		
		MyDate d1 = new MyDate();
		
		d1.setDay(16);
		d1.setMonth(12);
		d1.setYear(2002);
		d1.print();
		d1.setDay(29);
		d1.setMonth(2);
		d1.setYear(2002);
		d1.print();
	}
}
