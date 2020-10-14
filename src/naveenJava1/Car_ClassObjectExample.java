package naveenJava1;

public class Car_ClassObjectExample {

	String mod;
	int wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_ClassObjectExample a = new Car_ClassObjectExample();
		Car_ClassObjectExample b = new Car_ClassObjectExample();
		Car_ClassObjectExample c = new Car_ClassObjectExample();
		
		a.mod = "BMW";
		a.wheel = 4;
		
		b.mod = "Audi";
		b.wheel = 5;
		
		c.mod = "Alto";
		c.wheel = 6;
		System.out.println(" Before Assigning objects to other Objects.. ");

		System.out.println("Objct A.. "+a.mod);
		System.out.println("Objct A.. "+a.wheel);
		System.out.println("Objct B.. "+b.mod);
		System.out.println("Objct B.. "+b.wheel);
		System.out.println("Objct C.. "+c.mod);
		System.out.println("Objct C.. "+c.wheel);
		
		a=b;
		b=c;
		c=a;
		
		//a.mod=10;
		
		System.out.println(a.mod);
		//c.mod=20;
		
	} 
} 
