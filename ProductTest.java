package supermarketsystem;

import static org.junit.Assert.*;


import org.junit.Test;

public class ProductTest {
	
	@Test
	  public void testConstructorInitiatesObjectCorrectly() {
		 Product product = new Product("p01","milk", 2);
		 assertEquals(2.0, product.getPrice(),0.000);
		 assertEquals("p01", product.getid());
		 assertEquals("milk", product.getName());
		 assertEquals(30,product.getStock());
	  }
	
	@Test
	public void testDecreaseStocklevel(){
		Product product = new Product("p01","milk",2);
		product.setQuantity(3);
		product.decreaseStock();
		assertEquals(27,product.getStock());
		
	}
	
	@Test
	public void testcalculatecost(){
		Product product = new Product("p01", "milk", 2);
		product.setQuantity(2);
		double total = product.calculateCost();
		assertEquals(4,total,0);
	}
	
	@Test
	public void testupdatestock(){
		Product product = new Product("p01", "milk", 2);
		product.setStock(12);
		product.updateShelf("p01");
		assertEquals(30, product.getStock());
	}
	

	

}
