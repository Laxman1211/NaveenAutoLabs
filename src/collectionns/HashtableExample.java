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
		System.out.println(h.get('C')); 		
		h.put(3, "Tom");
		//h.clear();
		
		Hashtable<Integer, Integer> hs = new Hashtable<Integer, Integer>();
		hs.put(1, 1000);
		// hs.put('A', 200); // Error 
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(10, "Peter");
	} 
} 