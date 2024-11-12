package week_5;

import java.util.Scanner;

public class ArraysCandidates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int numOfCan = Integer.parseInt(input.nextLine());
		String[] candidates = new String[numOfCan];
		int[] votes = new int[numOfCan];

		for (int i = 0; i < candidates.length; i++) {
			System.out.print("Enter name: ");
			candidates[i] = input.nextLine();
			System.out.print("Enter " + candidates[i] + "'s votes: ");
			votes[i] = Integer.parseInt(input.nextLine());
		}

		int mostVotes = 0;
		String winner = "";

		for (int i = 0; i < votes.length; i++) {
			if (votes[i] > mostVotes) {
				mostVotes = votes[i];
				winner = candidates[i];
			}
		}

		System.out.println();
		if (countWinners(votes, mostVotes) > 1) {
			System.out.println("It is a tie!");

			for (int i = 0; i < candidates.length; i++) {
				if (votes[i] == mostVotes) {
					System.out.println(candidates[i] + " (" + mostVotes + " votes)");
				}
			}
		}

		else {
			System.out.println(winner + " is the winner with " + mostVotes + " votes!");

		}

		input.close();
	}

	public static int countWinners(int[] array, int number) {
		int count = 0;
		for (int value : array) {
			if (value == number) {
				count++;
			}
		}
		return count;
	}
}
