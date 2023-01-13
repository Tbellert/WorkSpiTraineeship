public class Tree {
	
	String type;
	String biome;
	int numberOfLeafs;
	
	public Tree() {
		System.out.println("In constructor 1");
	}

	public Tree(String type, String biome) {
		System.out.println("In constructor 2");
		this.type = type;
		this.biome = biome;
	}

	public Tree(int numberOfLeafs) {
		System.out.println("In constructor 3");
		this.numberOfLeafs = numberOfLeafs;
	}
	
	// Iniializer
	{
		System.out.println("In initializer block");
	}

	{
		System.out.println("In initializer block2");
	}
}