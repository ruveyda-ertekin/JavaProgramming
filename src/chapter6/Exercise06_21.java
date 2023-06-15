package chapter6;

import java.util.Scanner;

public class Exercise06_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = input.nextLine();

		for (int i = 0; i < text.length(); i++) {
			if (Character.isAlphabetic(text.charAt(i))) {
				char letter = Character.toUpperCase(text.charAt(i));
				System.out.print(getNumber(letter));
			} else {
				System.out.print(text.charAt(i));
			}

		}

	}

	public static int getNumber(char uppercaseLetter) {
		int number = -1;

		if (uppercaseLetter > 86) {
			number = 9;
		} else if (uppercaseLetter > 83) {
			number = 8;
		} else if (uppercaseLetter > 79) {
			number = 7;
		} else if (uppercaseLetter > 76) {
			number = 6;
		} else if (uppercaseLetter > 73) {
			number = 5;
		} else if (uppercaseLetter > 70) {
			number = 4;
		} else if (uppercaseLetter > 67) {
			number = 3;
		} else if (uppercaseLetter > 64) {
			number = 2;
		}
		return number;
	}
}
