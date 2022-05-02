package begining_with_programming.decision_making;

import java.util.Scanner;

public class CompareTriplets {
	// T.C - O(1), S.C - O(1)
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int a0 = scanner.nextInt();
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int b0 = scanner.nextInt();
		int b1 = scanner.nextInt();
		int b2 = scanner.nextInt();
		int pointa = 0, pointb = 0;
		if (a0 > b0)
			pointa++;
		else if (b0 > a0)
			pointb++;

		if (a1 > b1)
			pointa++;
		else if (b1 > a1)
			pointb++;

		if (a2 > b2)
			pointa++;
		else if (b2 > a2)
			pointb++;

		System.out.println(pointa + " " + pointb);

	}
}
