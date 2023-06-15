package chapter4;

import java.util.Scanner;

public class Exercise04_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter string : ");
		String str = input.nextLine();

		System.out.println("Digit length is " + (str.length()));
		System.out.println("First digit is " + (str.charAt(0)));

	}

}
