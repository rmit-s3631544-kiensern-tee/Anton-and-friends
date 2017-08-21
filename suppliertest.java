package softwareassign;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class suppliertest {
	@Test
	public void checksupplier() throws IOException{
		String supplierID=Supplier.supplier();
		assertEquals("ProductID",supplierID);
	}
	/*@Test
	public void checkproductID() throws IOException{
		String productID=Supplier.supplier();
		assertEquals("ProductID",productID);
	}
	@Test
	public void checkstock() throws IOException{
		Double stock=Supplier.supplier();
		assertEquals("ProductID",stock);
	}*/
}
