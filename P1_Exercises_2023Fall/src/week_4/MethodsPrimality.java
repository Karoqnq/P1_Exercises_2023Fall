package week_4;

import java.util.Scanner;

public class MethodsPrimality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int positiveNum = Integer.parseInt(input.nextLine());

		boolean foundNonPrimes = false;

		for (int i = 1; i < positiveNum; i++) {
			if (!isPrime(i)) {
				System.out.print(i + " ");
				foundNonPrimes = true;
			}
		}

		if (!foundNonPrimes) {
			System.out.print("Nothing to be printed");
		}

		input.close();

	}

	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}

		// (for me) start from 2 because any number / by 1 doesn't leave a remainder
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
