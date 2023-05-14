package com;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
	public static void main(String[] args) {

	    Random random = new Random();
	    int number = random.nextInt(100) + 1;
	    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Type a number: ");
	    int guessedNumber = scanner.nextInt();

	    while (guessedNumber != number) {
	      if (guessedNumber > number) {
	        System.out.println("Your guess is too high.");
	      } else {
	        System.out.println("Your guess is too low.");
	      }
	      System.out.print("Type a number: ");
	      guessedNumber = scanner.nextInt();
	    }

	    System.out.println("You guessed it! The number was " + number);
	  }
		
		
		
		
		
}
