package week_7;

import java.util.Scanner;

public class StringsStrongPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your password: ");
		String password = input.nextLine();

		boolean isStrong = checkStrength(password);

		if (isStrong) {
			System.out.println("OK");
		} else {
			System.out.println("Not strong enough!");
		}

		input.close();
	}

	public static boolean checkStrength(String password) {
		
		if (password.length() < 8) {
			return false;
		}

		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;
		boolean hasOther = false;

		for (char c : password.toCharArray()) {
			
			if (Character.isUpperCase(c)) {
				hasUpperCase = true;
				
			} else if (Character.isLowerCase(c)) {
				hasLowerCase = true;
				
			} else if (Character.isDigit(c)) {
				hasDigit = true;
				
			} else {
				hasOther = true;
			}
		}

		int categoriesCount = 0;
		
		if (hasUpperCase) {
			categoriesCount++;
		}
		
		if (hasLowerCase) {
			categoriesCount++;
		}
		
		if (hasDigit) {
			categoriesCount++;
		}
		
		if (hasOther) {
			categoriesCount++;
		}

		return categoriesCount >= 3;
	}
}
