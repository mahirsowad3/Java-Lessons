
public class Factorial_Function {
	public static void factorial(int number) {
		double fact = 1;
		for(int i = number; i >= 1; i--) {
			fact *= i;
		}
		System.out.println("Factorial of " + number + " is " + fact);
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			factorial(i);
		}
	}

}
