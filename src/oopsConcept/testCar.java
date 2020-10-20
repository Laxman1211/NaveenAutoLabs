package oopsConcept; 

public class testCar { 

	public static void main(String[] args) { 
	
	// Static polymorphism or Compile time polymorphism	
	BMW b = new BMW(); 
	b.start(); 
	b.safety(); 
	b.fuel(); 
	b.stop(); 
	b.engine();
	
	System.out.println(" ************** "); 
	
	Car c = new Car();
	c.start();
	c.stop();
	c.fuel();
	
	System.out.println(" ************** ");
	
	// child class object can be referred by parent class reference variable 
	// dynamic polymorphism or run time polymorphism 
	// Top Casting.. 
	Car c1 = new BMW();  
	c1.start(); 
	c1.stop(); 
	c1.fuel(); 
	
	// Down casting 
	BMW b1 = (BMW)new Car(); // class Cast Exception 
	} 
} 
