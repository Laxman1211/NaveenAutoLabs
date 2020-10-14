package naveenJava1;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 10, c; 		
		if(a==b) {
			System.out.println("a and b are equal");
		}
		else 
		{
			System.out.println("a and b are not equal");
		}
		System.out.println("#########... ");
		int i = 50;
		int j = 40;
		int k = 60;
		if(i>j & i>k)
			System.out.println("i is greater..");
		else if(j>k)
			System.out.println("j is greater..");
		else 
			System.out.println("k is greater.. ");
	}
}