package chapter2;

import java.util.Scanner;

public class Exercise02_14 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		
		double  inches = height * 0.0254;
		double  pounds = weight * 0.45359237;
		
		double bmi = pounds / (inches * inches) ; 
		System.out.println("BMI is " + bmi); 


	}

}
