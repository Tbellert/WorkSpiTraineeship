import webshop.Webshop;
import webshop.Klant;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Webshop webshop = new Webshop();
		System.out.println("Webshop online status is currently: " + webshop.IsOnline());
		
		System.out.println("Please toggle the status of the webshop. true/false");
		
		boolean userInput = scanner.nextBoolean();
		webshop.setIsOnline(userInput);

		System.out.println("Webshop online status is currently: " + webshop.IsOnline());
		


	}
}