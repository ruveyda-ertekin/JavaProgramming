package chapter6;

public class Exercise06_27 {

	public static void main(String[] args) {

		int counter = 0;

		for (int number = 2;; number++) {

			if (isPrime(number) && !isPalindrome(number) && isReversePrime(number)) {
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

	public static boolean isReversePrime(int number) {

		return isPrime(reverse(number));

	}

	public static boolean isPalindrome(int number) {

		return reverse(number) == number;

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
