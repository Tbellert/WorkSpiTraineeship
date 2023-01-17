package webshop;
import webshop.Klant;

public class Webshop {
	private boolean open;
	private Klant customer;	
	
	public boolean isOpen() {
		System.out.println("Webshop status: " + open);
		return open;
	}

	public void setOpen(boolean value) {
		if (value == true) {
			this.open = value;
			System.out.println("Starting up webshop...");

		} else {
			System.out.println("Already open!");
		}
	}

	public Klant getCustomer() {
		return customer;
	}

	public void setCustomer(String name, String lName, int credit) {
		Klant customer = new Klant(name, lName, credit);
		this.customer = customer;
		System.out.println("A wild " + customer.firstName + " " + customer.lastName + " appears...");
		System.out.println("It appears " + customer.firstName + " has " + credit + " credits!");
	}
}