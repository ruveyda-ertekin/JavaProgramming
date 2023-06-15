package chapter5;

import java.util.Scanner;

public class Exercise05_29 {

	public static void main(String[] args) {

		// TODO

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year :");
		int year = input.nextInt();

		System.out.print("Enter the first day of the year (Monday-1 Tuesday-2..) :");
		int firstDay = input.nextInt();

		int day = 0;

		for (int month = 1; month <= 12; month++) {

			String monthName = "";
			switch (month) {
			case 1:
				monthName = "January";
				day = 31;
				break;
			case 2:
				monthName = "February";

				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					day = 28;
				} else {
					day = 29;
				}
				break;
			case 3:
				monthName = "March";
				day = 31;
				break;
			case 4:
				monthName = "April";
				day = 30;
				break;
			case 5:
				monthName = "May";
				day = 31;
				break;
			case 6:
				monthName = "June";
				day = 30;
				break;
			case 7:
				monthName = "July";
				day = 31;
				break;
			case 8:
				monthName = "August";
				day = 31;
				break;
			case 9:
				monthName = "September";
				day = 30;
				break;
			case 10:
				monthName = "October";
				day = 31;
				break;
			case 11:
				monthName = "November";
				day = 30;
				break;
			case 12:
				monthName = "December";
				day = 31;
				break;

			}

			String dayName = "";
			switch (firstDay) {

			case 0:
				dayName = "Sunday";
				break;
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;
			}

			System.out.println("\t\t" + monthName + " " + year);
			System.out.println("--------------------------------------------");
			System.out.println("Sun\t" + "Mon\t" + "Tue\t" + "Wed\t" + "Fri\t" + "Sat");
			System.out.println(dayName);
			firstDay = (firstDay + day) % 7;

		}

	}

}
