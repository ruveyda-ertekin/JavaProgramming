package chapter5;

import java.util.Scanner;

public class Exercise05_44 {

	public static void main(String[] args) {

		// TODO

		int sum = 0;
		int digit = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		short number = input.nextShort();

		String bits = ""; // Holds the bits

		// Get the 16 bits for the integer
		for (int i = 0; i < 16; i++) {
			bits = (number & 1) + bits;
			number >>= 1;
		}

		// Display result
		System.out.println("The bits are " + bits);

	}

}
