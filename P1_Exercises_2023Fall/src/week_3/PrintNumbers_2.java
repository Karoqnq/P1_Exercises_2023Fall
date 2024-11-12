package week_3;

import java.util.Scanner;

public class PrintNumbers_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the middle number: ");
		int middleNum = Integer.parseInt(input.nextLine());
		
		int totalCount = 0;
		
		for (int i = 1; i <= middleNum; i++) {
			System.out.print(i + " ");
			totalCount++;
		}

		for (int i = 1; i < middleNum; i++) {
			System.out.print(middleNum - i + " ");
			totalCount++;
		}

		System.out.println();

		if (totalCount != 1) {

			System.out.println(totalCount + " numbers printed");
		}

		else {
			System.out.println(totalCount + " number printed");
		}

		input.close();
	}

}