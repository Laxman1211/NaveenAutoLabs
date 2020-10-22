package collectionns;
import java.util.ArrayList;

public class ArrayListConcept {
	public static void main(String[] args) {
		int a[] = new int[3]; // Static array, size is fixed. 
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		// Dynamic array -- ArrayList 
		// Can contain duplicate values/elements 
		// maintains insertion order 
		// Syncronized 
		// allows random access to fetch the element because it stores the values on the basis of index 
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println("Array Size... "+ar.size());	
		ar.add(40);
		ar.add(50);
		ar.add(50);
		System.out.println("Array Size... "+ar.size());
		
		ar.add(12.33);
		ar.add("Test");
		ar.add('A');
		ar.add(true);
		
		System.out.println(ar.size()); // size of ArrayList
		System.out.println(ar.get(4)); 
		
		// to print all values from the ArrayList 
		// 1. for loop
		// 2. using Iterator
		for (int i=0; i<ar.size(); i++) {
			System.out.println("Array elements.. "+ar.get(i));
		}
		
		// non generic Vs generic 
		ArrayList<Integer> ar1 = new ArrayList<>();
		ar1.add(1000);
		// ar1.add("selenium");  Error 
		// ar1.add(selenium);  Error 
		
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("QTP");
		// ar2.add(1223); Error 
		
		
	} 
} 