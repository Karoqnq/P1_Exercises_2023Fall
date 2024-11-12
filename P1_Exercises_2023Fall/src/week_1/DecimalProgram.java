package week_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		DecimalFormat sixDecimals = new DecimalFormat("0.000000");
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		double decimalNum = Double.parseDouble(input.nextLine().replace(',','.'));

		System.out.print("Enter a decimal number: ");
		double decimalNumTwo = Double.parseDouble(input.nextLine().replace(',','.'));

		double sum = decimalNum * decimalNumTwo;

		System.out.println();
		System.out.println(twoDecimals.format(decimalNum) + " * " + twoDecimals.format(decimalNumTwo) + " = " + twoDecimals.format(sum));
		System.out.println(twoDecimals.format(decimalNum) + " * " + twoDecimals.format(decimalNumTwo) + " = " + sixDecimals.format(sum));

		input.close();

	}
}
