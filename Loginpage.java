package supermarketsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Loginpage {
	
	private String username;
	private String password;
	private List <Employee> employeelist;
	private boolean manager = false;
	private boolean logout = false;
	
	public Loginpage(){
		employeelist = new ArrayList<>();
		Employee employee1 = new Employee("emp1", "tee", "staff manager", "tee1", "password123");
		Employee employee2 = new Employee("emp2", "anton","warehouse staff", "anton1", "password111");
		Employee employee3 = new Employee("emp3","bill","staff","bill1","password222");
		Employee employee4 = new Employee("emp4", "kristen","staff","kristen1","password333");
		employeelist.add(employee1);
		employeelist.add(employee2);
		employeelist.add(employee3);
		employeelist.add(employee4);
	}
	
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
	
	public boolean displaymenu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username : ");
		username = scan.next();
		System.out.println("Enter Password : ");
		password = scan.next();
		boolean success = login(username,password);
			if (success == true){
					System.out.println("Login successful ");
					if (manager(username,password) == true){
						manager = true;
					}
			}
			else if (success == false){
				System.out.println("Incorrect username or password ");
			}
		return false;
	}
	
	public boolean manager(String username, String password){
			if (username.equals("tee1") && password.equals("password123")){
				 return true;
			}
		return false;
	}
	
	public void logout(){
		Scanner scan = new Scanner(System.in);
		System.out.println("would you like to logout y/n");
		String cont = scan.next();
		if (cont.equals("y")){
			System.out.println("logout successful");
			logout = true;
			manager = false;
		}
	}
	
	public boolean getlogout(){
		return logout;
	}
	
	public boolean getManager(){
		return manager;
	}
	
}	