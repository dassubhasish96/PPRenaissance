package begining_with_programming.loops;

import java.util.Scanner;

public class CoinGame {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int pilesCount = scanner.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < pilesCount; i++) {
			int val = scanner.nextInt();
			if (i % 2 == 0)
				evenSum += val;
			else
				oddSum += val;
		}
		System.out.println(Math.min(evenSum, oddSum) * 2);
	}
}
