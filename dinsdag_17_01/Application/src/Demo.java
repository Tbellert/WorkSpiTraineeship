
public class Demo{

	public static void main(String[] args) {
		Vogel vogel1 = new Vogel("Kraai", "Japan");
		Vogel vogel2 = new Vogel("Merel", "Zuid-oost Oeganda");
		
		System.out.println(vogel1.getSoort());
		vogel1.maakGeluid(3, "Peep");
		vogel1.setEi(new Ei(5.46, "grijs", true));
		vogel2.maakGeluid("Piep");
		
		System.out.println(vogel1.getEi());
		System.out.println();
		
		System.out.println(vogel1.getDay());
		System.out.println(Vogel.getDay());
		Vogel.setDay("Wednesday");
		System.out.println(vogel1.getDay());
		Chordata vogel6 = new Vogel("Papegaai", "Spanje");
		vogel6.setEi(new Ei(6.02, "geel", false));
		
		System.out.println(vogel6.getEi());
	}
}

