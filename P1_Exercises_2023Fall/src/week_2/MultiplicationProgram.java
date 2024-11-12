package week_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplicationProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x: ");
		String xDecimal = input.nextLine().replace(',', '.');
		BigDecimal x = new BigDecimal(xDecimal);

		System.out.print("Enter y: ");
		String yDecimal = input.nextLine().replace(',', '.');
		BigDecimal y = new BigDecimal(yDecimal);

		BigDecimal sum = x.multiply(y);

		System.out.println();
		System.out.println(x + " * " + y + " = " + sum);

		input.close();
	}

}