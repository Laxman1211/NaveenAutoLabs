package naveenJava1;

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println("Regular main() method... ");	
		MethodOverloading m = new MethodOverloading();
		m.sum();
		m.sum(10);
		m.sum(12, 32);
	}	
	public static void main(String[] args, String[] abc) {
		System.out.println("extra main() method... ");		}
	
	public void sum() {	
		System.out.println("no params... ");	}
	
	public void sum(int a) {
		System.out.println("1 int params... ");		}
	
	public int sum(int b, int c) {
		System.out.println("2 int params... ");	
		return b;	}
}