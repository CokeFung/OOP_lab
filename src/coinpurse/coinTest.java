package coinpurse;

import java.util.ArrayList;
import java.util.List;

public class coinTest {
	public static void main(String[] arg) {
		List<Coin> coins = new ArrayList<Coin>();
		
		coins.add(new Coin(10.0, "Baht"));
		coins.add(new Coin(0.5, "Baht"));
		coins.add(new Coin(2.0, "Baht"));
		coins.add(new Coin(1.0, "Baht"));
		printCoin(coins);
		java.util.Collections.sort(coins);
		printCoin(coins);
	}
	
	private static void printCoin(List<Coin> coins) {
		for(int i = 0; i < coins.size(); i++) {
			System.out.println(coins.get(i).toString());
		}
	}
}
