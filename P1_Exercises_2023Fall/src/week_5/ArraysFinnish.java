package week_5;

import java.util.Scanner;

public class ArraysFinnish {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an English word: ");
		String englishWord = input.nextLine();

		String[] finnish = { "bussi", "auto", "kissa", "talo", "kuu", "aurinko", "kiitos", "juna", "opettaja" };
		String[] english = { "bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher" };

		boolean wordFound = false;
		for (int i = 0; i < english.length; i++) {

			if (englishWord.equals(english[i])) {
				System.out.println(finnish[i]);
				wordFound = true;
			}
		}

		if (!wordFound) {
			System.out.println("Unknown word");

		}
		input.close();
	}

}
