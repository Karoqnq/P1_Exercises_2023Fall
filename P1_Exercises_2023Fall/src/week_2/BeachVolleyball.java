package week_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BeachVolleyball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter the number of people: ");
		int people = Integer.parseInt(input.nextLine());

		System.out.print("Enter the hourly rate: ");
		double hourlyRate = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter the length of the rental (hours): ");
		int hours = Integer.parseInt(input.nextLine());
		
		double sum = hours * hourlyRate;
		double perPerson = sum / people;
		
		System.out.println();
		
		System.out.println("Each of the " + people + " people should pay " + twoDecimals.format(perPerson) + " euros.");
		
		input.close();
		
	}

}
