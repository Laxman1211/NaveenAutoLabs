package naveenJava1;
public class StringConcat {
	
	public static void main(String[] args) {
		int a = 10; 
		int b = 20; 
		
		String x = "Hello"; 
		String y = "World"; 
		
		Double c = 12.33; 
		Double d = 23.45; 

		System.out.println(a+b); 
		System.out.println(x+y); 
		System.out.println(a+b+x+y); 
		System.out.println(x+y+a+b); 
		System.out.println(a+b+x+y+c+d); 
		System.out.println(x+y+(a+b)); 
		System.out.println(a+b+(x+y)); 		
	}
}
