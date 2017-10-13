package supermarketsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Supplier {

	private String supplierid;
	private String suppliername;
	private int stocklevel;
	Product product = new Product();
	List<Product> productlist = product.getProductlist();
	List<Supplier> supplierlist;
	
	public Supplier(String supplierid, String suppliername,Product product , int stock){
		this.supplierid = supplierid;
		this.suppliername = suppliername;
		this.stocklevel = stock;
		this.product = product;
	}
	public Supplier(){
		Supplierlist();
	}
	
	public int getSize(){
		return supplierlist.size();
	}
	
	public void Supplierlist(){
		supplierlist = new ArrayList<>();
		Supplier supplier1 = new Supplier("s01", "pauls milk", productlist.get(0),100);
		Supplier supplier2 = new Supplier("s02", "starbucks", productlist.get(1),100);
		Supplier supplier3 = new Supplier("s03", "sunrice", productlist.get(2),100);
		supplierlist.add(supplier1);
		supplierlist.add(supplier2);
		supplierlist.add(supplier3);
	}
	
	public void menu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Choice : ");
		System.out.println("1. update stock");
		System.out.println("2. reduce stock");
		System.out.println("3. check stock");
		System.out.println("4. set stock level");
		int choice = scan.nextInt();
		if (choice == 1){
			System.out.println("Enter supplier ID");
			String id = scan.nextLine();
			updateStock(id);
		}else if (choice == 2){
			System.out.println("Enter Supplier Id");
			String id = scan.nextLine();
			reducestock(id);
		}else if (choice == 3 ){
			System.out.println("Enter Supplier Id");
			String id = scan.nextLine();
			getstock(id);
		}else if (choice == 4){
			System.out.println("Enter Supplier Id");
			String id = scan.nextLine();
			System.out.println("Enter Stocklevel");
			int stocklevel = scan.nextInt();
			setstocklevel(stocklevel, id);
		}
	}
	
	
	
	public void reducestock(String supplierid){
		for (int i = 0; i < supplierlist.size(); i++) {
			if ((supplierlist.get(i).getID().equals(supplierid))) {
					int stocklevels = supplierlist.get(i).stocklevel; 
					stocklevels	= stocklevels - productlist.get(i).getStock();
					supplierlist.get(i).stocklevel = stocklevels;
					
			}
		}
	}
	
	public void updateStock(String supplierid){
		for (int i = 0; i < supplierlist.size(); i++) {
			if ((supplierlist.get(i).getID().equals(supplierid))) {
				int stocklevels = supplierlist.get(i).stocklevel;
				if (stocklevels <= 50){
					stocklevels = 100;
					supplierlist.get(i).stocklevel = stocklevels;
				}
			}
		}
		
	}
	
	public void setstocklevel(int stock, String supplierid){
		for (int i = 0; i < supplierlist.size(); i++) {
			if ((supplierlist.get(i).getID().equals(supplierid))) {
				 supplierlist.get(i).stocklevel = stock;
			}
		}
		
	}
		
	public String getID(){
		return this.supplierid;
	}
	
	public String getName(){
		return this.suppliername;
	}
	
	public int getstock(String id){
		int stocklevels = 0; 
		for (int i = 0; i < supplierlist.size(); i++){
			if((supplierlist.get(i).getID().equals(id))){
				stocklevels = supplierlist.get(i).stocklevel;
			}
		}
		return stocklevels;
	}
	
	public Product getProduct(){
		return product;
	}
	
	
}
