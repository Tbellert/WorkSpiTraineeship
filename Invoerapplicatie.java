import java.util.Scanner;

public class Invoerapplicatie {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String invoer = scanner.nextLine();

	/*	// length()
		System.out.println("Enter a number between 0 and " + (invoer.length() - 1)); 

		int tweedeInvoer = scanner.nextInt();
		
		// charAt()
		char firstLetter = invoer.charAt(tweedeInvoer);
		System.out.println(firstLetter);

		char derdeInvoer = tweedeInvoer.indexOf()

		// indexOf()
		
	
		int index = 
*/

		int positie = invoer.indexOf('a');
		System.out.println(positie);

		String a = "Hallo ";
		String b = "Wereld";
		a = a.concat(b);
		
		System.out.println(a);

		String substring = a.substring(2);

		System.out.println(substring);

		
				
	}
}