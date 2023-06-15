package chapter5;

import java.util.Scanner;

public class Exercise05_48 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Eter a string: ");
		String text = input.nextLine();

		for (int i = 0; i <= text.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(text.charAt(i));
			}
		}

	}

}
