package begining_with_programming.decision_making;

import java.util.Scanner;

public class GroupSum {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        long count = ((k - 1)* (long)k)/2;
        long first = 1 + 2 * count;
        long sum = 0;
        while(k-- > 0){
			sum += first;
            first += 2;
        }
        System.out.println(sum);
    }
}
