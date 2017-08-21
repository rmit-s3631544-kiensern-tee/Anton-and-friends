package supermarketsystem;


import java.io.IOException;
import java.util.*;	
public class Salesprocess {

	public static double main(double i) throws IOException {

		
		int productid;
		double price;
		int quantity;
		
		
		Scanner scan = new Scanner(System.in);
		String keepShopping = "y";
	     	cart cart1 = new cart();
	      do
	          {
	            System.out.print ("Enter the ID of the item: ");
	            productid = scan.nextInt();
	            
	            System.out.print("Enter the name of the item: ");
	            String productname = scan.next();

	            System.out.print ("Enter the quantity: ");
	            quantity = scan.nextInt();
	            
	            System.out.print ("Enter the unit price: ");
	            price = scan.nextDouble();

	            // *** create a new item and add it to the cart
	            cart1.addtocart( productid, productname, price,  quantity);



	            // *** print the contents of the cart object using println
	            System.out.println(cart1);

	            System.out.print ("Continue shopping (y/n)? ");
	            keepShopping = scan.next();
	          }
	      while (keepShopping.equals("y"));
		return quantity;

	    }
		
	}


