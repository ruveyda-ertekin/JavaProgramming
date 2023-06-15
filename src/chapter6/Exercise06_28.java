package chapter6;

public class Exercise06_28 {

	public static void main(String[] args) {

		System.out.println("p\t" + "2 * p - 1 ");
		System.out.println("-------------------");
		
		for (int number = 2; number <= 31; number++) {

			if (isPrime(number)) {
				System.out.println(number + "\t" + (int) (Math.pow(2, number) - 1));

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
