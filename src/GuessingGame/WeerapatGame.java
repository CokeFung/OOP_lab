package GuessingGame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author LAB203_14
 */
public class WeerapatGame extends NumberGame{
    private int upperBound;
    private int secret;
    private int count;
    long seed = System.nanoTime();
    Random rnd = new Random(seed); 
    public WeerapatGame(int upperBound){
    	this.count = 0;
	    this.upperBound = upperBound;
	    this.secret = rnd.nextInt(this.getUpperBound());
	    this.setMessage("I'm thinking of a number between 1 and "+this.getUpperBound());
    }
    public void setCount(int count){
    	this.count = count;
    }
    public int getCount(){
        return this.count;
    }
    public boolean guess(int number){
        if(number == this.secret){
        return true;
        }
        else{
            if(number > this.secret){
                this.setMessage("Number you're guessing is lower than " + number);
            }
            else{
                this.setMessage("Number you're guessing is higher than " + number);
            }
        return false;
        }
    }
    public int getUpperBound(){
        return this.upperBound;
    }
    public String toString(){
       return ("This is a guessing game. You must guess a number and we will provide hints for you.");
 
    }
}