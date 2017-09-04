package supermarketsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaymentTest {
	
	@Test
	//To pay with card;
	public void cardTest() {
		double pay = 50, ctotal = 50;
		boolean test = Payment.payCard(ctotal, pay);
		assertTrue(test);
	}

	
	
	// To pay (Cash)
	@Test
	public void payTest() {
		double cTotal = 100, paid = 50, expected = 50;
		double actual = Payment.payCash(cTotal, paid);
		assertEquals(expected, actual, 0.001);
	}
	

}
