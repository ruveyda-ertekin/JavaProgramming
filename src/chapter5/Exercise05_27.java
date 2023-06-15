package chapter5;

public class Exercise05_27 {

	public static void main(String[] args) {

		int count = 1;
		int leapYearCount = 0;

		for (int year = 101; year <= 2100; year++) {

			boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

			if (leapYear) {

				leapYearCount++;
				System.out.printf("%5d", year);

				if (count % 10 == 0) {
					System.out.println();

				}

				count++;

			}

		}
		System.out.println("\n\nTotal leap year: " + leapYearCount);

	}
}