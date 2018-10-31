package labOOP_8;

public class Teller2 {
	public static void main(String[] arg){
		Customer2 cust = new Customer2();
		Account acc1 = new Account(5000);
		Account acc2 = new Account(3000);
		cust.addAccount(acc1);
		cust.addAccount(acc2);
		
		
		cust.getAccount(0).showBalance();
		cust.getAccount(0).deposit(500);
		cust.getAccount(0).withdraw(1000);
		cust.getAccount(0).showBalance();
		
		cust.getAccount(1).showBalance();
		cust.getAccount(1).deposit(500);
		cust.getAccount(1).withdraw(1000);
		cust.getAccount(1).showBalance();
		
		System.out.print(cust.getNumOfAccount());
	}
}