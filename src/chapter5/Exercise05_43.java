package chapter5;

public class Exercise05_43 {

	public static void main(String[] args) {

		int comb = 0;
		for (int i = 1; i <= 7; i++) {
			for (int k = 1; k <= 7; k++) {
				if (i != k) {
					System.out.println(i + " " + k);
					comb++;
				}

			}
			System.out.println();

		}
		System.out.println("The total number of all combinations is " + comb);
	}

}
