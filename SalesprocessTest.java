package supermarketsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalesprocessTest {

	@Test
	public void test() {
		cart cart1 = new cart();
		cart1.addtocart("p01", 1);
		String expectedvalue = cart1.toString();
		Salesprocess sales = new Salesprocess();
		String result = sales.sales("p01", 1, "y");
		assertEquals(expectedvalue,result);	

	}
}
