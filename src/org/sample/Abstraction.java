package org.sample;

//Normal class

public class Abstraction extends PartialAbstraction{

	@Override
	public void savings() {
		System.out.println("Saving 8%");
		
	}

	@Override
	public void loan() {
		System.out.println("Loan 2%");
		
	}

	@Override
	public void FD() {
		System.out.println("FD 6%");
		
	}
	
	public static void main(String[] args) {
		
		Abstraction a= new Abstraction();
		a.deposit();
		a.loan();
		a.FD();
		a.savings();
	}
	
	
	

}
