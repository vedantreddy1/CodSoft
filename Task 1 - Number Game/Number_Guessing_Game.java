package com.Number.Guessing;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		int lowerBound =1;
		int upperBound = 10;
		int targetNumber =random.nextInt(upperBound-lowerBound+1)+lowerBound;
		
		int maxAttempts=5;
		int attempts=0;
		boolean guessedCorrectly = false;
		
		System.out.println("Welcome to the Number Guessing Game");
		System.out.println("Try to Guess the Number between "+lowerBound+" to "+ upperBound);
		
		while(attempts<maxAttempts && !guessedCorrectly) {
			System.out.println("Enter your guess : ");
			int userGuest = scanner.nextInt();
			scanner.nextLine();
			
			attempts++; // attempts = 1 , 2 , 3 , 4 , 5
		
		if(userGuest==targetNumber) {
			guessedCorrectly=true;
			System.out.println("Congratulations!!! You have guess correctly. You guessed correct number in  "+ attempts + "attempts");
			}
		else if(userGuest>targetNumber) {
			System.out.println("Your guess number is above the target number");
		}else
		{
			System.out.println("Your number is below the target number");
		}
	}
		if (!guessedCorrectly) {
			System.out.println("Sorry ! You've reached the maximum number od attempts. The Corredct answer is :  "+targetNumber);
			
		}

		//ASk if user want to play again or not;
		
		System.out.println("Do You want to Play Again !?");
		String playAgain= scanner.nextLine().toLowerCase();
		
		if (playAgain.equals("yes")) {
			main(args);
			
		}
		else {
			System.out.println("Thank You for playing. GoodBye!");
		}
		scanner.close();
	}

}
