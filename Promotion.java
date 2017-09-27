package supermarketsystem;

public class Promotion implements Offer {
	
	private double price;
	
	public Promotion (double price){
		this.price = price;
	}
	
	@Override
	public void applyOffer(Product product){
		product.setPrice(price);
	}
}
