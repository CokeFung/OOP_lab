package labOOP_4;

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
	
	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw :" + amount);
			return true;
		}
		else {
			System.out.println("Not enough money");
			return false;
		}
			
	}
	
	public void showBalance() {
		System.out.println("Balance :" + balance);
	}
	
	public double getBalance() {
		return balance;
	}
}
