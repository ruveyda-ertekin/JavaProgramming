package chapter4;

import java.util.Scanner;

public class Exercise04_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter grade: ");
		String letter = input.nextLine();
		char ch = letter.toUpperCase().charAt(0);

		if (Character.isLetter(ch)) {
			if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'F') {
				System.out.print("The numeric value for grade " + ch);

				switch (ch) {
				case 'A':
					System.out.print(" is 4");
					break;
				case 'B':
					System.out.print(" is 3");
					break;
				case 'C':
					System.out.print(" is 2");
					break;
				case 'D':
					System.out.print(" is 1");
					break;
				case 'F':
					System.out.print(" is 0");

				}
			}
		} else {
			System.out.println(ch + " is an invalid grade.");
		}

	}

}
