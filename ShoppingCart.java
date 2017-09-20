package supermarketsystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> cart = new ArrayList<>();
	private double total;
	private Offer offer;
	
	public List<Product> getcart(){
		return cart;
	}
	
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
		for (int i = 0; i < cart.size(); i++){
			if ((cart.get(i).getid().equals(id))){
				cart.remove(i);
			}
		}
	}
	
	public void setOffer(Offer offer){
		this.offer = offer;
	}
	
	public void addProductwithid(String id,int quantity){
		Product product = new Product();
		List<Product> productlist = product.getProductlist();
		for (int i = 0; i < productlist.size(); i++){
			if ((productlist.get(i).getid().equals(id))){
				productlist.get(i).setQuantity(quantity);
				cart.add(productlist.get(i));
			}
		}
	}

	
	public String toString(){
		String content = "\nShopping Cart\n";
		content += "\nItemCount\n";
		if (cart.size() > 0){
			for (Product product: cart){
				content += product.toString() + "\n";
			}
		}
		content += "\nTotal Price: AUD" + (getTotal());
		content += "\n";
		return content;
	}
	
}
