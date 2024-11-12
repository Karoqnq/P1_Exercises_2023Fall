package week_8;

import java.util.Scanner;

import week_9.WordPair;

public class ObjectsTranslatorArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		WordPair[] wordArray = { new WordPair("bird", "lintu"), 
				new WordPair("bar", "baari"),
				new WordPair("bus", "bussi"), 
				new WordPair("car", "auto"), 
				new WordPair("cat", "kissa"),
				new WordPair("dog", "koira") };

		System.out.print("Enter an English word: ");
		String inputWord = input.nextLine();
		boolean wordFound = false;
		
		for (WordPair word : wordArray) {
			
			if (inputWord.equals(word.getEnglishWord())) {
				
				System.out.println(word.getFinnishWord());
				wordFound = true;
			}
			
		}

			if (!wordFound) {
				System.out.println("Unknown word");
			}
			
			input.close();
		}
	}


