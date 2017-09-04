package supermarketsystem;

import java.util.Scanner;

public class Salesprocess {

	public Salesprocess()
	{
		
	}
	/*public  String sales(String productid, int quantity, String keepShopping)  {
		String productid;
		int quantity;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String keepShopping = "";
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
	      return cart1.toString();
	    }*/
	
		
	
		public  String sales(String productid, int quantity, String keepShopping)  {
			cart cart1 = new cart();
	            cart1.addtocart(productid,quantity);
	            System.out.println(cart1);
	            

	      return cart1.toString();
	    }

}
