package naveenJava2;
public class ClassB extends ClassA {

	public ClassB() {
		//super(100);
		//super(100,200);
		System.out.println("ClassB Constructor.. ");
	}
	public ClassB(int k) {
		System.out.println("ClassB(int k).. ");
	}
	public ClassB(int m, int n) {
		System.out.println("ClassB(int m, int n) "+m+ " and  "+n);
	}

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		ClassB obj1 = new ClassB(10);
		ClassB obj2 = new ClassB(111,222);
	}
}