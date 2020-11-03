package naveenJava2;
public class ConstructorConcept {

	int a=10, b=20;
	public ConstructorConcept() {
		System.out.println("Zero Param Constructor.. ");
		System.out.println(a+b);
	}
	public ConstructorConcept(int i)	{
		System.out.println("One Param Constructor.. ");
		System.out.println("i value is "+i);
	}
	
	public ConstructorConcept(int i, int j)	{
		System.out.println("two Param Constructor.. ");
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
	}
	
	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(100, 200);	
	}
}