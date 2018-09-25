package labOOP_6;

public class CheckingAccount extends Account {
	private double credit;
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(double amount, double credits) {
		balance = amount;
		credit = credits;
	}
	
	public boolean withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Balance : " + balance);
			System.out.println("Credit : " + credit + "\n");
			return true;
		}
		else if (balance+credit >= amount) {
			credit = credit+balance-amount;
			balance = 0;
			System.out.println("Balance : 0");
			System.out.println("Credit : " + credit + "\n");
			return true;
		}
		else {
			System.out.println("Not enough money\n");
			return false;
		}
	}
	
	public void shoeCredit() {
		System.out.print("Credit : " + credit + "\n");
	}
}
