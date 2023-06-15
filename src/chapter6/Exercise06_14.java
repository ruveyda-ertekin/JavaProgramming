package chapter6;

public class Exercise06_14 {

	public static void main(String[] args) {

		System.out.printf("%4.1s %19.4s\n ", "i", "m(i)");
		System.out.println("---------------------------");

		for (int i = 1; i <= 901; i += 100) {

			System.out.printf("%4d %20.4f\n", i, estimatePi(i));
		}

	}

	public static double estimatePi(double num) {
		double m = 0;
		for (double i = 1; i <= num; i++) {
			m += (Math.pow(-1, i + 1)) / ((2 * i) - 1);

		}
		return 4 * m;
	}
}
