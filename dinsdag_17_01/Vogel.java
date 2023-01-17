class Vogel {
	private String soort;

	public String getSoort() {
		return soort;
	}

	public void setSoort(String soort) {
		this.soort = soort;
	}

	void maakGeluid(int amount, String value ) {
		System.out.println(amount + " X " + value);
	}
}