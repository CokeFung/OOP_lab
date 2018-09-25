package labOOP_4;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public void setDay(int d) {
		if (d>=0 && d<= 30)
			day = d;
	}
	
	public void setMonth(int m) {
		if (m>=0 && m<=12)
			month = m;
	}
	
	public void setYear(int y) {
		if (y>=0)
			year = y;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void print() {
		System.out.println(day + "/" + month + "/" + year);
	}
	
}
