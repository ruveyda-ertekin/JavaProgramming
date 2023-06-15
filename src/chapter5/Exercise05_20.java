package chapter5;

public class Exercise05_20 {

	public static void main(String[] args) {

		int count = 1;
		int number = 2;

		System.out.println("The prime numbers from 2 to 1000 are : \n");

		while (number <= 1000) {

			boolean isPrime = true;

			for (int divisor = 2; divisor < number; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {

				if (count % 8 == 0) {

					System.out.printf("%4d", number);
					System.out.println();

				} else
					System.out.printf("%4d", number);

				count++;
			}

			number++;
		}
	}
}
