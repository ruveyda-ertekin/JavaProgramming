package chapter2;

import java.util.Scanner;

public class Exercise02_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter a degree in Celcius :");
		
		double celcius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celcius + 32;
		
		System.out.println(celcius + " Celsius is " + fahrenheit + " Fahrenheit");
		

	}

}
