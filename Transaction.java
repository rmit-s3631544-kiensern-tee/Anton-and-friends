package supermarketsystem;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		String shop = "y";
		String productid;
		String choice1;
		int quantity;
		int choice = 0;
		int loop = 0;
		
		Scanner scan = new Scanner(System.in);
     	ShoppingCart cart1 = new ShoppingCart();
     	do{
	     	System.out.println("Select your choice: ");
			System.out.println("1. Add to Cart (Product Id & Quantity)");
			System.out.println("2. Finish and Pay");
			System.out.println("Choice: ");
			choice = scan.nextInt();
	     		if (choice == 1){
		     		do
		     		{
		     			System.out.println("Enter the ID of the item: ");
		     			productid = scan.next();
		     			System.out.println("Enter the quantity: ");
		     			quantity = scan.nextInt();
		     			cart1.addProductwithid(productid,quantity);
		     			System.out.print ("Continue shopping (y/n)? ");
		     			shop = scan.next();
		     		}while (shop.equals("y"));
	     		}
	     		if (choice == 2){
	     			System.out.print(cart1.toString());
	     			break;
	     		}
	     }while(choice == 1 || choice == 2);
	}
}



