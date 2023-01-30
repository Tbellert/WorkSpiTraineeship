package Streams;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	void doAthing() {
		
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		// stream with method filter and forEach to print which number equals 4
		numbers.stream().filter(n -> n == 4).forEach(n -> {
			System.out.println(n);
		});
		
		// reduce to add up numbers
		Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		
		// stream with method filter and forEach to print which number equals 4
		numbers.stream()
			.filter(n -> n % 2 == 1)
			.map(n -> n*n)
			.forEach(System.out::println);
	}	
}
