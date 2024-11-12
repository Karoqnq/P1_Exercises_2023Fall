package week_4;

public class MethodsWarmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNumbers();

	}

	private static void printNumbers() {

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		for (int i = 50; i >= 1; i--) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
}