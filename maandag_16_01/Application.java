import webshop.Webshop;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Webshop webshop = new Webshop();

		int logInAttempts = 3;
		String wachtwoord = "java";
		
		while (logInAttempts > 0) {
			System.out.println("Please enter the password");
			String input = scanner.nextLine();
			if (wachtwoord.equals(input)) {
				System.out.println("Correct password!");
				break;
			} else {
				System.out.println("Incorrect password!");
				logInAttempts--;
					if (logInAttempts == 0) {
						System.exit(0);
					}
				System.out.println("You have " + logInAttempts + " attempts left.");
			}
		}

		// Open the webshop
		webshop.isOpen();
		System.out.println("Would you like to open the webshop?");
		boolean userInput = scanner.nextBoolean();
		webshop.setOpen(userInput);
		webshop.isOpen();
		
		//
		webshop.setCustomer("henk", "willems", 100);



		


	}
}