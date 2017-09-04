package supermarketsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class CardTest {

	@Test
	public void nametest() {
		String name = Card.setName("Name");
		assertEquals("Name", name);
	}
	
	@Test
	public void numtest() {
		String num = Card.setNo("123456789");
		assertEquals("123456789", num);
	}
	
	@Test
	public void datetest() {
		String date = Card.setExpire("10/10/20");
		assertEquals("10/10/20", date);
	}
}
