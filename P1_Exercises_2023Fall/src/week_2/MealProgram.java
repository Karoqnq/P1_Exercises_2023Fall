package week_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MealProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		System.out.print("Enter the price of food: ");
		double price = Double.parseDouble(input.nextLine().replace(',','.'));

		System.out.print("Enter the tax rate: ");
		double taxRate = Double.parseDouble(input.nextLine().replace(',','.'));
		
		System.out.print("Enter the tip percentage: ");
		double tipPercentage = Double.parseDouble(input.nextLine().replace(',','.'));
		
		double tax = price * (taxRate / 100);
		double tip = price * (tipPercentage / 100);
		double sum = price + tax + tip;
		
		System.out.println();
		System.out.println("The total cost is " + twoDecimals.format(sum));
		
		input.close();
	}

}
