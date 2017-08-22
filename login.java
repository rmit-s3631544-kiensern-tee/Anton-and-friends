package softwareassign;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // I use scanner because it's command line.

public class login{
	
	/*public login() throws IOException  {
		
		
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
		
		
		
		

} */
	public static String checkuser(String b[]) throws FileNotFoundException{
		String inputuser = null;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(new File("username.txt"));
		List<String> line = new ArrayList<String>();
		while (sc.hasNextLine()) {
		  line.add(sc.nextLine());
		}
		String[] username = line.toArray(new String[0]);
		String temp0=null;
		for(int i=0;i<b.length;i++){
			if(b[i].equals(username[i])){
				temp0="success";
			}
		}
		return temp0;
		}
	
	public static String checkpass(String a[]) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("password.txt"));
		List<String> lines = new ArrayList<String>();
		while (scan.hasNextLine()) {
			  lines.add(scan.nextLine());
			}
			String[] password = lines.toArray(new String[0]);
		String temp=null;
		for(int i=0;i<a.length;i++){
			if(a[i].equals(password[i]) ){
				temp="success";
				
			}
			
		}
		return temp;
		}
	
}


