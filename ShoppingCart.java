package supermarketsystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> cart = new ArrayList<>();
	private double total;
	private Offer offer;

	public int getCartnumber(){
		return cart.size();
	}
	
	public void addProduct(Product product){
		if (offer != null){
			offer.applyOffer(product); //apply offer
		}
		cart.add(product);
	}
	
	public double getTotal(){
		if (cart.size() > 0 ){
			for (Product product : cart ){
				total = total + product.calculateCost();
				product.decreaseStock();
			}
		}
		return total;
	}
	
	public void deleteProduct(String id){
		for (int i = 0; i<cart.size(); i++){
			if ((cart.get(i).getid().equals(id))){
				cart.remove(i);
				return;
			}
		}
	}
	
	public void setOffer(Offer offer){
		this.offer = offer;
	}
	
}
