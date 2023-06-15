package chapter6;

import java.util.Scanner;

public class Exercise06_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a integer: ");
		int number = input.nextInt();

		System.out.println(isPalindrome(number));

	}

	public static int reverse(int number) {

		int temp = number;
		int reverse = 0;
		int lastNumber;

		while (temp != 0) {
			lastNumber = temp % 10;
			reverse = (reverse * 10) + lastNumber;
			temp /= 10;

		}
		return reverse;
	}

	public static boolean isPalindrome(int number) {

		if (number == reverse(number))
			return true;
		else
			return false;
	}

}
