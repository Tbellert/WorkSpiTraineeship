public class Vogel extends Chordata {
	private String soort;
	private static String day = "Tuesday";
	private final String birthplace;
	private static final String nemesis = "Wright Brothers";

	public Vogel(String soort, String birthplace) {
		this.soort = soort;
		this.birthplace = birthplace;
	}
	public static String getDay() {
		return day;
	}
	public static void setDay(String day) {
		Vogel.day = day;
	}
	public String getSoort() {
		return soort;
	}

	public void setSoort(String soort) {
		this.soort = soort;
	}
	
	void maakGeluid(String value) {
		System.out.println(value);
	}
	
	void maakGeluid(int amount, String value ) {
		System.out.println(amount + " X " + value);
	}
	

}