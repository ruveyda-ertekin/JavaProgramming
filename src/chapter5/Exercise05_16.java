package chapter5;

import java.util.Scanner;

public class Exercise05_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer: ");
		int number = input.nextInt();

		int divisor = 2;

		while ((number / divisor) != 1) {
			if (number % divisor == 0) {
				System.out.print(divisor + " ");
				number = number / divisor;

			} else {
				divisor++;
			}
		}
		System.out.print(number);
	}

}
