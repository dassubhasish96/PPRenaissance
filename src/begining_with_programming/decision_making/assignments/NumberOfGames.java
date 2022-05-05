package begining_with_programming.decision_making.assignments;

import java.util.Scanner;

public class NumberOfGames {
	  public static void main (String[] args) throws java.lang.Exception
	    {
	       Scanner scanner = new Scanner(System.in);
	        int p = scanner.nextInt();
	        int d = scanner.nextInt();
	        int m = scanner.nextInt();
	        int s = scanner.nextInt();
	        int count = 0;
	        while(true){
	            if(s >= p){
	                count++;
	                s = s - p;
	                if(p - d >= m)
	                	p = p - d;
	                else
	                    p = m;
	            } else{
	                break;
	            }
	        }
	        System.out.println(count);
	    }
}
