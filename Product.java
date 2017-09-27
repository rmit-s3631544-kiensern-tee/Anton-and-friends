package supermarketsystem;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String id;
	private String name;
	private double price;
	private int stocklevel;
	private int quantity;
	private double totalprice;
	private double discount = 0;
	private double freeitem = 0;
	private List<Product> productlist;
	
	public Product(String id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
		this.stocklevel = 30;
	}
	
	public Product(){
		
	}
	
	public List<Product> getProductlist(){
		productlist = new ArrayList<>();
		Product product1 = new Product("p01", "milk", 2.00);
		Product product2 = new Product("p02", "coffee", 3.50);
		Product product3 = new Product("p03", "rice", 15.00);
		productlist.add(product1);
		productlist.add(product2);
		productlist.add(product3);
		return productlist;
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
	
	public String toString(){
		return String.format("ProductId : %s\nProductName: %s\nPrice : %8.2f\n", 
				this.id, this.name, this.price);
	}

	
}
