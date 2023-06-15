package chapter6;

import java.util.Scanner;

public class Exercise06_04 {

	public static void main(String[] args) {

		System.out.print("Enter a number: ");

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		reverse(number);

	}

	public static void reverse(int number) {

		String reverseStr = "";
		String numberStr = number + "";

		for (int i = numberStr.length() - 1; i >= 0; i--) {
			char digitChr = numberStr.charAt(i);
			reverseStr = reverseStr + digitChr;

		}

		int reveseInt = Integer.parseInt(reverseStr);

		System.out.println("Reverse of this number is : " + reverseStr);

	}

}
