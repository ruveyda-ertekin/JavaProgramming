package chapter5;

public class Exercise05_33 {

	public static void main(String[] args) {

		//TODO 
		
		int sum;

		for (int number = 6; number <= 10000; number++) {

			sum = 0;

			for (int divisor = 1; divisor < number; divisor++)
				if (number % divisor == 0) {
					sum += divisor;

				}

			if (sum == number) {

				System.out.println(number + " is a perfect number and sum of its positive divisors are " + sum);
			}
		}

	}

}
