package GuessingGame;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_13
 */
public class GameDialog {
    public int play(NumberGame game){
        String title = "Guessing Game";
        String message = "Hello, This is Guessing game.";
        int type = JOptionPane.WARNING_MESSAGE;
        JOptionPane.showMessageDialog(null, message, title, type);

		int guess = 0, count = 0;
                boolean correct = false;
		// describe the game
		System.out.println( game.toString() );
                message = game.toString();
                type = JOptionPane.WARNING_MESSAGE;
                JOptionPane.showMessageDialog(null, message, title, type);
		// This is just an example.
                String reply;
                
                while(correct == false){
                	count += 1;
                    message =  "I'm thinking of a number between 1 and " + game.getUpperBound()+"\nYour Answer?";
                    type = JOptionPane.QUESTION_MESSAGE;
                    reply = JOptionPane.showInputDialog(null,message,title,type);
                    if ( reply == null ){
                        System.exit(0);   
                    }
                    else{
                        guess = Integer.parseInt(reply);
                    }
                    correct = game.guess(guess);
                    if (correct == true) break;
                    System.out.println( game.getMessage() );
                    message = game.getMessage() + "\nGuess again?";
                    type = JOptionPane.YES_NO_OPTION;
                    int opt = JOptionPane.showConfirmDialog(null, message, title, type);
                    if ( opt == JOptionPane.NO_OPTION ) System.exit(0); 
                }
                message = "Right! The secret number is " + guess;
                type = JOptionPane.WARNING_MESSAGE;
                JOptionPane.showMessageDialog(null, message, title, type);
                
                message = "Play again?";
                type = JOptionPane.YES_NO_OPTION;
                int opt = JOptionPane.showConfirmDialog(null, message, title, type);
                if ( opt == JOptionPane.YES_OPTION ) play(new WeerapatGame(game.getUpperBound()));
                else System.exit(0); 
                game.setCount(count);
		return guess;
    }
}
