package begining_with_programming.operators;

public class SwappingWithAndWithoutExtraVariable {
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		//swap with variable
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
		
		//swap with out variable - approach 1
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
		
		//swap with out variable - approach 1
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println(a + " " + b);
		
	}
}
