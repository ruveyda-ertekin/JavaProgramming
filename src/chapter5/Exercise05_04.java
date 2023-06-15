package chapter5;

public class Exercise05_04 {

	public static void main(String[] args) {
		
		System.out.println("Mil" + "\tKilometre");
		
		for (int mil = 1; mil < 11; mil ++) {
			double milToKm = mil * 1.609; 
			System.out.printf("%d\t%.3f ", mil , (milToKm));
			System.out.println();
		}

	}

}
