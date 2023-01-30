package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class Box<E> implements Iterable<E> {

	private List<E> content = new ArrayList<>();

	public void add(E element) {
			content.add(element);
	}
	
	public void remove(E element) {
		content.remove(element);
}
		
	public Iterator<E> iterator() {
		return content.iterator();
	}

	public void iterate() {
		for (E element : content) {
			System.out.println(element);
		}
	}

	public void forEach(Consumer<? super E> action) {
		content.forEach(action);
	}
}
