package supermarketsystem;


import java.io.IOException;
import java.util.*;	
public class Salesprocess {

	public Salesprocess()
	{
		
	}
	public void sales() throws IOException {

		String productid;
		int quantity;

		
		Scanner scan = new Scanner(System.in);
		String keepShopping = "y";
	     	cart cart1 = new cart();
	      do
	          {
	            System.out.println("Enter the ID of the item: ");
	            productid = scan.next();
	            System.out.println("Enter the quantity: ");
	            quantity = scan.nextInt();
	            cart1.addtocart(productid,quantity);
	            System.out.println(cart1);

	            System.out.print ("Continue shopping (y/n)? ");
	            keepShopping = scan.next();
	          }
	      while (keepShopping.equals("y"));
	     
	    }
		
	}


