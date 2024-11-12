package week_2;

import java.util.Scanner;

public class DivisionAndReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = Integer.parseInt(input.nextLine());

		System.out.print("Enter y: ");
		int y = Integer.parseInt(input.nextLine());
		
		System.out.println();
		
		if (x % 2 == 0) {
			System.out.println(x + " is even");
		}
		
		else {
			System.out.println(x + " is odd");
			
		}
		
		if (y % 2 == 0) {
			System.out.println(y + " is even");
		}
		
		else {
			System.out.println(y + " is odd");
		}
	
		System.out.println("The remainder of " + x + " / " + y + " is " + x % y);
		System.out.println("The remainder of " + y + " / "+ x + " is " + y % x);
		
		input.close();
	}

}
