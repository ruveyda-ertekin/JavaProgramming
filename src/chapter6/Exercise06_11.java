package chapter6;

public class Exercise06_11 {

	public static void main(String[] args) {

		System.out.println("Sales Amount \t Commisson");
		System.out.println("----------------------------");

		for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			System.out.printf("%6.0f  %17.1f\n", salesAmount, computeCommission(salesAmount));
		}
	}

	public static double computeCommission(double salesAmount) {

		double comRate;
		if (salesAmount >= 0.01 && salesAmount <= 5000) {
			comRate = salesAmount * 0.08;
		} else if (salesAmount >= 5000.01 && salesAmount <= 10000) {
			comRate = 400 + (salesAmount - 5000) * 0.10;
		} else if (salesAmount >= 10000.01) {
			comRate = 900 + (salesAmount - 10000) * 0.12;
		} else {
			comRate = 0;
		}
		return comRate;
	}
}
