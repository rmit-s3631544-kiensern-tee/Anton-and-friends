package supermarketsystem;


public class cart {

private product[] cart;
private int itemcount;
private double totalprice;
private int capacity;

	public cart()
	{
		this.capacity = 5;
		cart = new product[capacity];
		this.itemcount = 0;
		this.totalprice = 0.0;
	}

	public void addtocart(int productId, String productname, double price,  int quantity){
		product temp = new product(productId, productname, price,quantity);
		price = temp.getPrice();
		productname = temp.getName();
		this.totalprice += (price*quantity);
		cart[itemcount] = temp;
		itemcount+=1;
		if (itemcount == capacity)
		{
			increasesize();
		}
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
