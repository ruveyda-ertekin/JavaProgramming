package chapter5;

import java.util.Scanner;

public class Exercise05_37 {

	public static void main(String[] args) {

		/*
		 * (Decimal to binary) Write a program that prompts the user to enter a decimal
		 * integer and displays its corresponding binary value. Don’t use Java’s Integer
		 * .toBinaryString(int) in this program
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Decimal number :");
		int decNumber = input.nextInt();

		String binary = "";
		int number = decNumber;
		while (number != 0) {
			int digit = number % 2;
			binary += digit;
			number /= 2;
		}
		System.out.println("(Decimal " + decNumber + ") = (" + "Binary " + binary + ")");

	}

}
