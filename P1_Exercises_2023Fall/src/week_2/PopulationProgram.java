package week_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PopulationProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		System.out.print("Enter the population of the area A: ");
		int popA = Integer.parseInt(input.nextLine());

		System.out.print("Enter the population of the area B: ");
		int popB = Integer.parseInt(input.nextLine());

		System.out.print("Enter the population of the area C: ");
		int popC = Integer.parseInt(input.nextLine());
		
		double popSum = popA + popB + popC;
		double popAPercentage = popA / popSum * 100;
		double popBPercentage = popB / popSum * 100;
		double popCPercentage = popC / popSum * 100;
		
		System.out.println();
		System.out.println("A: " + oneDecimal.format(popAPercentage) + " %");
		System.out.println("B: " + oneDecimal.format(popBPercentage) + " %");
		System.out.println("C: " + oneDecimal.format(popCPercentage) + " %");
		
		input.close();
	}

}
