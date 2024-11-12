package week_6;

import java.util.Scanner;

public class RegexStudentNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student number: ");
		String studentNumber = input.nextLine();

		if (studentNumber.matches("^2[0-9]{8}") == false) {
			System.out.println("Invalid student number");
		} else {
			System.out.println("Ok");
		}
		
		input.close();
	}
}