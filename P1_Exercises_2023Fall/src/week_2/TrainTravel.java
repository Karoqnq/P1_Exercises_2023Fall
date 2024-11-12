package week_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter the number of train trips: ");
		int numTrips = Integer.parseInt(input.nextLine());

		System.out.print("Enter the single ticket price: ");
		double singleTicket = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter the monthly season ticket price: ");
		double monthlyTicket = Double.parseDouble(input.nextLine().replace(',', '.'));

		double singleSum = numTrips * singleTicket;
		double singleCheap = monthlyTicket - singleSum;
		double monthlyCheap = singleSum - monthlyTicket;
		
		System.out.println();
		
		if (monthlyTicket < singleSum) {

			System.out.println("Buying a monthly ticket is " + twoDecimals.format(monthlyCheap) + " euros cheaper.");

		}

		else if (monthlyTicket > singleSum) {

			System.out.println("Buying single tickets is " + twoDecimals.format(singleCheap) + " euros cheaper");

		}

		else {

			System.out.println("They're the same amount");
		}
		
		input.close();

	}
}
