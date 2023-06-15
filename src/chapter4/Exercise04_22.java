package chapter4;

import java.util.Scanner;

public class Exercise04_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter two string : ");
		String str1 = input.nextLine();
		String str2 = input.nextLine();

		if (str1.contains(str2) == true) {
			System.out.println(str2 + " is a substring of " + str1);

		} else {
			System.out.println(str2 + " is not a substring of " + str1);
		}

	}

}
