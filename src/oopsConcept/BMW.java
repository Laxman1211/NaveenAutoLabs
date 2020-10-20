package oopsConcept;

public class BMW extends Car{

	// when same method is present in the parent and child class with the same name and same no.of arguments..
	// is called method - overriding 
	
	public void start() {
		System.out.println(" BMW - start().. "); 
		}
	
	public void safety() {
		System.out.println(" BMW - safety().. "); 		
		}

}
