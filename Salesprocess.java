package supermarketsystem;


import java.util.*;	
public class Salesprocess {

	public static void main(String[] args) {

		
		String productid;
		double price;
		int quantity;
		
		Scanner scan = new Scanner(System.in);
		String keepShopping = "y";
	     	cart cart1 = new cart();
	      do
	          {
	            System.out.print ("Enter the ID of the item: ");
	            productid = scan.next();

	            System.out.print ("Enter the unit price: ");
	            price = scan.nextDouble();

	            System.out.print ("Enter the quantity: ");
	            quantity = scan.nextInt();

	            // *** create a new item and add it to the cart
	             
	            cart1.addtocart( productid, price, quantity);



	            // *** print the contents of the cart object using println
	            System.out.println(cart1);

	            System.out.print ("Continue shopping (y/n)? ");
	            keepShopping = scan.next();
	          }
	      while (keepShopping.equals("y"));

	    }
		
	}


