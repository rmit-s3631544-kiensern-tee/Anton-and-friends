package supermarketsystem;


public class Supplier {

	private String supplierid;
	private String suppliername;
	private int stocklevel;
	private Product product;

	public Supplier(String supplierid, String suppliername,Product product ){
		this.supplierid = supplierid;
		this.suppliername = suppliername;
		this.stocklevel = 100;
		this.product = product;
	}
	
	public void reducestock(String supplierid){
		stocklevel = stocklevel - product.getStock();
	}
	
	public void updateStock(String supplierid){
		if (stocklevel <= 50){
			stocklevel = 100;
		}
	}
	
	public void setstocklevel(int stock){
		stocklevel = stock;
	}
		
	public String getID(){
		return this.supplierid;
	}
	
	public String getName(){
		return this.suppliername;
	}
	
	public int getstock(){
		return this.stocklevel;
	}
	
	public Product getProduct(){
		return product;
	}
	
	
}
