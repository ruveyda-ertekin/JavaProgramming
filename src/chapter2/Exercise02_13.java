package chapter2;

import java.util.Scanner;

public class Exercise02_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount: ");
		double monthlySave = input.nextDouble();
		
		double firstValue = monthlySave * (1 + 0.00417);
		double secondValue = (firstValue + monthlySave) * (1 + 0.00417);
		double thirdValue = (secondValue + monthlySave) * (1 + 0.00417);
		double fourthValue = (thirdValue + monthlySave) * (1 + 0.00417);
		double fifthValue = (fourthValue + monthlySave) * (1 + 0.00417);
		double sixthValue =(fifthValue + monthlySave) * (1 + 0.00417);
			
		System.out.println("After the sixth month, the account value is $" + sixthValue);

	}

}
