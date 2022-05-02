package begining_with_programming.loops;

import java.util.Scanner;

public class ChefAndPrime {
	 public static void main (String[] args) throws java.lang.Exception
	    {
	       Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt();
	        while(T-- > 0){
	            int N = scanner.nextInt();
	            int count = 0;
	            long num;
	            while(N-- > 0){
	               num = scanner.nextLong();
	               count += countDigit(num);
	            }
	            if(isPrime(count))
	                System.out.println("Yes");
	            else
	                System.out.println("No");
	        }
	    }
	    
	    private static int countDigit(long num){
	        if(num == 0)
	            return 1;
	        int count = 0;
	        while(num > 0){
	            count++;
	            num /= 10;
	        }
	        return count;
	    }
	    
	    private static boolean isPrime(int num){
	        for(int i = 2; i <= Math.sqrt(num); i++){
	            if(num % i == 0)
	                return false;
	        }
	        return true;
	    }
}
