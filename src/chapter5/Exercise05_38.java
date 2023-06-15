package chapter5;

import java.util.Scanner;

public class Exercise05_38 {

	public static void main(String[] args) {

		/*
		 * (Decimal to octal) Write a program that prompts the user to enter a decimal
		 * integer and displays its corresponding octal value. Don’t use Java’s
		 * Integer.toOctalString(int) in this program.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Decimal number :");
		int decNumber = input.nextInt();

		String octal = "";
		int number = decNumber;
		while (number != 0) {
			int digit = number % 8;
			octal += digit;
			number /= 8;
		}
		System.out.println("(Decimal " + decNumber + ") = (" + "Octal " + octal + ")");

	}

}
