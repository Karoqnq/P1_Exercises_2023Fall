package week_4;

import java.util.Scanner;

public class MethodsTriplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a positive integer: ");
		int positiveNum = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= positiveNum; i++) {
			int triplexResult = triplex(i);
			System.out.println("Triplex(" + i + " ) = " + triplexResult);

			input.close();
		}
	}

	public static int triplex(int positiveNum) {
	    int result = 1;
	    for (int i = 1; i <= positiveNum; i += 3) {
	        result *= i;
	    }
	    if (positiveNum % 3 != 0) {
	        result *= (positiveNum % 3 + 1);
	    }
	    return result;
	}
}