package labOOP_6;

public class Teller3 {
	
	
	public static void main(String[] arg) {
		
		Manager ma = new Manager("John", "Seller");
		ma.calSalary(50, 10);
		ma.showDetails();
	}
}
