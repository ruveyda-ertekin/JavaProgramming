package chapter6;

import java.io.ObjectInputStream.GetField;

public class Exercise06_13 {

	public static void main(String[] args) {

		System.out.printf("%3.1s %19.4s\n ", "i", "m(i)");
		System.out.println("---------------------------");

		for (int i = 1; i <= 20; i++) {
			System.out.printf("%3d %20.4f\n", i, sumSeries(i));
		}
	}

	public static double sumSeries(int num) {
		double m = 0;

		for (double i = 1; i <= num; i++) {
			m += i / (i + 1);

		}
		return m;
	}

}
