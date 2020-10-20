package oopsConcept;

public class HsbcBank implements USBank {

	public void credit() {
		System.out.println("Hsbc - credit");
	}
	
	public void dedit() {
		System.out.println("Hsbc - Debit");
	}
	
	public void transferMoney() {
		System.out.println("Hsbc - transfer Money");
	}
	
	public void edu_Loan() {
		System.out.println("Hsbc - Edu Loan");
	}
	
	public void car_Loan() {
		System.out.println("Hsbc - Car Loan");
	}
	// Brazil interface method
	public void mutual_funds() {
		System.out.println("Hsbc - mutual_funds ");
	}

} 