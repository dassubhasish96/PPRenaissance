package begining_with_programming.loops.assignments;

import java.util.Scanner;

public class ColorOfBaloons {
	public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-- > 0){
            String s = scanner.next();
            int aCount = 0, bCount = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'a')
                    aCount++;
                else
                    bCount++;
            }
            System.out.println(Math.min(aCount, bCount));
        }
    }
}
