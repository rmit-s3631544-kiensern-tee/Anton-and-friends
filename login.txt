import java.util.Scanner; // I use scanner because it's command line.

public class Login {
public void run() {
    Scanner scan = new Scanner (new File(""));
    Scanner keyboard = new Scanner (System.in);
    String user = scan.nextLine();
    String password = scan.nextLine(); // looks at selected file in scan

    String inputUser = keyboard.nextLine();
    String inputPassword = keyboard.nextLine(); // gets input from user

    if (inputUser.equals(user) && inputPass.equals(password)) {
        System.out.print("success");
    } else {
        System.out.print("fail");
    }
}
} 