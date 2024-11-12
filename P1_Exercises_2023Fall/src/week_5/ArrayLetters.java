package week_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		
		System.out.print("Enter a letter: ");
		String letter = input.nextLine();

		String[] letterArray = { "A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "B", "A", "C", "C", "C" };
		double count = 0;

		for (int i = 0; i < letterArray.length; i++) {

			if (letter.equals(letterArray[i])) {
				count = count + 1;
			}
		}

		double percentage = (count * 100) / letterArray.length;
		System.out.println(oneDecimal.format(percentage) + " %");
		
		input.close();
	}
		
}
