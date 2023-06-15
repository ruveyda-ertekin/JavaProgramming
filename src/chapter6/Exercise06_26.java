package chapter6;

import java.util.Scanner;

public class Exercise06_26 {

	public static void main(String[] args) {

		int counter = 0;

		for (int number = 2;; number++) {

			if (isPrime(number) && isPalindrome(number)) {
				counter++;
				if (counter % 10 == 0) {
					System.out.println(number + " ");
				} else {
					System.out.print(number + " ");
				}
				if (counter == 100) {
					break;
				}
			}
		}
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

	public static boolean isPrime(int number) {

		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}

		return true; // Number is prime
	}
}
