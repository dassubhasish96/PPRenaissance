package begining_with_programming.live_class;

import java.util.Scanner;

//https://codeforces.com/contest/122/problem/A
public class LuckyDivision {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(isAlmostLucky(n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	//TC - O(NLOGN), S.C - O(1)
	private static boolean isAlmostLucky(int n) {
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				if(isLucky(i))
					return true;
			}
		}
		return false;
	}
	
	private static boolean isLucky(int n) {
		while(n > 0) {  
			int d = n % 10;
			if(d == 4 || d == 7) {
				n /= 10;
			} else
				return false;
		}
		return true;
	}
}
