package chapter3;

import java.util.Scanner;

public class Exercise03_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("scissor (0), rock (1), paper (2): ");
		int guess = input.nextInt();

		int computerGuess = (int) (Math.random() * 3);
		System.out.println(computerGuess);

		if (guess == 0 && computerGuess == 0) {
			System.out.println("The computer is scissor. You are scissor too. It is a draw");
		} else if (guess == 1 && computerGuess == 1) {
			System.out.println("The computer is rock. You are rock too. It is a draw");
		} else if (guess == 2 && computerGuess == 2) {
			System.out.println("The computer is paper. You are rock paper. It is a draw");
		}

		else if (guess == 0 && computerGuess == 2) {
			System.out.println("The computer is paper. You are scissor. You won");
		} else if (guess == 2 && computerGuess == 1) {
			System.out.println("The computer is rock. You are paper. You won");
		} else if (guess == 1 && computerGuess == 0) {
			System.out.println("The computer is scissor. You are rock. You won");
		}

		else if (guess == 0 && computerGuess == 1) {
			System.out.println("The computer is rock. You are scissor. Computer won");
		} else if (guess == 1 && computerGuess == 2) {
			System.out.println("The computer is paper. You are rock. Computer won");
		} else if (guess == 2 && computerGuess == 0) {
			System.out.println("The computer is scissor. You are paper. Computer won");
		}

	}

}