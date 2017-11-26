import java.math.BigInteger;

public class Factorial1 {
	public static void factorial(int number) {
		BigInteger fact = BigInteger.valueOf(1);
		for(int i = number; i >= 1; i--) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorial of " + number + " is " + fact);
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 30; i++) {
			factorial(i);
		}
	}
}
