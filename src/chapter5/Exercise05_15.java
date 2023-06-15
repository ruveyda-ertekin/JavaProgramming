package chapter5;

public class Exercise05_15 {

	public static void main(String[] args) {

		int count = 1;

		for (int code = 33; code < 127; code++) {

			System.out.printf("%-2c", (char) code);

			if (count % 10 == 0) {
				System.out.println();

			}

			count++;
		}

	}

}
