package chapter2;

import java.util.Scanner;

public class Exercise02_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double pound = input.nextDouble();
		
		double kilograms = pound * 0.454;
		
		System.out.println( pound + " pounds is " + kilograms + " kilograms.");

	}

}
