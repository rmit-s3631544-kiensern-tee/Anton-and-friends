package supermarketsystem;

import java.io.File;
import java.lang.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class product {

private int productId;
private String productName;
private double price;
private int quantity;


	public product(int productid, String productname, double price, int quantity )
	{
		this.productId = productid;
		this.quantity = quantity;
		this.productName = productname;
		this.price = price;
	
	}
	
	/*public void readProduct(int productid,int quantity) throws IOException{
		
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
	    
        int available = 0;
        for(int i = 0 ; i <productsname.length; i++)
        {
        	if (productid == i)
        	{
        		this.quantity = quantity;
        		this.productName = productsname[i];
        		this.price = price[i];
        		available = 1;
        		System.out.println(this.productName);
        		System.out.println(this.price);
        		
        	}
        }
        	if(available==0){
        		System.out.print("Fail");
        	}
		
	}*/
	
	
	public String toString()
	{
		return String.format("ProductId : %s\nProductName: %s\nPrice : %8.2f\nQuantity : %d", 
				this.productId, this.productName, this.price, this.quantity);
	}
	
	
	public double getPrice()
	{
		return this.price;
	}
	
	
	public int getID()
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
