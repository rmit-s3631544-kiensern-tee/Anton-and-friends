package supermarketsystem;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;

public class SupplierTest {

	@Test
	public void getstocklevel() {
		Supplier supplier = new Supplier();
		int expected = supplier.getstock("s01");
		assertEquals(100, expected);

	}
	
	@Test
	public void decreasestocklevel(){
		Supplier supplier = new Supplier();
		supplier.reducestock("s01");
		int expected = supplier.getstock("s01");
		assertEquals(70, expected);
	}
	
	
	@Test
	public void setStocklevel(){
		Supplier supplier = new Supplier();
		supplier.setstocklevel(30, "s01");
		int expected = supplier.getstock("s01");
		assertEquals(30, expected);
	}
	
	
	@Test
	public void updateStocklevel(){
		Supplier supplier = new Supplier();
		supplier.setstocklevel(30, "s01");
		supplier.updateStock("s01");
		int expected = supplier.getstock("s01");
		assertEquals(100, expected);

	}
	
	
}
