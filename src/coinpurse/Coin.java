package coinpurse;

/**
* Coin represents coinage (money) with a fixed value and currency.
* @author Bill Gates
*/

public class Coin implements Comparable<Coin>{
	
	private double value;
	private String currency;
	public Coin(double value, String currency) {
		this.value = value;
		this.currency = currency;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public String getCurrency() {
		return this.currency;
	}
	
	public boolean equals(Object arg) {
		Coin temp = (Coin)arg;
		return this.currency.equals(temp.currency) && this.value == temp.value;
	}
	
	public int compareTo(Coin coin) {
		if (this.value < coin.value) return -1;
		else if (this.value > coin.value) return 1;
		else return 0;
	}
	
	public String toString() {
		return this.value+"-"+this.currency;
	}
}
