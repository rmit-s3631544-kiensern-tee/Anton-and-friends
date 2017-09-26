package supermarketsystem;

public class Customer {

	private String CName;
	private String DOB;
	private int lp;
	private String cid;
	
	public Customer(String CName, String DOB, int lp, String cid){
		this.CName = CName;
		this.DOB = DOB;
		this.lp = lp;
		this.cid = cid;
	}
	
	public String getCName(){
		return CName;
	}
	
	public String getDOB(){
		return DOB;
	}
	
	public int getlp(){
		return lp;
	}
	
	public String getcid(){
		return cid;
	}
	
	
}