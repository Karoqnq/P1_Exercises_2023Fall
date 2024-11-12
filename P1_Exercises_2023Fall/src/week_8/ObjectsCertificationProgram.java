package week_8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ObjectsCertificationProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		Coach[] coachesArray = new Coach[4];

		for (int i = 0; i < coachesArray.length; i++) {
			System.out.print("Enter coach name: ");
			String name = input.nextLine();
			System.out.print("Enter " + name + "'s score: ");
			int score = Integer.parseInt(input.nextLine());

			coachesArray[i] = new Coach(name, score);
		}

		System.out.println();

		System.out.print("Enter the minimum passing score: ");
		int minimumScore = Integer.parseInt(input.nextLine());

		System.out.println();

		double passedCount = 0;

		System.out.println("Passing scores");
		for (Coach coach : coachesArray) {
			if (coach.getScore() >= minimumScore) {
				System.out.println(coach.getName() + " (" + coach.getScore() + " points)");
				passedCount++;
			}
		}

		double passingRate = passedCount / coachesArray.length * 100;
		System.out.println("The passing rate is " + oneDecimal.format(passingRate).replace(',','.') + " %");

		input.close();
	}
	
}
