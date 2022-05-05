package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class ChefAndCookOff {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		while (N-- > 0) {
			int count = 0;
			for (int i = 1; i <= 5; i++) {
				int val = scanner.nextInt();
				if (val == 1)
					count++;
			}
			if (count == 0)
				System.out.println("Beginner");
			else if (count == 1)
				System.out.println("Junior Developer");
			else if (count == 2)
				System.out.println("Middle Developer");
			else if (count == 3)
				System.out.println("Senior Developer");
			else if (count == 4)
				System.out.println("Hacker");
			else if (count == 5)
				System.out.println("Jeff Dean");
		}
	}
}
