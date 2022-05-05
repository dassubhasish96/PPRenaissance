package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class CookingMachine {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			long s = scanner.nextLong();
			long d = scanner.nextLong();
			int count = 0;
			if (s < d) {
				long s1 = s, d1 = d;
				int count1 = 0;
				while (s1 < d1) {
					count1++;
					s1 *= 2;
				}
				while (!isPowerOf2(s)) {
					s /= 2;
					count++;
				}
				while (s != d) {
					s *= 2;
					count++;
				}
				if (s1 == d1)
					count = Math.min(count, count1);
			} else if (s > d) {
				while (!isPowerOf2(s)) {
					s /= 2;
					count++;
				}
				if (s > d) {
					while (s != d) {
						s /= 2;
						count++;
					}
				} else if (s < d) {
					while (s != d) {
						s *= 2;
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	private static boolean isPowerOf2(long val) {
		double power = Math.log(val) / Math.log(2);
		double fraction = power - (int) power;
		return !(fraction > 0);
	}
}
