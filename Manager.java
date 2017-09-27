package supermarketsystem;

import java.util.*;

public class Manager {

	private Offer offer;
	private ShoppingCart cart;
	

	public Manager(){
		
	}
	
	public String displaymenu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		System.out.println("1. BuyXitemgetYitemfree");
		System.out.println("2. Promotion ");
		System.out.println("3. discount ");
		String productid = null;
		int choice = scan.nextInt();
		if (choice == 1){
			System.out.println("Enter X : ");
			int x = scan.nextInt();
			System.out.print("Enter Y : ");
			int y = scan.nextInt();
			BuyXitemgetYitemfree freeitem = new BuyXitemgetYitemfree(x,y);
			setOffer(freeitem);
			System.out.print("Enter productid ");
			productid = scan.next();
			return productid;
		}else if (choice == 2){
			System.out.println("Enter promotion ");
			double promo = scan.nextDouble();
			Promotion promtion = new Promotion(promo);
			setOffer(promtion);
			System.out.print("Enter productid ");
			productid = scan.next();
			return productid;
		}else if (choice == 3){
			System.out.println("Enter discount ");
			double dis = scan.nextDouble();
			Discount discount = new Discount(dis);
			setOffer(discount);
			System.out.print("Enter productid ");
			productid = scan.next();
			return productid;
		}
		return productid;
	}
	
	public void setOffer(Offer offer){
		this.offer = offer;
	}
	
	
	public Offer getOffer(){
		return offer;
	}
	
	
	
}
