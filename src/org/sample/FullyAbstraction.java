package org.sample;

public class FullyAbstraction implements Abstract{

	@Override
	public void deposit() {
		System.out.println("Deposit is 4%");
		
	}

	@Override
	public void loan() {
		System.out.println("Loan is 10%");
		
	}

	@Override
	public void savings() {
		System.out.println("savings is 4%");
		
	}
	public static void main(String[] args) {
		
		FullyAbstraction f=new FullyAbstraction();
		f.deposit();
		f.loan();
		f.savings();
	}
	

}
