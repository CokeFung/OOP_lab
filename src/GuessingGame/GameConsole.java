package GuessingGame;

import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/** play the game. */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
                
		int guess = 0, count = 0;
        boolean correct = false;
		// describe the game
		System.out.println( game.toString() );
		
		// This is just an example.
                while(correct == false){
                	count += 1;
                    System.out.print("Your answer? ");
                    guess = console.nextInt();
                    correct = game.guess(guess);
                    if (correct == true ) break;
                    System.out.println( game.getMessage() );
                }
		game.setCount(count);
		return guess;
	}
	
}