package supermarketsystem;

import java.util.Scanner;

public class Transaction1 {

	public static void main(String[] args) {
		String shop = "y";
		String productid;
		String choice1;
		int quantity;
		int choice;
		int loop = 0;
		
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Welcome to the Supermarket.");
		while (shop.equals("y")) {
			System.out.println("Select your choice: ");
			System.out.println("1. Add to Cart (Product Id & Quantity)");
			System.out.println("2. Finish and Pay");
			System.out.println("Choice: ");
			cart cart1 = new cart();
			choice = scan.nextInt();
			while (loop == 0) {
				if ((choice == 1) || (choice == 2)) {
					if (choice == 1) {
						System.out.println("Please Enter the product ID: ");
						productid = scan1.nextLine();
						System.out.println("Please enter the quantity: ");
						quantity = scan.nextInt();
						System.out.printf("You have enetered: \nProduct ID: %s // Quantity: %d. \n", productid, quantity);
						System.out.println("Is this correct? (y or n)");
						choice1 = scan1.nextLine();
							if (choice1.equals("y")) {
								cart1.addtocart(productid, quantity);
								choice = 0;
								break;
							} else if (choice1.equals("n")) {
								System.out.println("Please Enter Correct Product.");
								continue;
							} else {
								System.out.println("You have entered an invalid option.");
								System.out.printf("You have enetered: \nProduct ID: %s\tQuantity: %d. \n", productid, quantity);
								System.out.println("Is this correct? (y or n)");
								choice1 = scan.nextLine();
							}
					} else if (choice == 2) {
						System.out.println("Finish and Pay");
						shop = "n";					
					} else {
						continue;
					}
				} else {
					continue;
				}
			}
		}
	}

}
