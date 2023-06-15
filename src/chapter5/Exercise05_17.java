package chapter5;

import java.util.Scanner;

public class Exercise05_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 1 and 15: ");
		int lines = input.nextInt();

		for (int rows = 1; rows <= lines; rows++) {

			for (int space = lines - rows; space >= 1; space--) {
				System.out.print("  ");
			}

			for (int num1 = rows; num1 >= 1; num1--) {
				System.out.print(num1 + " ");
			}

			for (int num2 = 2; num2 <= rows; num2++) {
				System.out.print(num2 + " ");
			}

			System.out.println();
		}

	}

}
