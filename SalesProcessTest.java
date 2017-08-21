package supermarketsystem;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class SalesProcessTest {

	/*@Test
	public void ProductIdtest() {
		int id = product.setid("2");
		assertEquals("2", id);
	}
	@Test
	public void ProductNametest() {
		String name = product.setName("2");
		assertEquals("2", name);
	}*/
	
	@Test
	public void ProductPricetest() throws IOException {
		double price = Salesprocess.main(10);
		assertEquals(10, price);
	}
	
	/*
	@Test
	public void ProductQuantitytest() throws IOException {
		int quantity = Salesprocess.main(10);
		assertEquals(10, quantity);
	}*/
}
