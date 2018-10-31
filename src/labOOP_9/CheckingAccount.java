package labOOP_9;


public class CheckingAccount extends Account {

	private double credit;
	
	public CheckingAccount(double amount, double credits) {
		balance = amount;
		credit = credits;
	}
	
	public void withdraw(double amount) throws WithdrawException {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Balance : " + balance);
			System.out.println("Credit : " + credit + "\n");
		}
		else if (balance+credit >= amount) {
			credit = credit+balance-amount;
			balance = 0;
			System.out.println("Balance : 0");
			System.out.println("Credit : " + credit + "\n");
		}
		else {
			throw new WithdrawException();
		}
	}
	
	public void shoeCredit() {
		System.out.print("Credit : " + credit + "\n");
	}
		
}