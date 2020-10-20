package oopsConcept; 

public class TestBank { 

	public static void main(String[] args) {
	
		HsbcBank hs = new HsbcBank();
		hs.credit();
		hs.dedit();
		hs.transferMoney();
		hs.car_Loan();
		hs.edu_Loan();
	
		System.out.println(" *********** "); 
		
		USBank b = new HsbcBank();
		b.credit();
		b.dedit();
		b.transferMoney();
		// b.edu_Loan(); // error, not possible 
		// b.mutual_funds(); // error, not possible 
	} 
} 