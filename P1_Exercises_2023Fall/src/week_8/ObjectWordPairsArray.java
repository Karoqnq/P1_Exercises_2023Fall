package week_8;

import week_9.WordPair;

public class ObjectWordPairsArray {

	public static void main(String[] args) {

		WordPair[] wordArray = {
			new WordPair("school", "koulu"), 
			new WordPair("student", "opiskelija"),
			new WordPair("textbook", "oppikirja") };

		for (WordPair word : wordArray) {
			System.out.println(word);
		}
	}
}
