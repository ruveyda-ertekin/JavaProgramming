package chapter5;

public class Exercise05_07 {

	public static void main(String[] args) {

		double currentPrice = 10000;
		double last4Year = 0;
		for (int year = 1; year < 15; year++) {

			double rate = currentPrice * 0.05;
			System.out.printf(year + ". Rate : %.3f\n", rate);
			currentPrice = currentPrice + rate;

			System.out.printf(year + ". Year Price = %.3f\n", currentPrice);

			if (year > 10) {

				last4Year = last4Year + currentPrice;
				
				if(year == 14) {
					System.out.printf("Total of last 4 years' fees : %.3f \n", last4Year);
				}

			}

		}
	}
}
