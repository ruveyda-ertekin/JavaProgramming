package chapter4;

import java.util.Scanner;

public class Exercise04_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char letter = input.next().toLowerCase().charAt(0);

		if (Character.isLetter(letter)) {
			if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'u' || letter == 'i') {
				System.out.println(letter + " is a vowel");
			} else {
				System.out.println(letter + " is a consonant.");
			}
		} else {
			System.out.println(letter + " is an invalid input.");
		}

	}

}
