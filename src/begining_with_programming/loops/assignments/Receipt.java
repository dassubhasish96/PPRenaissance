package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class Receipt {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			int p = scanner.nextInt();
			int count = 0;
			while (p > 0) {
				int prevPower = prevPowerOf2(p);
				count++;
				p -= prevPower;
			}
			System.out.println(count);
		}
	}

	private static int prevPowerOf2(int n) {
		if (n >= 2048)
			return 2048;
		int power = (int) (Math.log(n) / Math.log(2));
		return (int) Math.pow(2, power);
	}
}
