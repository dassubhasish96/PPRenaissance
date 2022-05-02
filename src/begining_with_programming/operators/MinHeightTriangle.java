package begining_with_programming.operators;

import java.util.Scanner;

public class MinHeightTriangle {
	// T.C - O(1), S.C - O(1)
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		int a = scanner.nextInt();
		float h = ((float) 2 * a) / b;
		float point = h - (int) h;
		if (point > 0) {
			System.out.println((int) h + 1);
		} else {
			System.out.println((int) h);
		}

	}
}
