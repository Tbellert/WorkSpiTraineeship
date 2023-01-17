package webshop;

public class Klant {
	private int credit;

	public String firstName;
	public String lastName;
	

	public Klant(String firstName, String lastName, int credit) {
		this.credit = credit;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
	}
}