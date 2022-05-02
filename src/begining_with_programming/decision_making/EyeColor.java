package begining_with_programming.decision_making;

import java.util.Scanner;

public class EyeColor {
	// T.C - O(1), S.C - O(1)
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		char ch1 = scanner.next().charAt(0);
		char ch2 = scanner.next().charAt(0);
		if (ch1 == 'R' || ch2 == 'R')
			System.out.println("R");
		else if (ch1 == 'B' || ch2 == 'B')
			System.out.println("B");
		else if (ch1 == 'G' || ch2 == 'G')
			System.out.println("G");
	}
}
