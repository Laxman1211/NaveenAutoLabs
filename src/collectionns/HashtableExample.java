package collectionns;
import java.util.Hashtable;

public class HashtableExample {
	public static void main(String[] args) {

		Hashtable h = new Hashtable<>();
		h.put('A', "Hello");
		h.put('B', "mary");
		h.put('C', "Kome");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2)); 
		System.out.println(h.get("C"));
		
		h.put(3, "Tom");
		
	}
}