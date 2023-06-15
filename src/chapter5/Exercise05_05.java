package chapter5;

public class Exercise05_05 {
	public static void main(String[] args) {

		System.out.println("Kilogram" + "\tPound" + "\t\t | " + "\tPound" + "\t\tKilogram");

		for (int kg = 1, pound = 20; kg <= 199 && pound <= 515; kg += 2, pound += 5) {
			double kgToPound = kg * 2.2;
			double poundToKg = pound * (9.09 / 20);
			System.out.printf("%d\t\t%.1f \t\t | \t%d\t\t%.2f", kg, (kgToPound), pound, poundToKg);
			System.out.println();
		}

	}
}
