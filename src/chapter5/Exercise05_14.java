package chapter5;

import java.util.Scanner;

public class Exercise05_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();

		int d;
		if (n1 > n2) {
			d = n2;
		} else {
			d = n1;
		}

		while (d > 1) {
			if (n1 % d == 0 && n2 % d == 0) {
				break;
			} else {
				d--;
			}
		}

		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + d);

	}

}
