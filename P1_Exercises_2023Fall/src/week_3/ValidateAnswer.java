package week_3;

import java.util.Scanner;

public class ValidateAnswer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int correctAnswer = 5;
		boolean answeredCorrectly = false;

		System.out.print("What is 2 + 3? ");
		String number = input.nextLine();
		
		while (!answeredCorrectly) {

			try {

				int answer = Integer.parseInt(number);

				if (answer == correctAnswer) {
					System.out.println("Correct!");
					answeredCorrectly = true;
				}

				else {
					System.out.println("Incorrect! Try again: ");
					number = input.nextLine();
				}
				
			} 
			
			catch (NumberFormatException nfe) {
				System.out.println("That is not a number! Try again: ");
				number = input.nextLine();
				
				input.close();
				
			}
		}
	}
}