import java.util.Scanner;
public class Minimum {
	public static int min(int a, int b) {
		int min;
		if(a < b) {
			min = a;
		}else {
			min = b;
		}
		
		return min;
	}
	
	public static void min_calc() {
		Scanner number = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a number: ");
			int a = Integer.parseInt(number.nextLine());
			System.out.print("Enter another number: ");
			int b = Integer.parseInt(number.nextLine());
			int c = min(a, b);
			System.out.println("Minimum number: " + c);
			System.out.print("Do you wish to continue?");
			String prompt = number.nextLine();
			if (prompt.equals("no")) {
				number.close();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		min_calc();
		
		
	}
	
}
