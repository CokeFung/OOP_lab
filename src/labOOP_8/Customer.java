package labOOP_8;

public class Customer {
	private String firstname;
	private String lastname;
	private Account[] acc;
	private int numOfAccount;
	
	public Customer() {
		this.acc = new Account[5];
		this.numOfAccount = 0;
	}
	
	public Customer(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.acc = new Account[5];
		this.numOfAccount = 0;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void addAccount(Account acc){
		this.acc[this.numOfAccount] = acc;
		this.numOfAccount += 1;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public Account getAccount(int index) {
		return this.acc[index];
	}
	
	public int getNumOfAccount(){
		return this.numOfAccount;
	}

}