package supermarketsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
	private List<Product> cart = new ArrayList<>();
	private double total;
	private Offer offer;
	Product product = new Product();
	List<Product> productlist = product.getProductlist();

	public List<Product> getcart() {
		return cart;
	}

	public int getCartnumber() {
		return cart.size();
	}

	public void addProduct(Product product) {
		if (offer != null) {
			offer.applyOffer(product); // apply offer
		}
		cart.add(product);
	}

	public double getTotal() {
		if (cart.size() > 0) {
			for (Product product : cart) {
				total = total + product.calculateCost();
				product.decreaseStock();
			}
		}
		return total;
	}

	public void deleteProduct(String id) {
		for (int i = 0; i < cart.size(); i++) {
			if ((cart.get(i).getid().equals(id))) {
				cart.remove(i);
			}
		}
	}

	public void offer1(String productid, Offer offer) {
		Manager manager = new Manager();
		//String productid = manager.displaymenu();
		//offer = manager.getOffer();
		for (int i = 0; i < productlist.size(); i++) {
			if ((productlist.get(i).getid().equals(productid))) {
				Product products = productlist.get(i);
				setOffer(offer);
				offer.applyOffer(products);
			}
		}
	}
	
	public void offer() {
		Manager manager = new Manager();
		String productid = manager.displaymenu();
		offer = manager.getOffer();
		for (int i = 0; i < productlist.size(); i++) {
			if ((productlist.get(i).getid().equals(productid))) {
				Product products = productlist.get(i);
				setOffer(offer);
				offer.applyOffer(products);
			}
		}
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public void addProductwithid(String id, int quantity) {
		for (int i = 0; i < productlist.size(); i++) {
			if ((productlist.get(i).getid().equals(id))) {
				productlist.get(i).setQuantity(quantity);
				cart.add(productlist.get(i));
			}
		}
	}

	public double total() {
		return total;
	}

	public String toString() {
		String content = "\nShopping Cart\n";
		content += "\nItemCount\n";
		if (cart.size() > 0) {
			for (Product product : cart) {
				content += product.toString() + "\n";
				total = total + product.calculateCost();
				product.decreaseStock();
			}
		}
		content += "\nTotal Price: AUD" + (total);
		content += "\n";
		return content;
	}

	public void menu() {
		String shop = "y";
		Scanner scan = new Scanner(System.in);
		System.out.println(" Add to Cart (Product Id & Quantity)");
		do {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter the ID of the item: ");
			String productid = scan1.next();
			System.out.println("Enter the quantity: ");
			int quantity = scan1.nextInt();
			addProductwithid(productid, quantity);
			System.out.print("Continue shopping (y/n)? ");
			shop = scan1.next();
		} while (shop.equals("y"));

	}

	public void deletemenu() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Which item would you like to delete ? ");
		String productid = scan.next();
		deleteProduct(productid);
	}

}
