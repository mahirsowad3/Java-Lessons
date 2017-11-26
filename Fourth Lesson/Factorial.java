import java.math.BigInteger;

public class Factorial {
	public static void main(String args[]) {
		for (int i = 1; i <= 30; i++) {
			BigInteger x = BigInteger.valueOf(1);
			for (int num = i; num > 0; num--) {
				x = x.multiply(BigInteger.valueOf(num));
			}
		System.out.println("Factorial " + i +" is " + x);
		}
	}

}
