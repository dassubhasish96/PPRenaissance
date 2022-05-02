package begining_with_programming.loops;

import java.util.Scanner;

public class ChefAndOperators {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			if (num1 < num2)
				System.out.println("<");
			else if (num1 > num2)
				System.out.println(">");
			else
				System.out.println("=");
		}
	}
}
