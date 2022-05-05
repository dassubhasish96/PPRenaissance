package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class TrapeziumLoop {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			int x = scanner.nextInt();
			System.out.println(360 / (180 - 2 * x));
		}
	}

}
