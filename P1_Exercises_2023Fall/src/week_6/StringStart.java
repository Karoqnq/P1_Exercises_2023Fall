package week_6;

import java.util.Scanner;

public class StringStart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		System.out.println();
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
		System.out.println(string.length());
		
		input.close();
		
	}
		
}
