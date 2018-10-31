package GuessingGame;

import java.util.Random; 
/**
 * Example guessing game.
 * 
 * @author Your Name
 * @version 2018.01.11
 */
public class SampleGame extends NumberGame {
    /** upper bound for secret number */
    private int upperBound;
    /** the solution to the game */
    private int secret;
    
	/** count guesses */
//TODO add an attribute to count guesses

    /** Initialize a new default game. */
    public SampleGame()
    {
		this(100);		
    }

	public SampleGame(int upperbound) {
		final int base = 16;
		this.upperBound = upperbound;
		// create the secret number
		long seed = System.nanoTime(); 
		Random rand = new Random(seed);
		// don't just copy this.
		// random.nextInt(n) returns a random integer between 0 and n-1, inclusive.
		this.secret = rand.nextInt(Math.max(upperbound-10,1)) + 10;
		super.setMessage("What is the decimal value of 0x" + Integer.toString(secret,base)+" (hexadecimal)?");
	}

    /**
     * Evaluate a user's guess. 
     * @param number is the user's guess
     * @return true if guess is correct, false otherwise
     */
    public boolean guess(int number) {
    	if (number == secret) {
    		setMessage("Correct! The decimal value is "+secret);
    		return true;
    	}
    	if (number < 3*secret/4) {
    		setMessage("Woah! Your answer is WAY too small.");
    	}
    	else if (number < secret) {
    		setMessage("Your answer is too small.");
    	}
    	else if (number > secret*4/3) {
    		setMessage("No way! Your answer is WAY too large.");
    	}
    	else /* if (number > secret) */ {
    		setMessage("Your answer is too large.");
    	}
    	return false;
    }
	
	/** Get the game upper bound. */
	public int getUpperBound() {
		return upperBound;
	}
    
    @Override
    public String toString() {
    	return "Convert a number from hexadecimal to decimal.";
    }
}