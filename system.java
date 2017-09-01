package supermarketsystem;

import java.io.IOException;
import java.util.*;
public class system {
	
	
	public static void main(String[] args) throws IOException {
        Salesprocess sales = new Salesprocess();
        System.out.println("1. Shopping ");
        System.out.println("2. Login ");
        System.out.print("Choose an option : ");
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int function = scan.nextInt();
        if (function == 1 )
        {
        	sales.sales();
        }
        else if (function == 2){
        	Loginpage.login();
        }
        else{
        	System.out.println(" error invalid option ");
        }
        
        
        
	}
	
	

}
