package labOOP_9;

public class Teller {
	public static void main(String[] args) throws WithdrawException {
		
		CheckingAccount acc = new CheckingAccount(5000, 3000);
		
		acc.withdraw(4000);
		acc.showBalance();
		acc.withdraw(8000);
		acc.showBalance();
		acc.withdraw(2000);
		acc.showBalance();
	}
}