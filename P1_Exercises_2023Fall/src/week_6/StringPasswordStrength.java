package week_6;

import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = input.nextLine();
		System.out.print("Enter password: ");
		String password = input.nextLine();

		if (checkStrength(username, password)) {
			System.out.println("OK");
		}

		else {
			System.out.println("NOT OK");
		}
		
		input.close();

	}

	public static boolean checkStrength(String username, String password) {

		if (password.length() < 9) {
			return false;
		}

		if (password.toLowerCase().contains(username.toLowerCase())) {
			return false;
		}

		return true;
		
	}
	
}
