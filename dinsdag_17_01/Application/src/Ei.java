public class Ei {
	private double diameter;
	private String color;
	private boolean hasSpots;
	
	public Ei(double diameter, String color, boolean hasSpots){
		this.diameter = diameter;
		this.color = color;
		this.hasSpots = hasSpots;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isHasSpots() {
		return hasSpots;
	}

	public void setHasSpots(boolean hasSpots) {
		this.hasSpots = hasSpots;
	}
	
	public String toString() {
		if(hasSpots) {
			return "Het ei is " + this.diameter + "cm groot, " + this.color + " van kleur, en het ei heeft vlekken.";   
		} else {
			return "Het ei is " + this.diameter + "cm groot, " + this.color + " van kleur, en het ei heeft geen vlekken.";   
		}
	}
}
