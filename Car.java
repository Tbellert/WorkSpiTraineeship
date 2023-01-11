public class Car {
	public String brand;
	public String type;
	public int constructionYear;
	public int horsepower;
	public int numberOfDoors;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getType() {
		return type;
	}		
	public void setType(String type) {
		this.type = type;
	}

	public int getConstructionYear() {
		return constructionYear;
	}		
	public void setConstructionYear(int year) {
		constructionYear = year;
	}

	public int getHorsepower() {
		return horsepower;
	}		
	public void setHorsepower(int hp) {
		horsepower = hp;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}		
	public void setNumberOfDoors(int doors) {
		numberOfDoors = doors;
	}
}