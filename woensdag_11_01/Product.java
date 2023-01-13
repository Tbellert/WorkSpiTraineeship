import java.util.Scanner;

public class Product {
	public String name;
	public double length;
	public int age;
	public boolean isDoingInternship;
	public short internshipMonth;
	public char firstLetter;
	Scanner scanner = new Scanner(System.in);

	public void addName() {
		System.out.println("What is your name?");
		name = scanner.nextLine();
	}

	public String getName() {
		System.out.println("Name: " + name);
		return name;
	}

	public void addLength() {
		System.out.println("What is your length?");
		length = scanner.nextDouble();
	}

	public double getLength() {
		System.out.println("length: " + length);
		return length;
	}

	public void addAge() {
		System.out.println("What is your age?");
		age = scanner.nextInt();
	}
	
	public int getAge() {
		System.out.println("Age: " + age);
		return age;
	}

	public void addInInternship() {
		System.out.println("Are you doing an internship? true or false");
		isDoingInternship = scanner.nextBoolean();
	}

	public boolean getInInternship() {
		System.out.println("Is doing internship: " + isDoingInternship);
		return isDoingInternship;
	}
	
	public void addInternshipMonth() {
		System.out.println("What month are you in?");
		internshipMonth = scanner.nextShort();
	}

	public short getInternshipMonth() {
		System.out.println("currently in month: " + internshipMonth);
		return internshipMonth;
	}

	public void addFirstLetter() {
		System.out.println("What is you first letter?");
		firstLetter = scanner.next().charAt(0);
	}

	public char getFirstLetter() {
		System.out.println("Firstletter is: " + firstLetter);
		return firstLetter;
	}

	public void setData(String name, char firstLetter, double length, int age, boolean inInternship, short internshipMonth) {
		
		System.out.println("Name: " + name);
		this.name = name;
		System.out.println("First letter: " + firstLetter);
		this.firstLetter = firstLetter;
		System.out.println("Length: " + length);
		this.length = length;
		System.out.println("Age: " + age);
		this.age = age;
		System.out.println("Is doing internship?: " + inInternship);
		isDoingInternship = inInternship;
		System.out.println("Current month: " + internshipMonth);
		this.internshipMonth = internshipMonth;

	}

}