package chapter6;

import java.util.Scanner;

public class Exercise06_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a 3 digit number : ");
		long number = input.nextLong();

		System.out.println("Sum of the Digits is : " + sumDigits(number));

	}

	public static int sumDigits(long n) {

		int sum = 0;
		int digit = 0;

		while (n > 0) {
			digit = (int) n % 10;
			sum += digit;
			n /= 10;

		}

		return sum;
	}
}
