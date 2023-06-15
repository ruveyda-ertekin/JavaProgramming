package chapter3;

import java.util.Scanner;

public class Exercise03_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package: ");
		double w = input.nextDouble();
		
		if ( 0 < w && w <= 1 ) {
			System.out.println("Cost is 3.5");
		} else if (1 < w && w <= 3) {
			System.out.println("Cost is 5.5");
		} else if (3 < w && w <= 10) {
			System.out.println("Cost is 8.5");
		} else if (10 < w && w <= 20) {
			System.out.println("Cost is 10.5");
		} else if (w > 50) {
			System.out.println("The package cannot be shipped.");
			System.exit(0);
		}
		

	}

}
