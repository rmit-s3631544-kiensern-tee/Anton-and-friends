package supermarketsystem;


/**
 * @author Kien Sern
 *
 */
public class Product {
	
	private String id;
	private String name;
	private double price;
	private int stocklevel;
	private int quantity = 1;
	private double totalprice;
	private double discount = 0;
	private double freeitem = 0;
	
	public Product(String id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
		this.stocklevel = 30;
	
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int Quantity){
		this.quantity = Quantity;
	}
	
	public String getid(){
		return id;
	}
	
	public void setid(String id){
		this.id = id;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public void decreaseStock(){
		stocklevel = stocklevel - quantity;
	}
	
	public double calculateCost(){
		this.totalprice = price*quantity - freeitem - ((price*discount)*quantity);
		return totalprice;
	}
	
	public int getStock(){
		return stocklevel;
	}
	
	public void setDiscount(double discount){
		this.discount = discount;
	}
	
	public double getDiscount(){
		return discount;
	}
	
	public void setStock(int stock){
		this.stocklevel = stock;
	}
	
	public void updateShelf(String id){
		if (stocklevel < 18 ){
			stocklevel = 30;
		}
	}
		
	public void setFreeitem(double freeitem){
		this.freeitem = freeitem;
	}
	
	public double getfreeitem(){
		return freeitem;
	}
}
