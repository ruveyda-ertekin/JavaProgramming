package chapter6;

import java.util.Scanner;

public class Exercise06_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String text = input.nextLine();
		System.out.println("Number of the letter " + countLetters(text));

	}

	public static int countLetters(String s) {

		return s.length();
	
	}

}
