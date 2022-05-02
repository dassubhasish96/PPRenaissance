package begining_with_programming.operators;

import java.util.Scanner;

public class GameWithCells {
	// T.C - O(1), S.C - O(1)
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		if (n % 2 == 0 && m % 2 == 0) {
			// e e
			System.out.println((n * m) / 4);
		} else if (n % 2 == 0 && m % 2 != 0) {
			// e o
			System.out.println((n * (m - 1)) / 4 + (n / 2));
		} else if (n % 2 != 0 && m % 2 == 0) {
			// o e
			System.out.println(((n - 1) * m) / 4 + (m / 2));
		} else {
			// o o
			System.out.println(((n - 1) * (m - 1)) / 4 + ((n + m) / 2));
		}
	}
}
