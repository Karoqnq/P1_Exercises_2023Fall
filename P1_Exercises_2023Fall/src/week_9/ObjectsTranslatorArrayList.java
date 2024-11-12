package week_9;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsTranslatorArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<WordPair> words = new ArrayList<WordPair>();

		String englishWord = "";
		String finnishWord = "";

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		System.out.print("Enter an English word: ");
		englishWord = input.nextLine();

		while (!englishWord.equals("ok")) {
			System.out.print("Enter a finnish word: ");
			finnishWord = input.nextLine();

			WordPair pair = new WordPair(englishWord, finnishWord);
			words.add(pair);

			System.out.print("Enter an English word: ");
			englishWord = input.nextLine();
		}

		System.out.println("=== English-Finnish translation service (quit ends) ===");

		while (!englishWord.equals("quit")) {
			boolean found = false;
			System.out.println();

			System.out.print("Enter an English word: ");
			englishWord = input.nextLine();

			for (WordPair pair : words) {
				if (pair.getEnglishWord().equals(englishWord)) {
					System.out.println(pair.getFinnishWord());
					found = true;
					break;
				}
			}

			if (!found && !englishWord.equals("quit")) {
				System.out.println("Unknown word");
			}
		}

		System.out.println("Bye!");
		
		input.close();
	}
}
