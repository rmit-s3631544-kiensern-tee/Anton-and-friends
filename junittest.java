package softwareassign;

import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;

public class junittest {
	String[] array;
	login loginpass;
	String[] array1;
	login loginuser;
	
	@Before
	public void setup1(){
		loginuser=new login();
		array1=new String[]{"username123"};
	}
	@Test
	public void checkuse1r() throws IOException{	
		assertEquals("success",login.checkuser(array1));
	}
	
	@Before
	public void setup(){
		loginpass=new login();
		array=new String[]{"password123"};
	}
	@Test
	public void checkpass1() throws IOException{
		assertEquals("success",login.checkpass(array));
	}

}
