package webshop;
import webshop.Klant;

public class Webshop {

	private boolean isOnline;
	private boolean freeShipping;
	private double priceOfTV;

	public int inBasket;
	public Klant customer;

	String reviewInput;
	String complaint;

	public boolean IsOnline() {
		return isOnline;
	}

	public void setIsOnline(boolean status) {
		this.isOnline = status;
	}

	public boolean getFreeShipping() {
		return freeShipping;
	}

	public void setFreeShipping(boolean status) {
		this.freeShipping = status;
	}

	public double getPriceOfTV() {
		return priceOfTV;
	}
	
	public void setPriceOfTV(double price) {
		this.priceOfTV = price;
	}
}