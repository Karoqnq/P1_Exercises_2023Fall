package week_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		int sum = 0;
		int count = 0;
		boolean firstInput = true;

		System.out.print("Enter first integer: ");
		int number = Integer.parseInt(input.nextLine());

		while (number != 0) {
			if (number > 0) {
				sum = sum + number;
				count++;
			}

			if (firstInput) {
				firstInput = false;
			}

			System.out.print("Enter next integer: ");
			number = Integer.parseInt(input.nextLine());
		}

		if (count > 0) {
			double average = (double) sum / count;
			System.out.println();
			System.out.println("The average of the positive values is " + oneDecimal.format(average));
		}

		else {
			System.out.println();
			System.out.println("No positive values");
		}

		input.close();
	}
}