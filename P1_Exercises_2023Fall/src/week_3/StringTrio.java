package week_3;

import java.util.Scanner;

public class StringTrio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String first = input.nextLine();

		System.out.print("Enter second string: ");
		String second = input.nextLine();

		System.out.print("Enter third string: ");
		String third = input.nextLine();

		if (first.equals(second) && second.equals(third)) {

			System.out.println("The strings are equal in case-sensitive comparison");
		}

		else if (first.equalsIgnoreCase(second) && second.equalsIgnoreCase(third)) {

			System.out.println("The strings are equal in case-insensitive comparison");
		} 
		
		else {

			System.out.println("The strings are not equal");
		}
		
		input.close();
	}
}