package naveenJava2;
public class ConstructorWithThis {
	String name;
	int age;
	// name = "aaa";
	// age=10;

	public ConstructorWithThis() {
		System.out.println("No param Constructor.. ");
	}

	public ConstructorWithThis(String name, int age) {
		// this.name1 = name;
		this.name = name;
		this.age = age;
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}

	public static void main(String[] args) {
		ConstructorWithThis obj = new ConstructorWithThis();
		ConstructorWithThis obj1 = new ConstructorWithThis("Peter", 20);
	}
}