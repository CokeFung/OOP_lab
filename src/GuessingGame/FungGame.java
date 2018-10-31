package GuessingGame;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_13
 */
public class FungGame extends NumberGame {
    
    private int upperBound;
    private int secret;
    private int count;
    
    
    public FungGame(int upperBound){
        this.count = 0;
        this.upperBound = upperBound;
        long seed = System.nanoTime();
        Random rand = new Random(seed);
        int value = rand.nextInt(this.upperBound)+1;
        this.secret = value;
        System.out.println("Guess a secret number.");
        this.setMessage("I'm thinking of a number between 1 and " + this.getUpperBound());
    }
    
    public int getCount(){
        return this.count;
    }
   
    
    public boolean guess(int number){
        if (number > this.secret){
            this.setMessage(number +" too large");
        }
        else if (number < this.secret){
            this.setMessage(number + " too small");
        }
        
        return number == this.secret;
    }
    
    public int getUpperBound(){
        return this.upperBound;
    }
    
    public String toString(){
        return this.getMessage();
    }
    
    
}