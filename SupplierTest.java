package supermarketsystem;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class SupplierTest {

	@Test
	public void test() throws FileNotFoundException {
		Supplier[] supply = new Supplier[10];
		Supplier supply1 = new Supplier();
		supply[1] = new Supplier("s02","good lady", 30);
		String expectedvalue = supply[1].toString(); 
		String info = supply1.reducestock("s02", 70);
		System.out.println(info);
		assertEquals(expectedvalue,info);
    	
	}
	
	@Test
	public void test2(){
		Supplier[] supply = new Supplier[10];
		Supplier supply1 = new Supplier();
		supply[1] = new Supplier("s02", "good lady", 100);
		String expectedvalue = supply[1].toString();
		String info = supply1.reducestock("s02", 70);
		System.out.println(info);
		info = supply1.updatestock("s02");
		System.out.println(info);
		assertEquals(expectedvalue,info);		
	}
	
	

}
