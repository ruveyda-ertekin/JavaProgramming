package chapter5;

import java.util.Scanner;

public class Exercise05_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students : ");
		int numberStudents = input.nextInt();

		int highestScore = 0;
		String highestName = "";
		while (numberStudents > 0) {

			System.out.println("Enter the each student’s name: ");
			String name = input.next();

			System.out.println("Enter the each student’s score: ");
			double score = input.nextDouble();

			if (highestScore < score) {
				highestScore = (int) score;
				highestName = name;
			}
			numberStudents--;

		}
		System.out.print("The name of the student with the highest score: " + highestName);
	}

}
