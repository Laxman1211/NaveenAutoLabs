package naveenJava2;

public class WrapperExample {

	public static void main(String[] args) {

		// String to Int conversion 
		String s = "900";
		int a = Integer.parseInt(s);  //parseInt
		System.out.println(a); 

		// String to Double 
		String sd = "98.09"; 
		double d = Double.parseDouble(sd);
		System.out.println(d);
		
		// String to boolean 
		String sb = "true"; 
		boolean b = Boolean.parseBoolean(sb); 
		System.out.println(b); 
		
		// Int to String 
		int j = 200;
		System.out.println(j+20);
		String si = String.valueOf(j);
		System.out.println(si);
		
		// NumberFormatException: For input string: "100A" 
		String u = "100A";
		Integer.parseInt(u);
		
	}
}