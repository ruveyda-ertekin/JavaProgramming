package chapter2;

import java.util.Scanner;

public class Exercise02_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int secondOfYear = 60 * 60 * 24 * 365;
		int birthOfYear = secondOfYear/ 7 ;
		int deathOfYear = secondOfYear/ 13 ;
		int immigrantOfYear = secondOfYear/ 45 ;
		
		int currentPopulation = 312032486;
		int changePopulation = birthOfYear + immigrantOfYear - deathOfYear ; 	
		
		System.out.println("Enter the number of years: ");
		int year = input.nextInt();
		
		System.out.println("The population in " + year + " years is " + (currentPopulation + (changePopulation * year)));

	}

}
