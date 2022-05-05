package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class KingMovement {
	 public static void main (String[] args) throws java.lang.Exception
	    {
	        Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt();
	        while(T-- > 0){
	            int R = scanner.nextInt();
	            int C = scanner.nextInt();
	            int K = scanner.nextInt();
	            int count = 0;
	            int sum = 8;
	            int temp = K;
	            while(temp-- > 0){
	                count += sum;
	                sum += 8;
	            }
	          
	            //subtract invalid cells
	            int topMissing = K - R + 1;
	            int downMissing =  R + K - 8;
	            int leftMissing = K - C + 1;
	            int rightMissing =  C + K - 8;
	            
	            if(topMissing < 0)
	                topMissing = 0;
	             if(downMissing < 0)
	                downMissing = 0;
	           if(leftMissing < 0)
	                leftMissing = 0;
	           if(rightMissing < 0)
	                rightMissing = 0;
	               
	            int invalidCells = (topMissing + downMissing + leftMissing + rightMissing) * (2 * K + 1);
	            
	            invalidCells -= (topMissing*leftMissing + topMissing*rightMissing + leftMissing*downMissing + rightMissing*downMissing);
	            
	            System.out.println(count - invalidCells + 1);
	        }
	    }
}
