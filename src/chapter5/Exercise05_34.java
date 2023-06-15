package chapter5;

import java.util.Scanner;

public class Exercise05_34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int comWin = 0;
		int humanWin = 0;

		while (comWin <= 2 && humanWin <= 2) {

			System.out.print("scissor (0), rock (1), paper (2): ");
			int player = input.nextInt();

			int computer = (int) (Math.random() * 3);

			if (player == 0 && computer == 0) {
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			} else if (player == 1 && computer == 1) {
				System.out.println("The computer is rock. You are rock too. It is a draw");
			} else if (player == 2 && computer == 2) {
				System.out.println("The computer is paper. You are rock paper. It is a draw");
			}

			else if (player == 0 && computer == 2) {
				humanWin++;
				System.out.println("The computer is paper. You are scissor. You won");
			} else if (player == 2 && computer == 1) {
				humanWin++;
				System.out.println("The computer is rock. You are paper. You won");
			} else if (player == 1 && computer == 0) {
				humanWin++;
				System.out.println("The computer is scissor. You are rock. You won");
			}

			else if (player == 0 && computer == 1) {
				comWin++;
				System.out.println("The computer is rock. You are scissor. Computer won");
			} else if (player == 1 && computer == 2) {
				comWin++;
				System.out.println("The computer is paper. You are rock. Computer won");
			} else if (player == 2 && computer == 0) {
				comWin++;
				System.out.println("The computer is scissor. You are paper. Computer won");
			}

		}
		System.out.println();
		System.out.println("Computer Score :" + comWin + "\nPlayer Score :" + humanWin);
	}
}
