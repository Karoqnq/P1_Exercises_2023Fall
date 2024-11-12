package week_1;

import java.util.Scanner;

public class SalesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter price: ");
		int price = Integer.parseInt(input.nextLine());

		System.out.print("Enter product name: ");
		String productName = input.nextLine();

		System.out.print("Enter discount: ");
		int discount = Integer.parseInt(input.nextLine());
		
		int finalPrice = price - discount;
		
		System.out.println();
		System.out.println( "The selling price of a " + productName + " is " + finalPrice + " euros.");

		input.close();
	}

}
