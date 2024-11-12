package week_1;

import java.util.Scanner;

public class ArithmeticProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int integer = Integer.parseInt(input.nextLine());

		System.out.print("Enter another integer: ");
		int anotherInt = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter a decimal number: ");
		double decimalNum = Double.parseDouble(input.nextLine().replace(',','.'));
		
		int sum1 = integer * anotherInt;
		double sum2 = integer * decimalNum;
		double sum3 = decimalNum * decimalNum; 
		
		System.out.println();
		System.out.println( integer + " * " + anotherInt + " = " + sum1  );
		System.out.println( integer + " * " + decimalNum + " = " + sum2 );
		System.out.println( decimalNum + " * " + decimalNum + " = " + sum3 );
		
		input.close();
		
	}

}

