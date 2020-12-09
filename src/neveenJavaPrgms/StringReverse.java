package neveenJavaPrgms;
public class StringReverse {

	public static void main(String[] args) {
		// 1st way 
		/*String s = "Hello";
		String rev=null;
		for (int i = s.length() - 1; i >= 0; i--) {			
			rev = rev + s.charAt(i);
			System.out.print(s.charAt(i));
		}
		// System.out.println();
*/	

		// 2nd way 
		String str = "tutorialspoint";
	     char[] ch = str.toCharArray();
	     for (int i = ch.length-1;i >= 0; i--) 
	     System.out.print(ch[i]);	
	}
}