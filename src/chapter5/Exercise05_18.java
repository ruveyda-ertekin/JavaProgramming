package chapter5;

public class Exercise05_18 {

	public static void main(String[] args) {

		System.out.println("Pattern A");
		for (int number = 1; number <= 6; number++) {

			for (int line = 1; line <= number; line++) {
				System.out.print(line + " ");

			}
			System.out.println();
		}

		System.out.print("\n*****************\n");

		System.out.println("Pattern B");
		for (int number = 6; number >= 1; number--) {

			for (int line = 1; line <= number; line++) {
				System.out.print(line + " ");
			}
			System.out.println();
		}
		System.out.println("\n***************\n");

		System.out.println("Pattern C");

		int line = 6;

		for (int row = 1; row <= line; row++) {

			for (int space = line; space > row; space--) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			System.out.println();

		}
		System.out.println("\n***************\n");
		System.out.println("Pattern D");
		for (int row = 1; row <= 6; row++) {

			for (int space = row; space > 1; space--) {
				System.out.print("  ");
			}
			for (int num = 1; num <= line; num++) {
				System.out.print(num + " ");
			}
			line--;

			System.out.println();
		}
	}
}
