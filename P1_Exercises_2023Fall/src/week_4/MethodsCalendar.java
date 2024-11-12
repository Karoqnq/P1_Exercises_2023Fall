package week_4;

import java.time.LocalDate;
import java.util.Scanner;

public class MethodsCalendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = Integer.parseInt(input.nextLine());
		System.out.print("Enter month: ");
		int month = Integer.parseInt(input.nextLine());

		if (month >= 1 && month <= 12) {
			printCalendar(month, year);
		}
		
		input.close();
	}

	public static void printCalendar(int month, int year) {

		String[] months = { "Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu", "Kesäkuu", "Heinäkuu",
				"Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu" };

		LocalDate myDate = LocalDate.of(year, month, 1);
		int daysInMonth = myDate.lengthOfMonth();
		System.out.println(" > " + months[month - 1] + " " + year + " < ");
		System.out.println(" Ma Ti Ke To Pe La Su");

		for (int i = 1; i <= daysInMonth; i++) {
			System.out.printf("%3d", i);
		}

		System.out.println();

	}

}
