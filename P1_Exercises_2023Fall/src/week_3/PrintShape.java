package week_3;

import java.util.Scanner;

public class PrintShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());

		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());

		System.out.println();

		for (int i = 1; i <= height; i++) {
			for (int y = 1; y <= width; y++) {
				System.out.print("*");
			}

			System.out.println();

		}
		
		input.close();
	}

}
