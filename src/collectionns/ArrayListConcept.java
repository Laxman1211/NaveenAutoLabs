package collectionns;
import java.util.ArrayList;
import java.util.Iterator;

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
		
		// ArrayList<E> ar3 = new ArrayList<E>(); 

		// Employee Class Object 
		Employee e1 = new Employee("Laxman", 29, "IT");
		Employee e2 = new Employee("Tom", 92, "QA");
		Employee e3 = new Employee("Peter", 39, "Dev");
		
		// create a ArrayList
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// Iterator to traverse values 
		Iterator<Employee> it = ar4.iterator(); 
		while(it.hasNext())	{	
		Employee ee = it.next(); 
		System.out.println(ee.name);
		System.out.println(ee.age);
		System.out.println(ee.dept);
		}
		System.out.println(" ************** "); 
		// addAll()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar5.add("Dev");
		ar5.add("QA");
		ar5.add("Admin");
		
		ar5.addAll(ar6);
		for(int i=0; i<ar5.size(); i++) {
		System.out.println(ar5.get(i));	
		}
		
		System.out.println(" ************** "); 
		// removeAll()
		ar5.removeAll(ar6);
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		} 
		// retainAll
		ArrayList<String> ar7 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("QA");	
		
		ar7.retainAll(ar8);
		for(int i=0; i<ar7.size(); i++) {
			System.out.println(ar7.get(i));
		} 
		
	} 
} 