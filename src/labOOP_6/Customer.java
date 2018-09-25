package labOOP_6;

public class Customer {
	private String firstname;
	private String lastname;
	private Account acc;
	
	public Customer() {
		
	}
	
	public Customer(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.acc = acc;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setAccount(Account acc) {
		this.acc = acc;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public Account getAccount() {
		return this.acc;
	}
}
