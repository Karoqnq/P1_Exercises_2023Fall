package week_5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIteration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numberArray = new int[5];

		for (int i = 0; i < numberArray.length; i++) {
			System.out.print("Enter an integer: ");
			numberArray[i] = Integer.parseInt(input.nextLine());

		}

		Arrays.sort(numberArray);
		int temp = 0;
		
		for( int i = 0; i < numberArray.length/2; i++ ) 
		{ 
		  temp = numberArray[i]; 
		  numberArray[i] = numberArray[numberArray.length - i - 1]; 
		  numberArray[numberArray.length - i - 1] = temp;
		}
		
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i] + " ");
			
		}
		
		input.close();
	}
}
