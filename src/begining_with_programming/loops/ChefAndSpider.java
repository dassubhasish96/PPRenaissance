package begining_with_programming.loops;

import java.util.Scanner;

public class ChefAndSpider {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = scanner.nextInt();
			int count = 0;
			int distance = 0;
			int step = 1;
			while (distance < N) {
				distance += step;
				count++;
				step += 9;
			}
			System.out.println("Case #" + i + ": " + count);
		}
	}
}
