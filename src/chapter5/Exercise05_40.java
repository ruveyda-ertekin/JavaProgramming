package chapter5;

import java.util.Scanner;

public class Exercise05_40 {

	public static void main(String[] args) {

		int flip;

		int heads = 0;
		int tails = 0;

		for (int i = 0; i < Math.pow(10, 6); i++) {

			flip = (int) (Math.random() * 2);

			if (flip == 0) {
				heads++;
			} else if (flip == 1) {
				tails++;
			}
		}
		System.out.println("Total heads: " + heads);
		System.out.println("Total tails: " + tails);

	}
}
