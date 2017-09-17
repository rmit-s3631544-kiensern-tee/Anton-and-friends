package supermarketsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void testTotal() {
		ShoppingCart cart = new ShoppingCart();
		Product product1 = new Product("p01", "milk", 2);
		product1.setQuantity(2);
		Product product2 = new Product("p02", "coffee", 3);
		product2.setQuantity(2);
		cart.addProduct(product1);
		cart.addProduct(product2);
		assertEquals(10, cart.getTotal(),0);
	}
	
	@Test
	public void testitemsincart(){
		ShoppingCart cart = new ShoppingCart();
		Product product1 = new Product("p01", "milk", 2);
		Product product2 = new Product("p02", "coffee", 3.50);
		cart.addProduct(product2);
		cart.addProduct(product1);
		assertEquals(2, cart.getCartnumber());
		assertEquals(5.50, cart.getTotal(),0);
	}
	
	@Test
	public void removeitem(){
		ShoppingCart cart = new ShoppingCart();
		Product product1 = new Product("p01", "milk", 2);
		Product product2 = new Product("p02", "coffee",3.50);
		cart.addProduct(product2);
		cart.addProduct(product1);
		cart.deleteProduct("p02");
		assertEquals(1,cart.getCartnumber());
		assertEquals(2,cart.getTotal(),0);
	}
	
	
	@Test
	public void addoffer(){
		ShoppingCart cart = new ShoppingCart();
		BuyXitemgetYitemfree freeitem = new BuyXitemgetYitemfree(2,1);
		cart.setOffer(freeitem);
		Product product1 = new Product("p01", "milk", 2);
		product1.setQuantity(3);
		cart.addProduct(product1);
		assertEquals(4,product1.calculateCost(),0);
		
	}
	
	@Test
	public void testPromotion(){
		ShoppingCart cart = new ShoppingCart();
		Promotion promo = new Promotion(1.50);
		cart.setOffer(promo);
		Product product1 = new Product("p01", "milk", 2);
		product1.setQuantity(3);
		cart.addProduct(product1);
		assertEquals(4.50,product1.calculateCost(),0);
	}
	
	@Test
	public void TestDiscount(){
		ShoppingCart cart = new ShoppingCart();
		Discount discount = new Discount(0.30);
		cart.setOffer(discount);
		Product product1 = new Product("p01", "milk", 2);
		cart.addProduct(product1);
		assertEquals(1.40,product1.calculateCost(),0);
	}

}
