package supermarketsystem;

import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		
		int x = 0;
		String choice;
		Scanner scan = new Scanner(System.in);
		while (x == 0) {
			System.out.println("How would you like to pay?");
			System.out.println("Card or Cash:");
			choice = scan.next();
			if (choice.equals("Card") || choice.equals("card")) {
				payCard();
				x++;
			} else if (choice.equals("Cash") || choice.equals("cash")) {
				payCash();
				x++;
			} else {
				System.out.println("Please enter a valid choice.");
			}
		}
		System.out.print("Thank you for shopping with us. We look forward to your next patronage.");
	}
	
	private static boolean payCash() {
		
		Scanner scan = new Scanner(System.in);
		String choice;
		int x = 0;
		while (x == 0) {
			System.out.println("Please Enter Cash.");
			System.out.println("Finished your payment (Yes or No)?");
			choice = scan.next();
			if (choice.equals("Yes") || choice.equals("yes") || choice.equals("Y") || choice.equals("y")) {
				return true;
			} else if (choice.equals("No") || choice.equals("no") || choice.equals("N") || choice.equals("n")) {
				continue;
			} else {
				System.out.println("Please Enter a valid choice");
				continue;
			}
		
		}
		return false;
	}

	public static boolean payCard () { 
		String name, num, date, choice;
		Scanner scan = new Scanner(System.in);
		Card cardOne = new Card();
		int x = 0;
		while (x == 0) {
			System.out.println("Please enter your card details.");
			System.out.println("Card Name: ");
			name = scan.next();
			cardOne.setName(name);
			
			System.out.println("Card Number: ");
			num = scan.next();
			cardOne.setNo(num);
			
			System.out.println("Card Expiry Date(Format: xx/xx/xx) : ");
			date = scan.next();
			cardOne.setExpire(date);
			cardOne.printDetails();
			System.out.println("Is these entered details correct? (Y/N)");
			choice = scan.next();
			if (choice.equals("Y") || choice.equals("y")) {
				x++;
			} else if (choice.equals("N") || choice.equals("n")) {
				continue;
			} else {
				System.out.println("You have entered an invalid choice. Please enter a valid choice.");
				continue;
			}
		}
		return true;
	}

}
