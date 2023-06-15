package chapter5;

import java.util.Scanner;

public class Exercise05_41 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int max = -1;
		int count = 0;
		int number = -1;

		System.out.print("Enter numbers: ");

		while (number != 0) {
			number = input.nextInt();

			if (number > max) {
				max = number;
				count = 1;
			} else if (number == max) {
				count++;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
	}

}
