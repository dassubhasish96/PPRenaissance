import java.math.BigInteger;

public class Test {
	public static void main(String[] args) {
		String input1 = "1000000000";


		// Convert the string input to BigInteger
		BigInteger a = new BigInteger(input1);
		
		

		// Using multiply() method
		BigInteger mult = new BigInteger("1");
		
		for(int i = 1; i <= 100; i++)
		mult = mult.multiply(a);
		
		System.out.println(mult);

	}

}
