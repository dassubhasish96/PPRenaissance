package begining_with_programming.loops;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int units = scanner.nextInt();
		float bill = 0;
		if (units <= 50) {
			bill += units * 0.5;
		} else if (units <= 150) {
			bill += 50 * 0.5;
			bill += (units - 50) * 0.75;

		} else if (units <= 250) {
			bill += 50 * 0.5;
			bill += 100 * 0.75;
			bill += (units - 150) * 1.2;
		} else {
			bill += 50 * 0.5;
			bill += 100 * 0.75;
			bill += 100 * 1.2;
			bill += (units - 250) * 1.5;
		}

		bill += bill * 0.2;
		System.out.printf("%.2f", bill);
	}
}
