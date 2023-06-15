package chapter4;

import java.util.Scanner;

public class Exercise04_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter two characters:");
		String letter = input.next();

		char major = Character.toUpperCase(letter.charAt(0));
		char status = letter.charAt(1);

		switch (major) {
		case 'M' :
			System.out.print("Mathematics ");
			break;
		case 'C':
			System.out.print("Computer Science ");
			break;
		case 'I':
			System.out.print("Information Techonology ");
			
		default:
			System.out.println("Invalid input");
			System.exit(1);
		}
		switch (status) {
		case '1':
			System.out.print("Freshman");
			break;
		case '2':
			System.out.print("Sophomore");
			break;
		case '3':
			System.out.print("Junior");
			break;
		case '4':
			System.out.print("Senior");
	
		default:
			System.out.println("Invalid input");
		}
	}

}
