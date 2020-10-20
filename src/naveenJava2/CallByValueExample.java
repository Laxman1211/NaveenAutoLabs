package naveenJava2;
public class CallByValueExample {
	int p, q;
	public static void main(String[] args) {
		
		CallByValueExample obj = new CallByValueExample();
		int x = 10;	
		int y = 20;	
		
		obj.testSum(x,y);	// call by value or pass by value
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);		}
	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;		}
	
	public void swap(CallByValueExample t)	{ 	// Call by Ref 
		int temp;
		temp = t.p;
		t.p = 60;
		t.q = temp; 	}
}