package GuessingGame;

import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_13
 */
public class GameSolver {
    public int play(NumberGame game){
        
        Scanner console = new Scanner(System.in);
                
		int guess = 0, count = 0;
                boolean correct = false;
		// describe the game
		System.out.println( game.toString() );
                long seed = System.nanoTime();
                Random rand = new Random(seed);
                int value = rand.nextInt(game.getUpperBound())+1;
		// This is just an example.
                while(correct == false){
                	count += 1;
                    System.out.print("Your answer? ");
                    guess = rand.nextInt(game.getUpperBound())+1;
                    correct = game.guess(guess);
                    if (correct == true ) break;
                    System.out.println( game.getMessage() );
                }
		game.setCount(count);
		return guess;
    }
}