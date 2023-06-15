package chapter5;

import java.util.Scanner;

public class Exercise05_51 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String text1 = input.nextLine();

		System.out.print("Enter the second string: ");
		String text2 = input.nextLine();

		String commonPrefix = "";

		for (int i = 0; text1.charAt(i) == text2.charAt(i); i++) {
			commonPrefix += text1.charAt(i);
		}
		if (commonPrefix.length() > 0) {
			System.out.println("The common prefix is " + commonPrefix);
		} else {
			System.out.println(text1 + " and " + text2 + " have no common prefix.");
		}
	}

}
