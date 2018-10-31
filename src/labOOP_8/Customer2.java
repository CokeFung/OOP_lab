package labOOP_8;

import java.util.ArrayList;

public class Customer2 {
	private String firstname;
	private String lastname;
	private ArrayList<Account> acc;
	private int numOfAccount;
	
	public Customer2() {
		this.acc = new ArrayList<Account>();
		this.numOfAccount = 0;
	}
	
	public Customer2(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.numOfAccount = 0;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void addAccount(Account acc){
		this.acc.add(this.numOfAccount, acc);
		this.numOfAccount += 1;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public Account getAccount(int index) {
		return this.acc.get(index);
	}
	
	public int getNumOfAccount(){
		return this.acc.size();
	}

}