package ArrayList;
import java.util.ArrayList;

class Demo {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Timo");
		names.add("Roger");
		names.add("Gideon");
		names.add("Jeroen");
		names.add("Micheal");
		names.add("Glenn");
		names.add("Wouter");
		
//		for (String name : names) {
//			System.out.println(name);
//		}

		Namelist list = new Namelist();

//		list.makeList(names);
		
		Box<String> newNames = new Box<>();
		
		newNames.add("Hoi");
		newNames.add("hallo");
		newNames.iterate();
		newNames.remove("Hoi");
		newNames.iterate();
		
		for (String name : newNames) {
			System.out.println(name);
		}
		
		
	}
}

class Namelist {
	
	void makeList(ArrayList<String> names) {

		for (String name : names) {
			System.out.println(name);
		}
	}
}