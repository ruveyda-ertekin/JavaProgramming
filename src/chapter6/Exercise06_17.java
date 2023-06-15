package chapter6;

import java.util.Scanner;

public class Exercise06_17 {

	public static void main(String[] args) {

		System.out.println("Enter n:");

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printMatrix(n);
	}

	public static void printMatrix(int n) {

		int counter = 1;

		for (int i = 1; i <= Math.pow(n, 2); i++) {
			System.out.print((int) (Math.random() * 2) + " ");
			if (counter % n == 0) {
				System.out.println();

			}
			counter++;
		}

	}

}
