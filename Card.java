package supermarketsystem;

public class Card {

	String cardName;
	String cardNo;
	String cardExpire;
	
	public String setName (String name) {
		cardName = name;
		return name;
	}
	
	public String setNo (String num) {
		cardNo = num;
		return num;
	}
	
	public String setExpire (String date) {
		cardExpire = date;
		return date;
	}
	
	public void printDetails() {
		System.out.println("You have entered:");
		System.out.printf("Card Name: %s \n", cardName);
		System.out.printf("Card No.: %s \n", cardNo);
		System.out.printf("Expire date: %s \n", cardExpire);
	}
}
