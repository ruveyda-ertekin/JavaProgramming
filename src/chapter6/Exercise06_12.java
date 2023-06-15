package chapter6;

public class Exercise06_12 {

	public static void main(String[] args) {

		printChars('1', 'Z', 10);

	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {

		int counter = 1;

		for (char ch = ch1; ch <= ch2; ch++) {

			if (counter % numberPerLine == 0) {

				System.out.printf((char) ch + "\n");

			} else {

				System.out.printf((char) ch + " ");

			}
			counter++;
		}

	}

}
