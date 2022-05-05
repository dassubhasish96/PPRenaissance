package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class BreakingBricks {
	public static void main (String[] args) throws java.lang.Exception
	    {
	        Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt();
	        while(T-- > 0){
	            int S = scanner.nextInt();
	            int w1 = scanner.nextInt();
	            int w2 = scanner.nextInt();
	            int w3 = scanner.nextInt();
	            
	            if(w1 + w2 + w3 <= S)
	                System.out.println(1);
	            else if(w1 + w2 <= S && w3 <= S)
	                 System.out.println(2);
	          else if(w2 + w3 <= S && w1 <= S)
	                 System.out.println(2);
	            else if(w1 <= S && w2 <= S && w3 <= S)
	                 System.out.println(3);
	        }
}
}
