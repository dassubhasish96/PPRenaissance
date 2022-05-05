package begining_with_programming.loops.assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RockPaperScissor {
	public static void main (String[] args) throws java.lang.Exception
	    {
	        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));

	        int T = Integer.parseInt(inp.readLine().trim());
	        while(T-- > 0){
	            
	          int N = Integer.parseInt(inp.readLine().trim());
	            
	           String[] splits = inp.readLine().trim().split("\\s+");

	            int r1 = Integer.parseInt(splits[0]);

	            int p1 = Integer.parseInt(splits[1]);

	            int s1 = Integer.parseInt(splits[2]);

	            

	            splits = inp.readLine().trim().split("\\s+");

	            int r2 = Integer.parseInt(splits[0]);

	            int p2 = Integer.parseInt(splits[1]);

	            int s2 = Integer.parseInt(splits[2]);
	            
	            int johnWinCount = Math.min(p1, r2) + Math.min(s1, p2) + Math.min(r1, s2);
	                
	            if(johnWinCount >= Math.ceil(N/2))
	                System.out.println("Yes");
	            else
	                System.out.println("No");
	            
	        }
}
}
