package supermarketsystem;

public class BuyXitemgetYitemfree implements Offer {

	private int Xitem;
	private int Yitem;
	
	public BuyXitemgetYitemfree (int Xitem, int Yitem){
		this.Xitem = Xitem;
		this.Yitem = Yitem;
	}
	
	@Override
	public void applyOffer(Product product){
		if (product.getQuantity()>= Xitem){
			int quantity= product.getQuantity() / (Xitem + Yitem);
			double unitPrice = product.getPrice();
			double freeitem = unitPrice * quantity;
			product.setFreeitem(freeitem);;;
		}
	}
}
