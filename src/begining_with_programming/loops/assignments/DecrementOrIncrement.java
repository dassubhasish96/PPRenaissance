package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class DecrementOrIncrement {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num % 4 == 0)
			num++;
		else
			num--;
		System.out.println(num);
	}
}
