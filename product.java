package supermarketsystem;

import java.io.File;
import java.lang.*;
import java.io.IOException;
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
	
	public String readProduct(String ProductID) throws IOException{
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(new File("products.txt"));
		scan.useDelimiter("-|\n");
		this.productId = ProductID;
		while(scan.hasNext())
		{
			String line = scan.nextLine();
            if(line.contains(ProductID)){
            	this.productName = scan.next();
            	this.price = Double.valueOf(scan.next().substring(1));
            	return line ;
            }
            	
		}
		return ProductID;
		
		
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
