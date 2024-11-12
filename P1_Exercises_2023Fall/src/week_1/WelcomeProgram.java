package week_1;

import java.util.Scanner;

public class WelcomeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name: ");
		String firstName = input.nextLine();

		System.out.print("Enter title: ");
		String title = input.nextLine();

		System.out.print("Enter phrase: ");
		String phrase = input.nextLine();

		System.out.println();
		System.out.println(phrase + " " + title + " " + firstName);

		input.close();
	}

}
