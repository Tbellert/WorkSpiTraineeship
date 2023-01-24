class Demo {
	public static void main(String[] args) {
		TV tv = new TV();
		System.out.println(tv.number);
		System.out.println(tv.nieuweMethod());
	}
}

class TV {
int number;

int nieuweMethod() {
	int number = 1;
	return number;
}

}