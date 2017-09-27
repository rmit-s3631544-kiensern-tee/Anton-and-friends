package supermarketsystem;

public class Discount implements Offer{

	private double discount;
	
	public Discount(double discount){
		this.discount = discount;
	}
	
	@Override
	public void applyOffer(Product product){
		product.setDiscount(discount);
	}
	
}
