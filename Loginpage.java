package supermarketsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Loginpage {
	
	private String username;
	private String password;
	private List <Employee> employeelist = new ArrayList<>();
	
	
	public void addEmployee(Employee employee){
		employeelist.add(employee);
	}
	
	public boolean login (String username ,String password){
		for (int i = 0; i < employeelist.size(); i++){
			 if (employeelist.get(i).getUsername().equals(username) &&
					 employeelist.get(i).getPassword().equals(password)){
				 return true;
			 }
		}
		return false;
	}
	
	public void displaymenu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username : ");
		username = scan.next();
		System.out.println("Enter Password : ");
		password = scan.next();
		boolean success = login(username,password);
		if (success == true){
			System.out.println("Login successful ");
		}
		else if (success == false){
			System.out.println("Incorrect username or password ");
		}
	}
	
}	