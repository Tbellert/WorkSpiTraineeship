import java.util.Scanner;

class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Television samsung = new Samsung();
	
		System.out.println("There is a Samsung TV.");
		System.out.println("Press 'y' to turn on, press 'n' to turn off");
		String input = scanner.next();
		
		if (input.toLowerCase().equals("y")) {
			samsung.on();
		} else if (input.toLowerCase().equals("n")) {
			samsung.off();
		}
		
		System.out.println("You grab the remote");
		System.out.println("Current channel is: " + samsung.getCurrentChannel());
		System.out.println("Would you like to switch channel? Press any number");
		int inputChannel = scanner.nextInt();
		try {
			samsung.setCurrentChannel(inputChannel);
		
		} catch (TvNotOnException e) {
			System.out.println("zet eerst je tv aan");
		}
		
		
		System.out.println("Press 'y' to turn on, press 'n' to turn off");
		
	}
}
