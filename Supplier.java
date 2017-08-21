package supermarketsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Supplier {

private Supplier supplier;
private int supplierid;
private String suppliername;
private Double stocklevel;

	public Supplier(){
		
	}
	public Supplier(int supplierid, String suppliername, Double stocklevel2){
		this.supplierid = supplierid;
		this.suppliername = suppliername;
		this.stocklevel = stocklevel2;
	}
	
	public String getsupplier(int supplierid) throws FileNotFoundException{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(new File("suppliername.txt"));;
		List<String> line = new ArrayList<String>();
		while (sc.hasNextLine()) {
		  line.add(sc.nextLine());
		}

		String[] suppliername = line.toArray(new String[0]);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(new File("stocklevel.txt"));
		List<String> lines = new ArrayList<String>();
		while (scan.hasNextLine()) {
			  lines.add(scan.nextLine());
			}

		String[] stocklevel = lines.toArray(new String[0]);
		
		Double [] stock = new Double[stocklevel.length];
	    for(int i=0 ; i < stocklevel.length; i++){  
		        stock[i] = Double.parseDouble(stocklevel[i]);  
	    }
	    
	    int available = 0;
        for(int i = 0 ; i <suppliername.length; i++)
        {
        	if (supplierid == i)
        	{
        		  this.supplierid = supplierid;
        		  this.suppliername = suppliername[i];
        		  this.stocklevel = stock[i];
        		  available = 1;
        		  supplier = new Supplier(this.supplierid, this.suppliername, this.stocklevel);
        		  System.out.println(this.suppliername);
        		  System.out.println(this.stocklevel);
        	}
        }
        	if(available==0){
        		System.out.print("Fail");
        	}
		return this.suppliername;
	}
		
	}

