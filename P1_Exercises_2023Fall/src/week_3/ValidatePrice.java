package week_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValidatePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		try {

			System.out.print("Enter the price before VAT: ");
			double priceBefore = Double.parseDouble(input.nextLine().replace(',', '.'));

			double priceAfter = priceBefore * 1.25;

			System.out.println();
			System.out.println("The VAT inclusive price is " + twoDecimals.format(priceAfter));
		}

		catch (NumberFormatException nfe) {
			System.out.println();
			System.out.println("Invalid price!");

			input.close();
		}

	}
}
