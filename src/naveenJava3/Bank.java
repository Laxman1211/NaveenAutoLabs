package naveenJava3;

public abstract class Bank {

	int amt = 100;
	final int rate = 10;
	static int loanIntRate = 5;
	
	public abstract void loan();
	
	public void credit() {
		System.out.println("Bank - Credit() ");
	}
	
	public void debit() {
		System.out.println("Bank - Debit() ");
	}
}