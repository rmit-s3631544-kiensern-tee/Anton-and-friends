package supermarketsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class cartTest {

	@Test
	public void test() {
		cart cart = new cart();
		cart cart1 = new cart();
		cart.addtocart("p02", 2);
		String shopping = cart.toString();
		cart1.addtocart("p02",2);
		System.out.print(cart1);
		cart1.addtocart("p03", 1);
		System.out.print(cart1);
		cart1.removefromcart("p03", 1);
		System.out.print(cart1);
		String result = cart1.toString();
		assertEquals(shopping, result);
		
		
	}

}
