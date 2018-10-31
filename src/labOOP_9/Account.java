package labOOP_9;

public class Account {
	
	protected double balance;
	
	public Account() {
		
	}
	
	public Account(double amount) {
		balance = amount;
	}
	
	public void deposit(double amount) {
		System.out.println("Deposit :" + amount);
		balance += amount;
	}
	
	public void withdraw(double amount) throws WithdrawException {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw :" + amount);
		}
		else {
			throw new WithdrawException();
		}
			
	}
	
	public void showBalance() {
		System.out.println("Balance :" + balance);
	}
	
	public double getBalance() {
		return balance;
	}
}