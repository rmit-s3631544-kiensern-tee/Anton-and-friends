package supermarketsystem;

import java.io.FileNotFoundException;
import java.io.IOException;

public class cart {

private product[] cart;
private int itemcount;
private double totalprice;
private int capacity;
private double price;


	public cart()
	{
		this.capacity = 5;
		cart = new product[capacity];
		this.itemcount = 0;
		this.totalprice = 0.0;
	}
	
	public void addtocart(String productid, int quantity) {
		product temp = new product();
		product product = new product();
		temp = product.readProduct(productid);
		price = temp.getPrice();
		this.totalprice += (price*quantity);
		cart[itemcount] = temp;
		itemcount+=1;
		if (itemcount == capacity)
		{
			increasesize();
		}
		
	}
	
	public String removefromcart(String productid, int quantity){
		product temp = new product();
		product product = new product();
		temp = product.readProduct(productid);
		price = temp.getPrice();
		this.totalprice -= (price*quantity);
		cart[itemcount] = cart[itemcount + 1];
		itemcount-=1;
		String name = cart[itemcount].toString();
		return name;
	}
	

	private void increasesize()
	{
		product[] temp = new product[capacity+10];
		for(int i=0; i < capacity; i++)
        {
            temp[i] = cart[i];
        }
        cart = temp; 
        temp = null;
        capacity = cart.length;
	}
	
	public String toString()
    {
      
      String contents = "\nShopping Cart\n";
      contents += "\nItem\n";
      for (int i = 0; i < itemcount; i++)
      contents += cart[i].toString() + "\n";
      contents += "\nTotal Price: AUD" + (totalprice);
      contents += "\n";

      return contents;
    }




}
