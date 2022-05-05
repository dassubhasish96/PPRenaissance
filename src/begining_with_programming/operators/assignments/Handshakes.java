package begining_with_programming.operators.assignments;

import java.util.Scanner;

public class Handshakes {
	// T.C - O(1), S.C - O(1)
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println((long) n * (n - 1) / 2);
	}
}
