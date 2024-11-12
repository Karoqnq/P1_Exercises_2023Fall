package week_6;

import java.util.Scanner;

public class StringCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = input.nextLine();

		int letterCount = 0;
		int digitCount = 0;
		int otherCount = 0;

		for (char c : string.toCharArray()) {

			if (Character.isLetter(c)) {
				letterCount++;
			}

			else if (Character.isDigit(c)) {
				digitCount++;
			}

			else {
				otherCount++;
			}
			
		}

		System.out.println(letterCount + " letter(s)");
		System.out.println(digitCount + " digit(s)");
		System.out.println(otherCount + " other character(s)");
		
		input.close();

	}
}
