package softwareassign;

import java.util.Scanner;

public class Supplier {
	
	
	public  static Double supplier(){
		Scanner sc=new Scanner(System.in);
		System.out.println("supplierID");
		String supplierID=sc.nextLine();
		System.out.println("productID");
		String productID=sc.nextLine();
		System.out.println("stock");
		Double stocklevel=sc.nextDouble();
			
		System.out.println(supplierID);
		System.out.println(productID);
		System.out.println(stocklevel);
		return stocklevel;
		
	}
	
	
	
		
}
