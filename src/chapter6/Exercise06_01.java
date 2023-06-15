package chapter6;

public class Exercise06_01 {

	public static void main(String[] args) {

		int n = 1;
		int count = 1;

		for (int i = 1; i <= 100; i++) {

			System.out.printf("%6d", getPentagonalNumber(i));

			if (count % 10 == 0) {
				System.out.println();

			}
			count++;
		}

	}

	public static int getPentagonalNumber(int n) {

		int pentagonalNumbers = (n * (3 * n - 1)) / 2;

		return pentagonalNumbers;

	}
}
