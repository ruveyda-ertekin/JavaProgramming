package chapter6;

import java.util.Scanner;

public class Exercise06_06 {

	public static void main(String[] args) {

		System.out.println("Enter n : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		displayPattern(n);
	}

	public static void displayPattern(int n) {

		for (int row = 1; row <= n; row++) {

			for (int space = n; space > row; space--) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
