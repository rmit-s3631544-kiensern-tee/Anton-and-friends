package supermarketsystem;


import java.io.IOException;
import java.util.*;	
public class Salesprocess {

	public Salesprocess()
	{
		
	}
	public void sales() throws IOException {

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
	            
	            //System.out.print("Enter the name of the item: ");
	            //String productname = scan.next();

	            System.out.print ("Enter the quantity: ");
	            quantity = scan.nextInt();
	            
	            //System.out.print ("Enter the unit price: ");
	            //price = scan.nextDouble();

	            // *** create a new item and add it to the cart
	            //product temp = new product();
	            //product product = new product();
	            //temp = product.readProduct(productid,quantity);
	           
	            cart1.addtocart(productid,quantity);



	            // *** print the contents of the cart object using println
	            System.out.println(cart1);

	            System.out.print ("Continue shopping (y/n)? ");
	            keepShopping = scan.next();
	          }
	      while (keepShopping.equals("y"));

	    }
		
	}


