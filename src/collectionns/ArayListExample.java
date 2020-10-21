package collectionns; 
import java.util.ArrayList; 

public class ArayListExample { 
	public static void main(String[] args) { 
		// Methods: add(), remove(), clear() 
		ArrayList ar = new ArrayList(); 
		ar.add(100); 
		ar.add("Tom"); 
		ar.add('L'); 
		ar.add(12.34); 
		
		System.out.println(ar.size()); 
		ar.add(100); 
		ar.add(200); 
		System.out.println(ar.size()); 
		System.out.println(ar.get(2)); 
		ar.remove(2); 
		System.out.println(ar.size()); 
		System.out.println(ar.get(2)); 
		
		for(int i = 0; i<=ar.size(); i++) { 
			System.out.println("list elements "+ar.get(i));
		} 
		
		ArrayList<Integer> ar1 = new ArrayList<>(); 
		ar1.add(100); 
		ar1.add(200); 
		// ar1.add("kohli");	// error 
		System.out.println(ar1.size()); 
		ar1.clear(); 
		System.out.println(ar1.size()); 

		ArrayList<String> ar2 = new ArrayList();
		ar2.add("John"); 
		ar2.add("kate"); 
		// ar2.add(123); // error 
	} 
} 