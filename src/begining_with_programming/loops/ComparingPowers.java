package begining_with_programming.loops;

import java.util.Scanner;

public class ComparingPowers {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();

			if (a >= 0 && b >= 0) {
				if (a > b)
					System.out.println(1);
				else if (b > a)
					System.out.println(2);
				else
					System.out.println(0);
			} else if (a < 0 && b < 0) {
				if (n % 2 == 0) {
					if (a < b)
						System.out.println(1);
					else if (b < a)
						System.out.println(2);
					else
						System.out.println(0);
				} else {
					if (a > b)
						System.out.println(1);
					else if (b > a)
						System.out.println(2);
					else
						System.out.println(0);
				}

			} else if (a >= 0 && b < 0) {
				if (n % 2 == 0) {
					b = Math.abs(b);
					if (a > b)
						System.out.println(1);
					else if (b > a)
						System.out.println(2);
					else
						System.out.println(0);
				} else {
					System.out.println(1);
				}
			} else {
				if (n % 2 == 0) {
					a = Math.abs(a);
					if (a > b)
						System.out.println(1);
					else if (b > a)
						System.out.println(2);
					else
						System.out.println(0);
				} else {
					System.out.println(2);
				}
			}

		}
	}
}
