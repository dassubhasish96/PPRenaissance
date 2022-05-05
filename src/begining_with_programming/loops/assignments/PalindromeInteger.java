package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = N;; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				System.out.println(i);
				break;
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	private static boolean isPalindrome(int num) {
		String str = num + "";
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
