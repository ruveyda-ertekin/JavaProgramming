package chapter5;

import java.util.Scanner;

public class Exercise05_46 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String letter = input.nextLine();

		System.out.print("The reversed string is ");
		
		for (int i = letter.length() - 1; i >= 0; i--) {
			System.out.print(letter.charAt(i));
		}

	}

}
