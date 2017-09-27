package supermarketsystem;

import java.util.*;

public class supermarket {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		Loginpage Login = new Loginpage();
     	Payment pay = new Payment();
		int choice;
		do {
			System.out.println("Select your choice : ");
			System.out.println("1. Login ");
			System.out.println("2. Start Shopping ");
			System.out.println("3. Finish and pay ");
			choice = scan.nextInt();
			
				if (choice == 1) {
					Login.displaymenu();
					boolean manager = Login.getManager();
					do{
						if (manager == true){
							cart.offer();
							Login.logout();
						}
						else{
							cart.deletemenu();
						}
						if (Login.getlogout() == true){
							break;
						}
					}while (Login.getlogout() == false);
				} else if (choice == 2) {
					cart.menu();
				}else if(choice == 3){
					System.out.println(cart);
					pay.payment(cart.getTotal());
				}
		} while (choice == 1 || choice == 2 || choice == 3);
		
		
	}

}
