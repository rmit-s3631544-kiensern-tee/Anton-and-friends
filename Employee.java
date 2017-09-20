package supermarketsystem;

public class Employee {

	private String id;
	private String name;
	private String job;
	private String username;
	private String password;
	
	public Employee(String id, String name, String job, String username, String password){
		this.id = id;
		this.name = name;
		this.job = job;
		this.username = username;
		this.password = password;
	}
	
	public String getId(){
		return id;
	}
	
	public String getname(){
		return name;
	}
	
	public String getjob(){
		return job;
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}
	
	
}
