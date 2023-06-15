package chapter6;

import java.util.Scanner;

public class Exercise06_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number :");
		long n = input.nextLong();
		System.out.printf("Square root of number : %-9.2f", sqrt(n));
	}

	public static double sqrt(long n) {

		long lastGuess = 1;

		long nextGuess = (lastGuess + n / lastGuess) / 2;

		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}

		return nextGuess;

	}

}
