package supermarketsystem;

import java.util.*;
import java.io.*;
public class Loginpage {
public login() throws IOException  {

		
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(new File("username.txt"));
	List<String> line = new ArrayList<String>();
	while (sc.hasNextLine()) {
	  line.add(sc.nextLine());
	}

	String[] username = line.toArray(new String[0]);
	
	Scanner scan = new Scanner(new File("password.txt"));
	List<String> lines = new ArrayList<String>();
	while (scan.hasNextLine()) {
		  lines.add(scan.nextLine());
		}

		String[] password = lines.toArray(new String[0]);
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Please enter the username:");
		String inputuser=keyboard.nextLine();
		System.out.println("Please enter the password:");
		String inputpass=keyboard.nextLine();
		
		int temp=0;
		for(int i=0;i<username.length;i++)
		{
			if(inputuser.equals(username[i])&&inputpass.equals(password[i]))
			{
				System.out.print("Success");
				temp=1;
				break;
			}
		
		}
		if(temp==0){
			System.out.print("Fail");
			
		}
		

}
	

}
