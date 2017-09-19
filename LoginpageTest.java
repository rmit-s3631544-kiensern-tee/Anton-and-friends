package supermarketsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginpageTest {

	@Test
	public void test() {
		Loginpage login = new Loginpage();
		Employee employee1 = new Employee("emp1", "anton", "sales assistant", "anton1", "password123" );
		login.addEmployee(employee1);
		assertEquals(true, login.login("anton1", "password123"));
	}
	
	@Test
	public void testDisplayMenu(){
		Loginpage login = new Loginpage();
		Employee employee1 = new Employee("emp1", "anton", "sales assistant", "anton1", "password123" );
		login.addEmployee(employee1);
		login.displaymenu();
		
	}

}
