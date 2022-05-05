package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class CountYears {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int count = 0;
		while (a <= b) {
			a = a * 3;
			b = b * 2;
			count++;
		}
		System.out.println(count);
	}
}
