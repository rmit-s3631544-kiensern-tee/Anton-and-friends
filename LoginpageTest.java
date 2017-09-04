package supermarketsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginpageTest {

	@Test
	public void test() {
		Loginpage login = new Loginpage();
		String result = login.loginuser("bill", "password223");
		String expectedresult = "success";
		assertEquals(expectedresult, result);
	}

}
