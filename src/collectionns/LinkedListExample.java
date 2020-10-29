package collectionns;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {		
		LinkedList<String> ll = new LinkedList<>(); 
		// add() 
		ll.add("Test"); 
		ll.add("QTP"); 
		ll.add("Selenium"); 
		ll.add("RPA"); 
		ll.add("RFT"); 
		
		// print 
		System.out.println("Content of Linked list.. "+ ll);
		// addFirst()
		ll.addFirst("Laxman");
		// addLast()
		ll.addLast("Automation");
		System.out.println("Content of Linked list.. "+ ll);
		
		// get()
		System.out.println(ll.get(0));

		// set()
		ll.set(0,"Tom");
		System.out.println(ll.get(0));
		
		// remove first and last element 
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of Linked list.. "+ ll);
		
		ll.remove(2);
		System.out.println("Content of Linked list.. "+ ll);
		
		// how to print all the values of LinkedList 
		// for loop 
		System.out.println("using for Loop.. "); 
		for(int n = 0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		// advanced for loop 
		System.out.println("using advanced for Loop.. "); 
		for(String str:ll) {
			System.out.println(str);
		}
		
		// Iterator 
		System.out.println(" ** using Iterator ** ");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// While loop 
		System.out.println(" ** using While loop ** "); 
		int num = 0; 
		while(ll.size()>num) { 
			System.out.println(ll.get(num)); 
			num++;
		}
	} 
} 