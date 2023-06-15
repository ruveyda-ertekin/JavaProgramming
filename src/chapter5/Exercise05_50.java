package chapter5;

import java.util.Scanner;

public class Exercise05_50 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = input.nextLine();

		int upperCounter = 0;

		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				upperCounter++;
			}
		}
		System.out.println("The number of upper letters is " + upperCounter);
	}

}
