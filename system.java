package supermarketsystem;

import java.io.IOException;
import java.util.*;

public class system {
	
private String user;

	
	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);	
		System.out.print ("Enter the ID of the item: ");
		int productid = keyboard.nextInt();

        System.out.print ("Enter the quantity: ");
        int quantity = keyboard.nextInt();
		
        product product = new product();
        product.readProduct(productid, quantity);
		
	}
	
	

}
