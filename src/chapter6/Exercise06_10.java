package chapter6;

public class Exercise06_10 {

	public static void main(String[] args) {

		System.out.println("Use this method to find the number of prime numbers less than 10000 \n");

		int count = 1;

		for (int i = 2; i <= 10000; i++) {

			if (isPrime(i)) {
				System.out.printf("%6d", i);
				if (count % 10 == 0) {
					System.out.println();
				}
				count++;
			}
		}

		System.out.println("\n\nTotal prime numbers : " + (count - 1));
	}

	/** Check whether number is prime */
	public static boolean isPrime(int number) {

		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}

		return true; // Number is prime

	}

}
