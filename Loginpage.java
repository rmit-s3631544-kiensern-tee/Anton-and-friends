package supermarketsystem;

import java.util.*;
import java.io.*;
public class Loginpage {

	public static void login(String user, String pass) throws IOException  {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(new File("usernameandpassword.txt"));
		String username = scan.next();
		String password = scan.next();
		
		
		if (user.equals(username) && pass.equals(password))
		{
			System.out.print("You have been successfully log in ");
			
		}
		else
		{
			System.out.print("incorrect username or password");
		}
	}
	
	

}
