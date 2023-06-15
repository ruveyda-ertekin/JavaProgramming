package chapter5;

import java.util.Scanner;

public class Exercise05_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students : ");
		int number = input.nextInt();

		int firstHighestScore = -1;
		String firstHighestName = "";
		
		int secondHighestScore = -1;
		String secondHighestName = "";

		while (number > 0) {

			System.out.print("Enter the each student’s name: ");
			String name = input.next();

			System.out.print("Enter the each student’s score: ");
			int score = input.nextInt();

			if (firstHighestScore < score) {
				
				secondHighestScore = firstHighestScore;
				secondHighestName = firstHighestName;

				firstHighestScore = score;
				firstHighestName = name;

			}
			number--;

		}

		System.out.println("The name of the student with the highest score: " + firstHighestName);
		System.out.print("The name of the second student with the highest score: " + secondHighestName);

	}

}
