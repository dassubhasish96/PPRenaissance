package begining_with_programming.decision_making;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		float balance = scanner.nextFloat();
		if (amount % 5 == 0) {
			if (amount + 0.5 <= balance)
				balance -= amount + 0.5;
		}
		System.out.printf("%.2f", balance);
	}
}
