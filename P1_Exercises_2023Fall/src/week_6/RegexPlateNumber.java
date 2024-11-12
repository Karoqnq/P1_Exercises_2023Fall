package week_6;

import java.util.Scanner;

public class RegexPlateNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter plate number: ");
		String plateNumber = input.nextLine();

		if (plateNumber.matches("[A-Z]{3}(-)[0-9]{3}") == false) {
			System.out.println("Invalid plate number");
		} else {
			System.out.println("OK");
		}
		
		input.close();

	}

}
