package labOOP_8;

public class Bank {
	private Account acct[];
	private int numAccount;
	
	public Bank(){
		numAccount = 0;
		acct = new Account[10];
	}
	
	public void addAccount(Account acc){
		acct[numAccount] = acc;
		this.numAccount += 1;
	}
	
	public Account getAccount(int index){
		return this.acct[index];
	}
	
	public int getNumAccount(){
		return this.numAccount;
	}
}