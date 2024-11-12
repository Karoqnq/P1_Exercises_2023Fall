package week_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter list price: ");
		double listPrice = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter selling price: ");
		double sellingPrice = Double.parseDouble(input.nextLine().replace(',', '.'));

		double discountPercentage = computePercentage(listPrice, sellingPrice);
		
		System.out.println();

		System.out.println("The discount percentage is " + twoDecimals.format(discountPercentage) + " %");

		computePercentage(listPrice, sellingPrice);
		
		input.close();

	}

	private static double computePercentage(double listPrice, double sellingPrice) {

		return ((listPrice - sellingPrice) / listPrice) * 100;

	}
}