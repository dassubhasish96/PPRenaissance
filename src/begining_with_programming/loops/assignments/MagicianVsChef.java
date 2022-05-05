package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class MagicianVsChef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int S = scanner.nextInt();

		while (S-- > 0) {
			int pos1 = scanner.nextInt();
			int pos2 = scanner.nextInt();
			if (X == pos1)
				X = pos2;
			else if (X == pos2)
				X = pos1;
		}
		System.out.println(X);
	}
}
