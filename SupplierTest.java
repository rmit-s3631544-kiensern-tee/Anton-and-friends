package supermarketsystem;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class SupplierTest {

	@Test
	public void testdecreasestocklevel() {
		Product product = new Product("p01", "milk", 2.00);
		Supplier supplier1 = new Supplier("s01","good lady",product);
		supplier1.reducestock("s01");
		assertEquals(70,supplier1.getstock());
	}
	
	@Test
	public void testupdatestocklevel(){
		Product product = new Product("p01", "milk", 2.00);
		Supplier supplier = new Supplier("s01","good lady",product);
		supplier.setstocklevel(30);
		supplier.updateStock("s01");
		assertEquals(100, supplier.getstock());
	}
	
	@Test
	public void testgetname(){
		Product product = new Product("p01", "milk", 2.00);
		Supplier supplier1 = new Supplier("s01","good lady",product);
		assertEquals("good lady", supplier1.getName());
	}

	@Test
	public void testgetproduct(){
		Product product = new Product("p01", "milk", 2.00);
		Supplier supplier1 = new Supplier("s01","good lady",product);
		assertEquals(product, supplier1.getProduct());
	}
}
