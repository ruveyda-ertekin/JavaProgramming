package chapter5;

public class Exercise05_25 {

	public static void main(String[] args) {

		double sum = 0;
		for (int i = 10000; i <= 100000; i += 10000) {
			sum = 0;
			for (int n = 1; n <= i; n++) {
				sum += (Math.pow(-1, i + 1)) / ((2 * i) - 1);

			}

			System.out.println("i = " + i + " ==> " + (4 * sum));
		}
	}
}