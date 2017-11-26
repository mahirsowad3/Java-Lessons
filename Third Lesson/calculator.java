import java.util.Scanner;
public class calculator {
	
	public static void calc(int a, int b, int c) {
		if (c == 1) {
			System.out.println(a + b);
		}
		
		else if (c == 2) {
			System.out.println(a - b);
		}
		
		else if (c == 3) {
			System.out.println(a * b);
		}
		
		else if(c == 4) {
			System.out.println(a/b);
		}
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("Enter another number: ");
		int n2 = Integer.parseInt(scan.nextLine());
		System.out.println("Choose an operation from below: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Enter the number of operation desired: ");
		int n3 = Integer.parseInt(scan.nextLine());
		calc(n1, n2, n3);
		scan.close();
		
	}
}
