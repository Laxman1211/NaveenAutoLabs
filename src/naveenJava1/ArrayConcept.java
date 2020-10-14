package naveenJava1;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int a[]=new int[4];
		a[0] = 12;
		a[1] = 21;
		a[2] = 18;
		a[3] = 13;
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.println("Array value of "+i+"... "+a[i]);
		}
		
		// Object Array
		Object ob[] = new Object[4];
		ob[0] = 12;
		ob[1] = "Hello";
		ob[2] = 12.34;
		ob[3] = 'v';
		//ob[4] = 111;
		
		for(int k = 0; k<ob.length; k++)
		{
			System.out.println(ob[k]);	
		}
		try {
		System.out.println(" Object value.. "+ob[4]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block... ");
		}
	}
}