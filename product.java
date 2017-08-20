package supermarketsystem;

import java.io.File;
import java.lang.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class product {

private String productId;
private String productName;
private double price;
private int quantity;


	public product(String productid, String productname,  double price, int quantity )
	{
		this.productId = productid;
		this.price = price;
		this.quantity = quantity;
		this.productName = productname;
	
	}
	
	public boolean readProduct() throws IOException{
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(new File("products.txt"));;
		List<String> line = new ArrayList<String>();
		while (sc.hasNextLine()) {
		  line.add(sc.nextLine());
		}

		String[] productsname = line.toArray(new String[0]);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(new File("price.txt"));
		List<String> lines = new ArrayList<String>();
		while (scan.hasNextLine()) {
			  lines.add(scan.nextLine());
			}

		String[] priceline = lines.toArray(new String[0]);
		
		Double [] price = new Double[priceline.length];
	    for(int i=0 ; i < priceline.length; i++){  
		        price[i] = Double.parseDouble(priceline[i]);  
	    }
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);	
		System.out.print ("Enter the ID of the item: ");
		int productid = keyboard.nextInt();

        System.out.print ("Enter the quantity: ");
        int quantity = keyboard.nextInt();
		
        int available = 0;
        for(int i = 0 ; i <productsname.length; i++)
        {
        	if (productid == i)
        	{
        		this.productName = productsname[i];
        		this.price = price[i];
        		String prices = String.valueOf(this.price);
        		available = 1;
        		
        	}
        }
        	if(available==0){
        		System.out.print("Fail");
        	}
	}
	
	
	public String toString()
	{
		return String.format("ProductId : %s\nProductName: %s\nPrice : %8.2f\nQuantity : %d", 
				this.productId, this.productName, this.price, this.quantity);
	}
	
	
	public double getPrice()
	{
		return this.price;
	}
	
	
	public String getID()
	{
		return this.productId;
	}
	
	public String getName()
	{
		return this.productName;
	}
	
	
	
	
	
	

	public static void main(String[] args) {

	}

}
