import java.util.Scanner;
public class guessing_game {
	public static void main(String args[]) {
		int randnum = (int)(Math.random()*100); 
		Scanner numguess = new Scanner(System.in);
		System.out.print("Welcome to the guessing game. Please enter a number: ");
		String guess = numguess.nextLine();
		
		int x = 1;
		int guess0 = Integer.parseInt(guess);
		while(guess0 != randnum) {
			if (guess0 > randnum) {
				System.out.print("You guessed wrong. Your guess was too high. Guess again: ");
				String guess1 = numguess.nextLine();
				guess0 = Integer.parseInt(guess1);
				x = x + 1;
		    }
			else if(guess0 < randnum){
				System.out.print("You guessed wrong. Your guess was too low. Guess again: ");
				String guess1 = numguess.nextLine();
				guess0 = Integer.parseInt(guess1);
				x = x + 1;
			}
		}
		System.out.println("Congrats. You guessed correctly.");
		System.out.println("Number of tries: " + x);
		numguess.close();
		
		
	}
  
}
