package week_3;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the middle number: ");
		int middleNum = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= middleNum; i++) {
			System.out.print(i + " ");

		}

		for (int i = 1; i < middleNum; i++)
			System.out.print(middleNum - i + " ");
		
		input.close();
	}

}
