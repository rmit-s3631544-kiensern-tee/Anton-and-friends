package supermarketsystem;

import java.util.Scanner;

public class Payment {
	
	public static void main(String[] args) {
		double cTotal = 100;
		int x = 0;
		String choice;
		Scanner scan = new Scanner(System.in);
		while (x == 0) {
			System.out.println("How would you like to pay?");
			System.out.println("1.Card or 2.Cash:");
			choice = scan.next();
			if (choice.equals("1")) {
				payCard(cTotal);
				x++;
			} else if (choice.equals("2")) {
				payCash(cTotal);
				x++;
			} else {
				System.out.println("Please enter a valid choice.");
			}
		}
		System.out.print("Thank you for shopping with us. We look forward to your next patronage.");
	}
	
	
	public static boolean payCash(double cTotal) {
		
		Scanner scan = new Scanner(System.in);
		String choice;
		int x = 0;
		double paid;
		while (x == 0) {
			System.out.printf("The total that is needed to be paid: %.2f \n", cTotal);
			System.out.print("How much have you entered?");
			paid = scan.nextInt();
			while (x == 0) {
				if (cTotal < 0) {
					cTotal = payCash(cTotal, paid);
					System.out.printf("You still have to pay %.2f \n", cTotal);
					System.out.println("Please Continue paying.");
					paid = scan.nextInt();
					continue;
				} else {
					paid = paid - cTotal;
					System.out.printf("Change is: %.2f", paid);
					x++;
				}
			}
		}
		return true;
	}

	public static double payCash(double cTotal, double paid) {
		cTotal = cTotal - paid;
		return cTotal;
	}

	public static boolean payCard (double cTotal) { 
		String name = null, num =  null, date = null, choice;
		double pay = 0;
		int y = 0;
		Scanner scan = new Scanner(System.in);
		//Card cardOne = new Card();
		int x = 0, z = 0;
		while (x == 0) {
			System.out.println("Please enter your card details.");
			while (z == 0) {
				System.out.println("Card Name: ");
				name = scan.next();
				if (name.length() < 25) {
					z++;
				} else {
					System.out.println("Name is more than 25 characters, invalid. \n");
					continue;
				}
			}
			while (z == 1) {
				System.out.println("Card Number: ");
				num = scan.next();
				if (num.length() == 16) {
					z++;
				} else {
					System.out.println("Card Number is not 16 numbers, invalid. \n");
					continue;
				}
			}
			while (z == 2) {
				System.out.println("Card Expiry Date(Format: dd/MM/yyyy) : ");
				date = scan.next();
				if (date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) {
					z++;
				} else {
					System.out.println("Date is not valid, Please follow the format of dd/mm/yyyy. \n");
					continue;
				}
			}
			System.out.print("Your Card details: ");
			System.out.printf("Name: " + "%s \t" + "Card Number: " + "%s \t" + "Date: " + "%s \n", name, num, date);
			System.out.println("Is these entered details correct? (Y/N)");
			choice = scan.next();
			if (choice.equals("Y") || choice.equals("y")) {
				while (z == 3) {
					System.out.printf("You need to pay: %.2f \n", cTotal);
					pay = scan.nextDouble();
					if (payCard(cTotal, pay) == true) {
						z++;
					} else {
						System.out.println("Please enter full amount.");
						continue;
					}
				}
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
	
	public static boolean payCard(double cTotal, double pay) {
		cTotal = cTotal - pay;
		if (cTotal == 0) {
			return true; 
		} else {
			return false;
		}
	}
}
