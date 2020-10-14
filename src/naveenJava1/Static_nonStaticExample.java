package naveenJava1;
public class Static_nonStaticExample {
	String name = "Tom";
	static int age = 24;
	public static void main(String[] args) {
		sum();
		Static_nonStaticExample.sum();
		System.out.println("age.."+age);
		System.out.println("Class name with method calling.. Age.. "+Static_nonStaticExample.age);
		// how to call non static methods and variables..
		Static_nonStaticExample s = new Static_nonStaticExample();
		s.sendMail();
		System.out.println("name "+s.name);
		// can we access static methods by using object reference..?  Yes.
		s.sum();
		System.out.println(s.age);			}
	public static void sum() {
		System.out.println("static sum method..");   }
	public void sendMail() {
		System.out.println("non-static sendMail method.."); 	}
}