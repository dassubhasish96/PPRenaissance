package begining_with_programming.loops;

import java.util.Scanner;

public class MutatedMinions {
	 public static void main (String[] args) throws java.lang.Exception
	    {
	        Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt();
	        while(T-- > 0){
	            int count = 0;
	            int N = scanner.nextInt();
	            int K = scanner.nextInt();
	            while(N-- >0){
	                int val = scanner.nextInt();
	                if((val + K) % 7 == 0)
	                    count++;
	            }
	            System.out.println(count);
	        }
}
}
