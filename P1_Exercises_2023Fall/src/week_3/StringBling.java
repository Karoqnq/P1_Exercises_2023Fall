package week_3;

import java.util.Scanner;

public class StringBling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String longestWord = "";
		boolean firstInput = true;

		System.out.print("Enter first string: ");
		String word = input.nextLine();

		while (true) {

			if (word.equals("stop")) {
				input.close();
				break;
			}

			if (word.length() > longestWord.length()) {
				longestWord = word; 
			}

			if (firstInput) {
				firstInput = false;
			}

			System.out.print("Enter next string: ");
			word = input.nextLine();

		}

		if (firstInput) {
			System.err.println();
			System.out.println("Nothing to be printed");
		}

		else {
			System.out.println();
			System.out.println("'" + longestWord + "'");;
		}
	}
}