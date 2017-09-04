package supermarketsystem;

public class Loginpage {
Loginpage[] loginlist  = new Loginpage[4];
private String username;
private String password;
	
	public Loginpage(){
		loginarray();
	}
	
	public void loginarray(){
		loginlist[0] = new Loginpage("anton", "password123");
		loginlist[1] = new Loginpage("bill","password223");
		loginlist[2] = new Loginpage("kristen", "password111");
		loginlist[3] = new Loginpage("tee","password333");
	}
	

	public Loginpage(String user, String password){
		this.username = user;
		this.password = password;
	}
	public String loginuser(String username, String password){
		String name = "fail";
		for (int i =0; i < loginlist.length; i++){
			if (loginlist[i].getuser().compareTo(username) == 0 
					&& loginlist[i].getpassword().compareTo(password) == 0 ){
					name = "success";
			}
		}
		return name;
	}
	
	public String getuser(){
		return this.username;
	}
	
	public String getpassword(){
		return this.password;
	}
	
	
	
}	