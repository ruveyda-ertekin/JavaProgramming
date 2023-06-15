package chapter4;

import java.util.Scanner;

public class Exercise04_16 {

	public static void main(String[] args) {

		int randomNum = 65 + (int) (Math.random() * 26);
		
		System.out.println("Random Number: " + randomNum + " UpperCase: " + (char)randomNum );

	}

}
