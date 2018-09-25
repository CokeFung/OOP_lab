package labOOP_4;

public class Teller1 {

		public static void main(String[] args) {
			
			CheckingAccount acc = new CheckingAccount(5000, 3000);
			
			acc.withdraw(4000);
			acc.showBalance();
			acc.withdraw(8000);
			acc.showBalance();
			acc.withdraw(2000);
			acc.showBalance();
		}
}
