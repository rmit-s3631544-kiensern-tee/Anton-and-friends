package supermarketsystem;

public class product {

private String productId;
private String productName;
private double price;
private int quantity;

	public product(String productid,  double price, int quantity )
	{
		this.productId = productid;
		this.price = price;
		this.quantity = quantity;
	
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
	
	
	public int getQuantity()
	{
		return this.quantity;
	}
	
	
	

	public static void main(String[] args) {

	}

}
