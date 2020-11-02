package naveenJava2;
public class FinallyConcept {
	public static void main(String[] args) {
		test2();
	}
	public static void test1() {
		try {
			System.out.println("Inside test1() method.. ");
			throw new RuntimeException(" test ");
		}	
		catch(RuntimeException e) {
		System.out.println("Inside Catch block");
		}
		finally {
			System.out.println("Inside Finally block ");
		}
	}
	
	public static void test2() {
		int a = 20;
		try {
			System.out.println("Inside test2() method.. ");
			int c = a/0;
		}	
		catch(ArithmeticException e) {
		System.out.println("Inside Catch block");
		}
	}	
}