package chapter5;

public class Exercise05_24 {

	public static void main(String[] args) {

		double sum = 0;
		for (double i = 1; i <= 97; i += 2) {
			sum +=i / (i+2);
		}
		System.out.println("sum s series :" + sum);
	}

}
