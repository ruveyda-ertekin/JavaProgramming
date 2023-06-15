package chapter6;

public class Exercise06_16 {

	public static void main(String[] args) {

		for (int year = 2000; year <= 2020; year++) {

			System.out.printf("%4d year : %1d days\n", year, numberOfDaysInAYear(year));
		}

	}

	public static int numberOfDaysInAYear(int year) {

		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		return leapYear ? 366 : 365;
	}

}
