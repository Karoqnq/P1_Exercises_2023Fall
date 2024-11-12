package week_6;

import java.util.Scanner;

public class StringUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter given name: ");
		String givenName = input.nextLine();
		System.out.print("Enter surname: ");
		String surname = input.nextLine();

		String username = createUsername(surname, givenName);

		if (username != null) {
			System.out.println(username);
		} else {
			System.out.println("Not enough letters to create a username!");
		}
		
		input.close();

	}

	 public static String createUsername(String surname, String givenName) {
        if (givenName.length() >= 2 && surname.length() >= 3) {
            String username = surname.substring(surname.length() - 3).toLowerCase() +
                              givenName.substring(0, 2).toLowerCase();
            return username;
        } else {
            return null;
        }
    }
}
