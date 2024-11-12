package week_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FixedTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter initial deposit: ");
		double initialDeposit = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter time period in full years: ");
		int years = Integer.parseInt(input.nextLine());

		System.out.print("Enter interest rate (%): ");
		double interestRate = Double.parseDouble(input.nextLine().replace(',', '.')) / 100;

		System.out.print("Enter capital income tax rate (%): ");
		double taxRate = Double.parseDouble(input.nextLine().replace(',', '.')) / 100;

		System.out.println();

		double balance = initialDeposit;
		double interest = 0;
		double totalInterest = 0;

		for (int i = 1; i <= years; i++) {

			interest = balance * interestRate;
			balance += interest;
			totalInterest += interest;

			System.out.println(
					"Year " + i + ": " + twoDecimals.format(totalInterest) + " | " + twoDecimals.format(balance));

		}

		double interestAfterTax = totalInterest - (totalInterest * taxRate);
		double balanceAfterTax = interestAfterTax + initialDeposit;

		System.out.println();
		System.out.println("The interest after tax is " + twoDecimals.format(interestAfterTax));
		System.out.println("The remaining balance after tax is " + twoDecimals.format(balanceAfterTax));

		input.close();
	}

}
