package labOOP_6;

public class Teller2 {
	public static void main(String[] arg) {
		Account myAccount;
		myAccount = new CheckingAccount(4000, 500);
		Customer cust;
		cust = new Customer("Somchai", "Sommut");
		cust.setAccount(myAccount);
		
		cust.getAccount().withdraw(4300);
		cust.getAccount().showBalance();
		((CheckingAccount)cust.getAccount()).shoeCredit();
		cust.getAccount().deposit(4200);
		cust.getAccount().showBalance();
		((CheckingAccount)cust.getAccount()).shoeCredit();
		
		System.out.println(cust.getFirstname() + " " + cust.getLastname());
	}
}
