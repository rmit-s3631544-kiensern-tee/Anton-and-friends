package supermarketsystem;


public class Supplier {

private Supplier[] supplier = new Supplier[10];
private String supplierid;
private String suppliername;
private int stocklevel;

	public Supplier(){
		supplierlist();
	}
	
	public Supplier(String supplierid, String suppliername, int stocklevel2){
		this.supplierid = supplierid;
		this.suppliername = suppliername;
		this.stocklevel = stocklevel2;
	}
	
	public void supplierlist(){				// list of all the supplier and the stock level
		supplier[0] = new Supplier("s01", "fresh onions", 100);
		supplier[1] = new Supplier("s02", "good lady", 100);
		supplier[2] = new Supplier("s03", "famous amos", 100);
		supplier[3] = new Supplier("s04", "doritos", 100);
		supplier[4] = new Supplier("s05", "dutch lady", 100);
		supplier[5] = new Supplier("s06", "blackcoco", 100);
		supplier[6] = new Supplier("s07", "caram", 100);
		supplier[7] = new Supplier("s08", "starbucks", 100);
		supplier[8] = new Supplier("s09", "krispy kreme", 100);
		supplier[9] = new Supplier("s10", "moonrice", 100);
	}
	
	
	public String getsuppliername(String supplierid){		// return the supplier name 
		int stock;
		String name = null;
		for (int i = 0; i< supplier.length; i++){
			if (supplier[i].getID().compareTo(supplierid) == 0){
				name = supplier[i].toString();
			}
		}
		return name;
	}
	
	public String updatestock(String supplierid){				// update the stock level of the product
		int stocklevel = 0;
		String name1 = null;
		for (int i = 0; i< supplier.length; i++){
			if (supplier[i].getID().compareTo(supplierid) == 0){
				stocklevel = supplier[i].getstock();
				String name = supplier[i].getName();
				if (stocklevel < 50){						//if stock leve drop below 50 update the stock
					stocklevel = 100;
					supplier[i] = new Supplier(supplierid, name, stocklevel);
					name1 = supplier[i].toString();
				}	
				}
			}
		return name1;
		}
	
	
	public String reducestock(String supplierid, int quantity){		//reduce the stock level of the product
		int stock = 0;
		String info = null;
		String name;
		for (int i = 0; i< supplier.length; i++){
			if (supplier[i].getID().compareTo(supplierid) == 0){
				name = supplier[i].getName();
				stock = supplier[i].getstock();
				stock -= quantity;
				supplier[i]= new Supplier(supplierid, name, stock);
				info = supplier[i].toString();
			}
		}
		return info;
	}
	
	
	public String supplyreport(){						//produce the report of all the supplier and the stock level
		String contents = "Supply report\n";
		for (int i = 0; i < supplier.length; i++){
		      contents += supplier[i].toString() + "\n";
		      contents += "\n";
		}
		return contents;
	}
	
	public String toString()
	{
		return String.format("SupplierId : %s\nSupplierName: %s\nStock level : %d\n", 
				this.supplierid, this.suppliername, this.stocklevel);
	}
	
	public String getID(){
		return this.supplierid;
	}
	
	public String getName(){
		return this.suppliername;
	}
	
	public int getstock(){
		return this.stocklevel;
	}
	
	
	
}
