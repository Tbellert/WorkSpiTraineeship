package test;

public class House {
	
	String streetname;
	int housenumber;
	String zipcode;	

	public House() {
		System.out.println("This is the default constructor");
	}

	public House(String street, int number, String zip){
		this();
		System.out.println("This is constructor 1");
		this.streetname = street;
		this.housenumber = number;
		this.zipcode = zip;
	}

	{
		System.out.println("This is initializer 1");
	}

	{
		System.out.println("This is initializer 2");
	}

	{
		System.out.println("This is initializer 3");
	}
}