package week_6;
import java.util.Scanner;

public class RegexLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String vowelString = input.nextLine();

		if (vowelString.matches("[AEIOUYÄÖÅaeiouyäöå]+") == false) {
			System.out.println("Not only vowels!");
		} else {
			System.out.println("Vowels only");
		}
		
		input.close();
	}
	
}
