package chapter3;

import java.util.Scanner;

public class Exercise03_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter today's day : ");
		int day = input.nextInt();

		System.out.println("Enter the numbe of days elapsed since today :");
		int daysElapsed = input.nextInt();

		int futureDay = (day + daysElapsed) % 7;
		
		System.out.print("Today is ");
		switch (day) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			;
		}
		
		System.out.print(" and the future day is ");
		switch (futureDay) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			;
		}
		
		

	}

}
