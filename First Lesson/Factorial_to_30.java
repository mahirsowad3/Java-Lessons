
public class Factorial_to_30 {
	public static void main(String args[]) {
		for (int i = 1; i <= 30; i++) {
			double x = 1;
			for (int num = i; num > 0; num--) {
				x = x*num;
			}
		System.out.println("Factorial of " + i +" is " + x);
		}
	}
}
