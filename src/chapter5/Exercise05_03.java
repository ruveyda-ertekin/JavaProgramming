package chapter5;

public class Exercise05_03 {

	public static void main(String[] args) {
		
		System.out.println("Kilogram" + "\tPound");
		
		for (int kg = 1; kg < 200; kg += 2) {
			double kgToPound = kg * 2.2; 
			System.out.printf("%d\t\t%.1f ", kg , (kgToPound));
			System.out.println();
		}

	}

}
