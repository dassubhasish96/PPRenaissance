package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class Laddu {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			int activityCount = scanner.nextInt();
			String origin = scanner.next();
			int laddus = 0;
			while (activityCount-- > 0) {
				String activity = scanner.next();
				switch (activity) {
				case "CONTEST_WON":
					int rank = scanner.nextInt();
					laddus += 300;
					if (20 - rank > 0)
						laddus += 20 - rank;
					break;
				case "TOP_CONTRIBUTOR":
					laddus += 300;
					break;
				case "BUG_FOUND":
					int severity = scanner.nextInt();
					laddus += severity;
					break;
				case "CONTEST_HOSTED":
					laddus += 50;
					break;
				}
			}
			if (origin.equals("INDIAN")) {
				System.out.println(laddus / 200);
			} else {
				System.out.println(laddus / 400);
			}
		}
	}
}
