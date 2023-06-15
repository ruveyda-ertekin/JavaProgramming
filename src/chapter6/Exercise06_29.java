package chapter6;

public class Exercise06_29 {

	public static void main(String[] args) {

		for (int number = 3; number <= 1000; number++) {
			int num1 = number;
			int num2 = number + 2;

			if (isPrime(num1) && isPrime(num2)) {
				System.out.println("(" + num1 + "," + num2 + ")");

			}
		}

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
