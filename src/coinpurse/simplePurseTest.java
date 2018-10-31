package coinpurse;

public class simplePurseTest {
	public static void main(String[] arg) {
		Purse purse = new Purse(3);
		System.out.println(purse.getBalance());
		System.out.println(purse.isFull());
		System.out.println(purse.insert(new Coin(5, "THB")));
		System.out.println(purse.insert(new Coin(10, "THB")));
		System.out.println(purse.insert(new Coin(0, "THB")));
		System.out.println(purse.insert(new Coin(1, "THB")));
		System.out.println(purse.insert(new Coin(5, "THB")));
		System.out.println(purse.count());
		System.out.println(purse.isFull());
		System.out.println(purse.getBalance());
		System.out.println(purse.toString());
		System.out.println(purse.withdraw(12));
		System.out.println(purse.withdraw(11));
		//System.out.println(purse.toString());
	}
}
