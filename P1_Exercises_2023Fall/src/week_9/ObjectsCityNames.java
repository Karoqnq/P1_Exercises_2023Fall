package week_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsCityNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> cities = new ArrayList<>();

		System.out.print("Enter city name: ");
		String cityName = input.nextLine();

		while (!cityName.equals("quit")) {
			cities.add(cityName);
			System.out.print("Enter city name: ");
			cityName = input.nextLine();
		}

		System.out.println();
		Collections.sort(cities);

		for (String city : cities) {
			System.out.println(city.toUpperCase());

		}
		
		input.close();
	}
}
