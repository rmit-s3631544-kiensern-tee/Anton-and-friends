package supermarketsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class product {

product[] products = new product[10];
product cart;
private String productId;
private String productName;
private double price;


	public product(String productid, String productname, double price )
	{
		this.productId = productid;
		this.productName = productname;
		this.price = price;
	
	}
	public product(){
		
	}
	
	
	public product readProduct(String productid){
		productlist();
		for (int i = 0; i < products.length; i++){
			if(products[i].getID().compareTo(productid) == 0){
				cart = products[i];
				
			}
		}
		return cart;
	}
	
	public void productlist(){
		products[0] = new product("p01", "onions",3.00);
		products[1] = new product("p02", "milk", 4.00);
		products[2] = new product("p03", "cookie", 3.99);
		products[3] = new product("p04", "doritos",2.99 );
		products[4] = new product("p05","yogurt",5.00);
		products[5] = new product("p06", "chocolate", 1.99);
		products[6] = new product("po7", "popcorn", 2.49);
		products[7] = new product("p08", "coffee", 2.00);
		products[8] = new product("p09", "donuts", 3.00);
		products[9] = new product("p10", "rice", 14.00);
	}

	public String toString()
	{
		return String.format("ProductId : %s\nProductName: %s\nPrice : %8.2f\n", 
				this.productId, this.productName, this.price);
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
