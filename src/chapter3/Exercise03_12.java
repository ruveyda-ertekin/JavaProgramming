package chapter3;

import java.util.Scanner;

public class Exercise03_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int num = input.nextInt();
		
		int digit1 = num / 100 ;
		int digit2 = (num % 100) / 10;
		int digit3 = (num % 10);
		
		int newNum = (digit3 * 100) + (digit2 * 10) + digit1;
		
		
		if (num == newNum) {
			System.out.println(newNum + " is a palindrome.");
		}
			else {
			System.out.println(num + " is not a palindrome.");
		}
		
	}

}
