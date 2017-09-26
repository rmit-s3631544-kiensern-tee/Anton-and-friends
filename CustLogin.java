package supermarketsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class CustLogin {
	
	private String cid;
	private List <Customer> customerlist;
	
	public void addCustomer(Customer customer){
		customerlist.add(customer);
	}
	
	public boolean login (String cid){
		for (int i = 0; i < customerlist.size(); i++){
			 if (customerlist.get(i).getcid().equals(cid)){
				 return true;
			 }
		}
		return false;
	}
	
	public void displaymenu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Customer ID: ");
		cid = scan.next();
		boolean success = login(cid);
		if (success == true){
			System.out.println("Login successful ");
		}
		else if (success == false){
			System.out.println("Incorrect cid or password ");
		}
	}
	
}	