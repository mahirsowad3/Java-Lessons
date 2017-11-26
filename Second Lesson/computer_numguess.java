import java.util.Scanner;
public class computer_numguess {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 100 for the computer to guess: ");
		int inNum = Integer.parseInt(sc.nextLine());
		int maxRange = 100;
		int minRange = 0;
		int numGuess = (int)(Math.random()*maxRange);
		int tries = 1;
		while(numGuess != inNum) {
			System.out.println("Number guessed: " + numGuess);
			System.out.print("Type 'correct' if correct, 'high' if too high, or 'low' if too low: ");
			String prompt = sc.nextLine();
			if (prompt.equals("low")) {
				minRange = numGuess + 1;
				numGuess = ((int) (Math.random()*(maxRange - minRange))) + minRange;
				tries += 1;
			}
			else if (prompt.equals("high")) {
				maxRange = numGuess -1;
				numGuess = ((int) (Math.random()*(maxRange - minRange))) + minRange;
				tries += 1;
			}
		}
		System.out.println("Number guessed: " + numGuess);
		System.out.print("Type 'correct' if correct, 'high' if too high, or 'low' if too low: ");
		String prompt = sc.nextLine();
		if (prompt.equals("correct")) {
			System.out.println("The computer guessed correctly.");
			System.out.println("Correct Guess: " + numGuess);
			System.out.println("# of tries to guess correctly: " + tries);
			sc.close();
			
		}
		
	}
}
