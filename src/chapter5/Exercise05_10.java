package chapter5;

public class Exercise05_10 {

	public static void main(String[] args) {

		int count = 1;

		for (int i = 100; i < 10001; i++) {

			if (i % 2 == 0 && i % 6 == 0) {
				System.out.printf("%-6d", i);

				if (count % 10 == 0) {
					System.out.println();

				}

				count++;
			}
		}

	}

}
