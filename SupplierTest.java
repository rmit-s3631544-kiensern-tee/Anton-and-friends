package supermarketsystem;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class SupplierTest {

	@Test
	public void test() throws FileNotFoundException {
		Supplier supplier = new Supplier();
		String suppliername = supplier.getsupplier(2);
		assertEquals("aabb", suppliername);
	}

}
