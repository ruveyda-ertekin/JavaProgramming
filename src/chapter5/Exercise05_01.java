package chapter5;

import java.util.Scanner;

public class Exercise05_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int positives = 0;
		int negatives = 0;
		int enteredNumber = 0;
		double total = 0;

		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		if (number == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		} else {

			while (number != 0) {

				if (number > 0) {
					positives++;
				} else if (number < 0) {
					negatives++;
				}

				total += number;
				enteredNumber++;
				number = input.nextInt();

			}

			double average = total / enteredNumber;

			System.out.println("The number of positives is " + positives);
			System.out.println("The number of negatives is " + negatives);
			System.out.println("The total is " + total);
			System.out.println("The average is " + average);

		}
	}
}
