package naveenJava1;
public class DoubleDimensionalArray {

	public static void main(String[] args) {
		int x[][] = new int[3][3];
		
		System.out.println("lenght "+x.length);
		System.out.println("lenght "+x[0].length);
		
		x[0][0] = 1;
		x[0][1] = 2;
		x[0][2] = 3;
		
		x[1][0] = 4;
		x[1][1] = 5;
		x[1][2] = 6;
		
		x[2][0] = 7;
		x[2][1] = 8;
		x[2][2] = 9;
		
		for(int row = 0; row<x.length; row++)
		{
			for(int col = 0; col<x.length; col++) {
				System.out.print(x[row][col]+" ");
			}
			System.out.println();
		}
	}
}