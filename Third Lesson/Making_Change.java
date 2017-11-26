import java.util.Scanner;
public class Making_Change {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double price = checkOut(scan);
		System.out.println();
		System.out.println("Total Price: " + price);
		System.out.println();
		double paid = pricePaid(scan);
		System.out.println("Amount paid: " + paid);
		scan.close();
		System.out.println();
		double change = changeAmount(price, paid);
		if (change > 0) {
			changeValues(change);
		}
	}
	
	public static double checkOut(Scanner sc) {
		double totalPrice = 0;
		while(true) {
			System.out.print("Enter the price of the item: ");
			double itemPrice = Double.parseDouble(sc.nextLine());
			totalPrice += itemPrice;
			System.out.print("Do you want to check out more items? ");
			String prompt = sc.nextLine();
			if (prompt.equals("no")) {
				break;
			}
			
		}
		return totalPrice;
	}
	
	public static double pricePaid(Scanner sc) {
		System.out.print("Enter the amount paid by customer: ");
		double amountPaid = Double.parseDouble(sc.nextLine());
		return amountPaid;
	}
	
	public static double changeAmount(double price, double paid) {
		double change = 0;
		if (paid < price) {
			System.out.println("Not enough money paid to complete purchase.");
		}
		else if (paid == price) {
			System.out.println("No change needed to be returned.");
		}
		else if (paid > price) {
			change = paid - price;
		}
		return change;
	}
	
	public static void changeValues(double change) {
		System.out.println("Provide change in values specified below: ");
		while (true) {
			if (change >= 100) {
				int hundreds = (int)(change/100);
				System.out.println(hundreds + " $100 bill(s)");
				change = change%100;
			}
			else if (change >= 20) {
				int twenties = (int)(change/20);
				System.out.println(twenties + " $20 bill(s)");
				change = change%20;
			}
			else if (change >= 10) {
				int tens = (int)(change/10);
				System.out.println(tens + " $10 bill(s)");
				change = change%10;
			}
			else if (change >= 5) {
				int fives = (int)(change/5);
				System.out.println(fives + " $5 bill(s)");
				change = change%5;
			}
			
			else if (change >= 1) {
				int ones = (int)(change/1);
				System.out.println(ones + " $1 bill(s)");
				change = change%1;
			}
			else if(change >= 0.25) {
				int quarters = (int)(change/0.25);
				System.out.println(quarters + " quarter(s)");
				change = change%0.25;
			}
			else if (change >= 0.1) {
				int dimes = (int)(change/0.1);
				System.out.println(dimes + " dime(s)");
				change = change%0.1;
			}
			else if (change >= 0.5) {
				int nickels = (int)(change/0.05);
				System.out.println(nickels + " nickel(s)");
				change = change%0.05;
			}
			else if (change > 0.01) {
				int pennies = (int)(change/0.01);
				System.out.println(pennies + " penny/pennies");
				change = change%0.01;
				break;
			}
		}
	}

}
