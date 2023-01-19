class Application {
	public static void main(String[] args) {
		Final beest = new Opdracht();
		int a = 8;
		int b = 8;
		int c = 2;
		c /= a;
		System.out.println(c);
		
		

	}
}

class Final {
	int getal = 8;
}

class Opdracht extends Final {
	int getal = 7;

	void doeIets(){
		System.out.println("Hoi ik ben de opdracht");
		System.out.println(getal);
	}

}