package coinpurse;

import java.util.ArrayList;
import java.util.List;

//TODO import List, ArrayList, and Collections
// You will use Collections.sort() to sort the coins

/**
 *  A coin purse contains coins.
 *  You can insert coins, withdraw money, check the balance,
 *  and check if the purse is full.
 *  
 *  @author your name
 */
public class Purse {
    /** Collection of objects in the purse. */
    //TODO declare a List of Coins named "money".
    
    /** Capacity is maximum number of items the purse can hold.
     *  Capacity is set when the purse is created and cannot be changed.
     */
    private final int capacity;
    private List<Coin> coins;
    private int count;
    
    /** 
     *  Create a purse with a specified capacity.
     *  @param capacity is maximum number of coins you can put in purse.
     */
    public Purse( int capacity ) {
    	this.capacity = capacity;
    	coins = new ArrayList<Coin>(this.capacity);
    	this.count = 0;
    }

    /**
     * Count and return the number of coins in the purse.
     * This is the number of coins, not their value.
     * @return the number of coins in the purse
     */
    public int count() { return this.count; }
    
    /** 
     *  Get the total value of all items in the purse.
     *  @return the total value of items in the purse.
     */
    public double getBalance() {
    	double temp = 0;
    	for(int i = 0; i < this.count; i++) {
    		temp += coins.get(i).getValue();
    	}
		return temp; 
	}

    
    /**
     * Return the capacity of the coin purse.
     * @return the capacity
     */
    //TODO write accessor method for capacity. Use Java naming convention.
    public int getCapacity() { 
		return this.capacity; 
	}
    
    /** 
     *  Test whether the purse is full.
     *  The purse is full if number of items in purse equals
     *  or greater than the purse capacity.
     *  @return true if purse is full.
     */
    public boolean isFull() {
        //TODO complete this method. Avoid writing duplicate code (Don't Repeat Yourself).
        return this.count == this.capacity;
    }

    /** 
     * Insert a coin into the purse.
     * The coin is only inserted if the purse has space for it
     * and the coin has positive value.  No worthless coins!
     * @param coin is a Coin object to insert into purse
     * @return true if coin inserted, false if can't insert
     */
    public boolean insert( Coin coin ) {
        // if the purse is already full then can't insert anything.
        //TODO complete the insert method
    	if (this.isFull() || coin.getValue() <= 0)
    		return false;
    	else {
    		coins.add(count++, coin);
    		return true;
    	}
    }
    
    /**  
     *  Withdraw the requested amount of money.
     *  Return an array of Coins withdrawn from purse,
     *  or return null if cannot withdraw the amount requested.
     *  @param amount is the amount to withdraw
     *  @return array of Coin objects for money withdrawn, 
	 *    or null if cannot withdraw requested amount.
     */
    public Coin[] withdraw( double amount ) {
        //TODO don't allow to withdraw amount < 0
        if (amount < 0) return null;
	   /*
		* See lab sheet for outline of a solution, 
		* or devise your own solution.
		* The idea is to be greedy.
		* Try to withdraw the largest coins possible.
		* Each time you choose a coin as a candidate for
		* withdraw, add it to a temporary list and
		* decrease the amount (remainder) to withdraw.
		* 
		* If you reach a point where amountNeededToWithdraw == 0
		* then you found a solution!
		* Now, use the temporary list to remove coins
		* from the money list, and return the temporary
		* list (as an array).
		*/
		double amountNeededToWithdraw = amount;
		List<Coin> temp = new ArrayList<Coin>();
		java.util.Collections.sort(coins);
		for (int i = coins.size()-1 ; i >= 0  ; i--) {
			if(coins.get(i).getValue() <= amountNeededToWithdraw) {
				amountNeededToWithdraw -= coins.get(i).getValue();
				temp.add(coins.get(i));
			}
		}
		// Did we get the full amount?
		// This code assumes you decrease amount each time you remove a coin.
    	// Your code might use some other variable for the remaining amount to withdraw.
		if ( amountNeededToWithdraw != 0 )
		{	
			// failed. Don't change the contents of the purse.
			return null;
		}
		
		// Success.	
		// Remove the coins you want to withdraw from purse,
		// and return them as an array.
		// Use list.toArray( array[] ) to copy a list into an array.
		// toArray returns a reference to the array itself.
        //return new Coin[0]; //TODO replace this with real code
		
		for (int i = 0; i < temp.size() ; i++) {
			coins.remove(temp.get(i));
			this.count--;
		}
		
		Coin[] ans = new Coin[temp.size()];
		ans = temp.toArray(ans);
		/*
		for(Coin c: ans) {
			System.out.println("Coin : " + c.toString());
		}
		*/
		return ans;
	}
  
    /** 
     * toString returns a string description of the purse contents.
     * It can return whatever is a useful description.
     */
    public String toString() {
        //TODO complete this
    	//return "you forgot to write Purse.toString()";
    	return this.count + " coins with value " + this.getBalance();
    }

}
//TODO When you finish, there should not be any TODO comments, including this one!
