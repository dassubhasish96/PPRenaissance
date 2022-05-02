package begining_with_programming.operators;

import java.util.Scanner;

public class FindPoint {
	// T.C - O(1), S.C - O(1)
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int px = scanner.nextInt();
		int py = scanner.nextInt();
		int qx = scanner.nextInt();
		int qy = scanner.nextInt();
		System.out.print(qx + (qx - px) + " " + (qy + (qy - py)));
	}
}
