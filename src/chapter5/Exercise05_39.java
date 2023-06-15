package chapter5;

public class Exercise05_39 {

	public static void main(String[] args) {

		// TODO

		double salesAmount = 0;
		double comRate;
		if (salesAmount >= 0.01 && salesAmount <= 5000) {
			comRate = salesAmount * 0.08;
		} else if (salesAmount >= 5000.01 && salesAmount <= 10000) {
			comRate = 400 + (salesAmount - 5000) * 0.10;
		} else if (salesAmount >= 10000.01) {
			comRate = 900 + (salesAmount - 10000) * 0.12;
		}else {
			comRate = 0;
		}

	}

}
