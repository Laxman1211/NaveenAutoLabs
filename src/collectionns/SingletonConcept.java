package collectionns;

public class SingletonConcept {

	private static SingletonConcept singleton_instance = null;
	public String str;

	private SingletonConcept() {
		str = "Hey this is Singleton Concept";
	}

	public static SingletonConcept getInstance() {
		if (singleton_instance == null) {
			singleton_instance = new SingletonConcept();
		}
		return singleton_instance;
	}

	public static void main(String[] args) {
		SingletonConcept x = singleton_instance.getInstance();
		SingletonConcept y = singleton_instance.getInstance();
		SingletonConcept z = singleton_instance.getInstance();

		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}
}