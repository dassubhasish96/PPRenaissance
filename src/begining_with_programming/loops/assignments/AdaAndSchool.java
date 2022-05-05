package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class AdaAndSchool {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			if ((N * M) % 2 == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
