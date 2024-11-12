package week_3;

import java.util.Scanner;

public class ValidateOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an odd number: ");
		String number = input.nextLine();

		try {

			int oddNumber = Integer.parseInt(number);

			if (oddNumber % 2 == 1) {

				System.out.println();
				System.out.println("Ok");

			}

			else {

				System.out.println();
				System.out.println( oddNumber + " is not an odd number");
			}
		}

		catch (NumberFormatException nfe) {
			System.out.println();
			System.out.println("'" + number + "' is not an integer");
			
			input.close();
		}

	}
}