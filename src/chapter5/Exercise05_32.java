package chapter5;

import java.util.Scanner;

public class Exercise05_32 {

	public static void main(String[] args) {
		
		int firstDigit = 1 + (int) (Math.random() * 10);
		int secondDigit = (int) (Math.random() * 10);
		
		while(firstDigit == secondDigit) {
			secondDigit = (int) (Math.random() * 10);
		}
		
		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();

		// Get digits from lottery
		int lotteryDigit1 = firstDigit;
		int lotteryDigit2 = secondDigit;

		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		

		System.out.println("The lottery number is " + lotteryDigit1 + "" + lotteryDigit2);

		// Check the guess
		if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");


	}

}
