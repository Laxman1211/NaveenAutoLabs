package naveenJava1;
public class GlobalLocalVariables {
	// Global Variables 
	String name = "Laxman";
	int age = 12;
	
	public void sum() //Local variables, Instance variables 
	{
		int i = 10;
		int j = 20;
		int k= i+j;
	}
	public static void main(String[] args) {
		int a = 23; 
		System.out.println("a = "+a);
		GlobalLocalVariables g = new GlobalLocalVariables();
		System.out.println(g.age);
		System.out.println(g.name);
		g.age = 22;
		g.name = "Lucky";
		System.out.println(" ############## ");
		System.out.println(g.age);
		System.out.println(g.name);
	}
}