public class Application {
	
	public static void main(String[] args) {
	
		Product person1 = new Product();
		Product person2 = new Product();
		Product person3 = new Product();
		Product person4 = new Product();

		Car car1 = new Car();
		
		car1.setBrand("Volvo");
		car1.setType("V50");
		car1.setConstructionYear(2005);
		car1.setHorsepower(120);
		car1.setNumberOfDoors(5);

		person1.name = "Timo";
		person1.firstLetter = 'T'; 
		person1.length = 1.87;
		person1.age = 32;
		person1.isDoingInternship = true;
		person1.internshipMonth = 1;
		 
		person2.name = "Gert";
		person2.firstLetter = 'G';
		person2.length = 1.92;
		person2.age = 18;
		person2.isDoingInternship = false;
		person2.internshipMonth = 0;
		
		/*person3.addName();
		person3.getName();
		person3.addLength();
		person3.getLength();
		person3.addFirstLetter();
		person3.getFirstLetter();
		person3.addAge();
		person3.getAge();
		person3.addInInternship();
		person3.getInInternship();
		person3.addInternshipMonth();
		person3.getInternshipMonth();*/

		person4.setData("Timo", 'T', 1.87, 32, true, (short)1);
		System.out.println("Brand: " + car1.getBrand());
		System.out.println("Type: " + car1.getType());
		System.out.println("Year Constructed: " + car1.getConstructionYear());
		System.out.println("Horsepower: " + car1.getHorsepower());
		System.out.println("Number of Doors: " + car1.getNumberOfDoors());
	
	}
}