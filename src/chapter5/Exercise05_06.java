package chapter5;

public class Exercise05_06 {

	public static void main(String[] args) {

		System.out.println("Mil" + "\t\tKilometre" + "\t | " + "\tKilometre" + "\tMil");

		for (int mil = 1, km = 20; mil <= 10 && km <= 65; mil++, km += 5) {
			double milToKm = mil * 1.609;
			double KmToMil = km * (12.430 / 20);
			System.out.printf("%d\t\t%.3f \t\t | \t%d\t\t%.3f", mil, milToKm, km, KmToMil);
			System.out.println();

		}
	}
}
